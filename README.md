# Prelude Java API Library

<!-- x-release-please-start-version -->

[![Maven Central](https://img.shields.io/maven-central/v/so.prelude.sdk/prelude-java)](https://central.sonatype.com/artifact/so.prelude.sdk/prelude-java/0.1.0)

<!-- x-release-please-end -->

The Prelude Java SDK provides convenient access to the Prelude REST API from applications written in Java.

It is generated with [Stainless](https://www.stainlessapi.com/).

The REST API documentation can be found on [docs.prelude.so](https://docs.prelude.so).

## Installation

<!-- x-release-please-start-version -->

### Gradle

```kotlin
implementation("so.prelude.sdk:prelude-java:0.1.0")
```

### Maven

```xml
<dependency>
    <groupId>so.prelude.sdk</groupId>
    <artifactId>prelude-java</artifactId>
    <version>0.1.0</version>
</dependency>
```

<!-- x-release-please-end -->

## Requirements

This library requires Java 8 or later.

## Usage

### Configure the client

Use `PreludeOkHttpClient.builder()` to configure the client. At a minimum you need to set `.apiToken()`:

```java
import so.prelude.sdk.client.PreludeClient;
import so.prelude.sdk.client.okhttp.PreludeOkHttpClient;

PreludeClient client = PreludeOkHttpClient.builder()
    .apiToken("My API Token")
    .build();
```

Alternately, set the environment with `API_TOKEN`, and use `PreludeOkHttpClient.fromEnv()` to read from the environment.

```java
import so.prelude.sdk.client.PreludeClient;
import so.prelude.sdk.client.okhttp.PreludeOkHttpClient;

PreludeClient client = PreludeOkHttpClient.fromEnv();

// Note: you can also call fromEnv() from the client builder, for example if you need to set additional properties
PreludeClient client = PreludeOkHttpClient.builder()
    .fromEnv()
    // ... set properties on the builder
    .build();
```

| Property | Environment variable | Required | Default value |
| -------- | -------------------- | -------- | ------------- |
| apiToken | `API_TOKEN`          | true     | —             |

Read the documentation for more configuration options.

---

### Example: creating a resource

To create a new verification, first use the `VerificationCreateParams` builder to specify attributes, then pass that to the `create` method of the `verification` service.

```java
import so.prelude.sdk.models.VerificationCreateParams;
import so.prelude.sdk.models.VerificationCreateResponse;

VerificationCreateParams params = VerificationCreateParams.builder()
    .target(VerificationCreateParams.Target.builder()
        .type(VerificationCreateParams.Target.Type.PHONE_NUMBER)
        .value("+30123456789")
        .build())
    .build();
VerificationCreateResponse verification = client.verification().create(params);
```

---

## Requests

### Parameters and bodies

To make a request to the Prelude API, you generally build an instance of the appropriate `Params` class.

In [Example: creating a resource](#example-creating-a-resource) above, we used the `VerificationCreateParams.builder()` to pass to the `create` method of the `verification` service.

Sometimes, the API may support other properties that are not yet supported in the Java SDK types. In that case, you can attach them using the `putAdditionalProperty` method.

```java
import so.prelude.sdk.core.JsonValue;
import so.prelude.sdk.models.VerificationCreateParams;

VerificationCreateParams params = VerificationCreateParams.builder()
    // ... normal properties
    .putAdditionalProperty("secret_param", JsonValue.from("4242"))
    .build();
```

## Responses

### Response validation

When receiving a response, the Prelude Java SDK will deserialize it into instances of the typed model classes. In rare cases, the API may return a response property that doesn't match the expected Java type. If you directly access the mistaken property, the SDK will throw an unchecked `PreludeInvalidDataException` at runtime. If you would prefer to check in advance that that response is completely well-typed, call `.validate()` on the returned model.

```java
import so.prelude.sdk.models.VerificationCreateResponse;

VerificationCreateResponse verification = client.verification().create().validate();
```

### Response properties as JSON

In rare cases, you may want to access the underlying JSON value for a response property rather than using the typed version provided by this SDK. Each model property has a corresponding JSON version, with an underscore before the method name, which returns a `JsonField` value.

```java
import java.util.Optional;
import so.prelude.sdk.core.JsonField;

JsonField field = responseObj._field();

if (field.isMissing()) {
  // Value was not specified in the JSON response
} else if (field.isNull()) {
  // Value was provided as a literal null
} else {
  // See if value was provided as a string
  Optional<String> jsonString = field.asString();

  // If the value given by the API did not match the shape that the SDK expects
  // you can deserialise into a custom type
  MyClass myObj = responseObj._field().asUnknown().orElseThrow().convert(MyClass.class);
}
```

### Additional model properties

Sometimes, the server response may include additional properties that are not yet available in this library's types. You can access them using the model's `_additionalProperties` method:

```java
import so.prelude.sdk.core.JsonValue;

JsonValue secret = transactionalSendResponse._additionalProperties().get("secret_field");
```

---

---

## Error handling

This library throws exceptions in a single hierarchy for easy handling:

- **`PreludeException`** - Base exception for all exceptions

- **`PreludeServiceException`** - HTTP errors with a well-formed response body we were able to parse. The exception message and the `.debuggingRequestId()` will be set by the server.

  | 400    | BadRequestException           |
  | ------ | ----------------------------- |
  | 401    | AuthenticationException       |
  | 403    | PermissionDeniedException     |
  | 404    | NotFoundException             |
  | 422    | UnprocessableEntityException  |
  | 429    | RateLimitException            |
  | 5xx    | InternalServerException       |
  | others | UnexpectedStatusCodeException |

- **`PreludeIoException`** - I/O networking errors
- **`PreludeInvalidDataException`** - any other exceptions on the client side, e.g.:
  - We failed to serialize the request body
  - We failed to parse the response body (has access to response code and body)

## Network options

### Retries

Requests that experience certain errors are automatically retried 2 times by default, with a short exponential backoff. Connection errors (for example, due to a network connectivity problem), 408 Request Timeout, 409 Conflict, 429 Rate Limit, and >=500 Internal errors will all be retried by default. You can provide a `maxRetries` on the client builder to configure this:

```java
import so.prelude.sdk.client.PreludeClient;
import so.prelude.sdk.client.okhttp.PreludeOkHttpClient;

PreludeClient client = PreludeOkHttpClient.builder()
    .fromEnv()
    .maxRetries(4)
    .build();
```

### Timeouts

Requests time out after 1 minute by default. You can configure this on the client builder:

```java
import java.time.Duration;
import so.prelude.sdk.client.PreludeClient;
import so.prelude.sdk.client.okhttp.PreludeOkHttpClient;

PreludeClient client = PreludeOkHttpClient.builder()
    .fromEnv()
    .timeout(Duration.ofSeconds(30))
    .build();
```

### Proxies

Requests can be routed through a proxy. You can configure this on the client builder:

```java
import java.net.InetSocketAddress;
import java.net.Proxy;
import so.prelude.sdk.client.PreludeClient;
import so.prelude.sdk.client.okhttp.PreludeOkHttpClient;

PreludeClient client = PreludeOkHttpClient.builder()
    .fromEnv()
    .proxy(new Proxy(Proxy.Type.HTTP, new InetSocketAddress("example.com", 8080)))
    .build();
```

## Making custom/undocumented requests

This library is typed for convenient access to the documented API. If you need to access undocumented params or response properties, the library can still be used.

### Undocumented request params

To make requests using undocumented parameters, you can provide or override parameters on the params object while building it.

```java
FooCreateParams address = FooCreateParams.builder()
    .id("my_id")
    .putAdditionalProperty("secret_prop", JsonValue.from("hello"))
    .build();
```

### Undocumented response properties

To access undocumented response properties, you can use `res._additionalProperties()` on a response object to get a map of untyped fields of type `Map<String, JsonValue>`. You can then access fields like `._additionalProperties().get("secret_prop").asString()` or use other helpers defined on the `JsonValue` class to extract it to a desired type.

## Logging

We use the standard [OkHttp logging interceptor](https://github.com/square/okhttp/tree/master/okhttp-logging-interceptor).

You can enable logging by setting the environment variable `PRELUDE_LOG` to `info`.

```sh
$ export PRELUDE_LOG=info
```

Or to `debug` for more verbose logging.

```sh
$ export PRELUDE_LOG=debug
```

## Semantic versioning

This package generally follows [SemVer](https://semver.org/spec/v2.0.0.html) conventions, though certain backwards-incompatible changes may be released as minor versions:

1. Changes to library internals which are technically public but not intended or documented for external use. _(Please open a GitHub issue to let us know if you are relying on such internals.)_
2. Changes that we do not expect to impact the vast majority of users in practice.

We take backwards-compatibility seriously and work hard to ensure you can rely on a smooth upgrade experience.

We are keen for your feedback; please open an [issue](https://www.github.com/prelude-so/java-sdk/issues) with questions, bugs, or suggestions.
