# Prelude Java API Library

<!-- x-release-please-start-version -->

[![Maven Central](https://img.shields.io/maven-central/v/so.prelude.sdk/prelude-java)](https://central.sonatype.com/artifact/so.prelude.sdk/prelude-java/0.1.0)
[![javadoc](https://javadoc.io/badge2/so.prelude.sdk/prelude-java/0.1.0/javadoc.svg)](https://javadoc.io/doc/so.prelude.sdk/prelude-java/0.1.0)

<!-- x-release-please-end -->

The Prelude Java SDK provides convenient access to the Prelude REST API from applications written in Java.

It is generated with [Stainless](https://www.stainless.com/).

The REST API documentation can be found on [docs.prelude.so](https://docs.prelude.so). Javadocs are also available on [javadoc.io](https://javadoc.io/doc/so.prelude.sdk/prelude-java/0.1.0).

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

```java
import so.prelude.sdk.client.PreludeClient;
import so.prelude.sdk.client.okhttp.PreludeOkHttpClient;
import so.prelude.sdk.models.VerificationCreateParams;
import so.prelude.sdk.models.VerificationCreateResponse;

// Configures using the `API_TOKEN` environment variable
PreludeClient client = PreludeOkHttpClient.fromEnv();

VerificationCreateParams params = VerificationCreateParams.builder()
    .target(VerificationCreateParams.Target.builder()
        .type(VerificationCreateParams.Target.Type.PHONE_NUMBER)
        .value("+30123456789")
        .build())
    .build();
VerificationCreateResponse verification = client.verification().create(params);
```

## Client configuration

Configure the client using environment variables:

```java
import so.prelude.sdk.client.PreludeClient;
import so.prelude.sdk.client.okhttp.PreludeOkHttpClient;

// Configures using the `API_TOKEN` environment variable
PreludeClient client = PreludeOkHttpClient.fromEnv();
```

Or manually:

```java
import so.prelude.sdk.client.PreludeClient;
import so.prelude.sdk.client.okhttp.PreludeOkHttpClient;

PreludeClient client = PreludeOkHttpClient.builder()
    .apiToken("My API Token")
    .build();
```

Or using a combination of the two approaches:

```java
import so.prelude.sdk.client.PreludeClient;
import so.prelude.sdk.client.okhttp.PreludeOkHttpClient;

PreludeClient client = PreludeOkHttpClient.builder()
    // Configures using the `API_TOKEN` environment variable
    .fromEnv()
    .apiToken("My API Token")
    .build();
```

See this table for the available options:

| Setter     | Environment variable | Required | Default value |
| ---------- | -------------------- | -------- | ------------- |
| `apiToken` | `API_TOKEN`          | true     | -             |

> [!TIP]
> Don't create more than one client in the same application. Each client has a connection pool and
> thread pools, which are more efficient to share between requests.

## Requests and responses

To send a request to the Prelude API, build an instance of some `Params` class and pass it to the corresponding client method. When the response is received, it will be deserialized into an instance of a Java class.

For example, `client.verification().create(...)` should be called with an instance of `VerificationCreateParams`, and it will return an instance of `VerificationCreateResponse`.

## Immutability

Each class in the SDK has an associated [builder](https://blogs.oracle.com/javamagazine/post/exploring-joshua-blochs-builder-design-pattern-in-java) or factory method for constructing it.

Each class is [immutable](https://docs.oracle.com/javase/tutorial/essential/concurrency/immutable.html) once constructed. If the class has an associated builder, then it has a `toBuilder()` method, which can be used to convert it back to a builder for making a modified copy.

Because each class is immutable, builder modification will _never_ affect already built class instances.

## Asynchronous execution

The default client is synchronous. To switch to asynchronous execution, call the `async()` method:

```java
import java.util.concurrent.CompletableFuture;
import so.prelude.sdk.client.PreludeClient;
import so.prelude.sdk.client.okhttp.PreludeOkHttpClient;
import so.prelude.sdk.models.VerificationCreateParams;
import so.prelude.sdk.models.VerificationCreateResponse;

// Configures using the `API_TOKEN` environment variable
PreludeClient client = PreludeOkHttpClient.fromEnv();

VerificationCreateParams params = VerificationCreateParams.builder()
    .target(VerificationCreateParams.Target.builder()
        .type(VerificationCreateParams.Target.Type.PHONE_NUMBER)
        .value("+30123456789")
        .build())
    .build();
CompletableFuture<VerificationCreateResponse> verification = client.async().verification().create(params);
```

Or create an asynchronous client from the beginning:

```java
import java.util.concurrent.CompletableFuture;
import so.prelude.sdk.client.PreludeClientAsync;
import so.prelude.sdk.client.okhttp.PreludeOkHttpClientAsync;
import so.prelude.sdk.models.VerificationCreateParams;
import so.prelude.sdk.models.VerificationCreateResponse;

// Configures using the `API_TOKEN` environment variable
PreludeClientAsync client = PreludeOkHttpClientAsync.fromEnv();

VerificationCreateParams params = VerificationCreateParams.builder()
    .target(VerificationCreateParams.Target.builder()
        .type(VerificationCreateParams.Target.Type.PHONE_NUMBER)
        .value("+30123456789")
        .build())
    .build();
CompletableFuture<VerificationCreateResponse> verification = client.verification().create(params);
```

The asynchronous client supports the same options as the synchronous one, except most methods return `CompletableFuture`s.

## Raw responses

The SDK defines methods that deserialize responses into instances of Java classes. However, these methods don't provide access to the response headers, status code, or the raw response body.

To access this data, prefix any HTTP method call on a client or service with `withRawResponse()`:

```java
import so.prelude.sdk.core.http.Headers;
import so.prelude.sdk.core.http.HttpResponseFor;
import so.prelude.sdk.models.VerificationCreateParams;
import so.prelude.sdk.models.VerificationCreateResponse;

VerificationCreateParams params = VerificationCreateParams.builder()
    .target(VerificationCreateParams.Target.builder()
        .type(VerificationCreateParams.Target.Type.PHONE_NUMBER)
        .value("+30123456789")
        .build())
    .build();
HttpResponseFor<VerificationCreateResponse> verification = client.verification().withRawResponse().create(params);

int statusCode = verification.statusCode();
Headers headers = verification.headers();
```

You can still deserialize the response into an instance of a Java class if needed:

```java
import so.prelude.sdk.models.VerificationCreateResponse;

VerificationCreateResponse parsedVerification = verification.parse();
```

## Error handling

The SDK throws custom unchecked exception types:

- [`PreludeServiceException`](prelude-java-core/src/main/kotlin/so/prelude/sdk/errors/PreludeServiceException.kt): Base class for HTTP errors. See this table for which exception subclass is thrown for each HTTP status code:

  | Status | Exception                       |
  | ------ | ------------------------------- |
  | 400    | `BadRequestException`           |
  | 401    | `AuthenticationException`       |
  | 403    | `PermissionDeniedException`     |
  | 404    | `NotFoundException`             |
  | 422    | `UnprocessableEntityException`  |
  | 429    | `RateLimitException`            |
  | 5xx    | `InternalServerException`       |
  | others | `UnexpectedStatusCodeException` |

- [`PreludeIoException`](prelude-java-core/src/main/kotlin/so/prelude/sdk/errors/PreludeIoException.kt): I/O networking errors.

- [`PreludeInvalidDataException`](prelude-java-core/src/main/kotlin/so/prelude/sdk/errors/PreludeInvalidDataException.kt): Failure to interpret successfully parsed data. For example, when accessing a property that's supposed to be required, but the API unexpectedly omitted it from the response.

- [`PreludeException`](prelude-java-core/src/main/kotlin/so/prelude/sdk/errors/PreludeException.kt): Base class for all exceptions. Most errors will result in one of the previously mentioned ones, but completely generic errors may be thrown using the base class.

## Logging

The SDK uses the standard [OkHttp logging interceptor](https://github.com/square/okhttp/tree/master/okhttp-logging-interceptor).

Enable logging by setting the `PRELUDE_LOG` environment variable to `info`:

```sh
$ export PRELUDE_LOG=info
```

Or to `debug` for more verbose logging:

```sh
$ export PRELUDE_LOG=debug
```

## Network options

### Retries

The SDK automatically retries 2 times by default, with a short exponential backoff.

Only the following error types are retried:

- Connection errors (for example, due to a network connectivity problem)
- 408 Request Timeout
- 409 Conflict
- 429 Rate Limit
- 5xx Internal

The API may also explicitly instruct the SDK to retry or not retry a response.

To set a custom number of retries, configure the client using the `maxRetries` method:

```java
import so.prelude.sdk.client.PreludeClient;
import so.prelude.sdk.client.okhttp.PreludeOkHttpClient;

PreludeClient client = PreludeOkHttpClient.builder()
    .fromEnv()
    .maxRetries(4)
    .build();
```

### Timeouts

Requests time out after 1 minute by default.

To set a custom timeout, configure the method call using the `timeout` method:

```java
import so.prelude.sdk.models.VerificationCreateParams;
import so.prelude.sdk.models.VerificationCreateResponse;

VerificationCreateResponse verification = client.verification().create(
  params, RequestOptions.builder().timeout(Duration.ofSeconds(30)).build()
);
```

Or configure the default for all method calls at the client level:

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

To route requests through a proxy, configure the client using the `proxy` method:

```java
import java.net.InetSocketAddress;
import java.net.Proxy;
import so.prelude.sdk.client.PreludeClient;
import so.prelude.sdk.client.okhttp.PreludeOkHttpClient;

PreludeClient client = PreludeOkHttpClient.builder()
    .fromEnv()
    .proxy(new Proxy(
      Proxy.Type.HTTP, new InetSocketAddress(
        "https://example.com", 8080
      )
    ))
    .build();
```

## Undocumented API functionality

The SDK is typed for convenient usage of the documented API. However, it also supports working with undocumented or not yet supported parts of the API.

### Parameters

To set undocumented parameters, call the `putAdditionalHeader`, `putAdditionalQueryParam`, or `putAdditionalBodyProperty` methods on any `Params` class:

```java
import so.prelude.sdk.core.JsonValue;
import so.prelude.sdk.models.VerificationCreateParams;

VerificationCreateParams params = VerificationCreateParams.builder()
    .putAdditionalHeader("Secret-Header", "42")
    .putAdditionalQueryParam("secret_query_param", "42")
    .putAdditionalBodyProperty("secretProperty", JsonValue.from("42"))
    .build();
```

These can be accessed on the built object later using the `_additionalHeaders()`, `_additionalQueryParams()`, and `_additionalBodyProperties()` methods.

To set undocumented parameters on _nested_ headers, query params, or body classes, call the `putAdditionalProperty` method on the nested class:

```java
import so.prelude.sdk.core.JsonValue;
import so.prelude.sdk.models.VerificationCreateParams;

VerificationCreateParams params = VerificationCreateParams.builder()
    .target(VerificationCreateParams.Target.builder()
        .putAdditionalProperty("secretProperty", JsonValue.from("42"))
        .build())
    .build();
```

These properties can be accessed on the nested built object later using the `_additionalProperties()` method.

To set a documented parameter or property to an undocumented or not yet supported _value_, pass a [`JsonValue`](prelude-java-core/src/main/kotlin/so/prelude/sdk/core/JsonValue.kt) object to its setter:

```java
import so.prelude.sdk.core.JsonValue;
import so.prelude.sdk.models.VerificationCreateParams;

VerificationCreateParams params = VerificationCreateParams.builder()
    .target(JsonValue.from(42))
    .build();
```

### Response properties

To access undocumented response properties, call the `_additionalProperties()` method:

```java
import java.util.Map;
import so.prelude.sdk.core.JsonValue;

Map<String, JsonValue> additionalProperties = client.verification().create(params)._additionalProperties();
JsonValue secretPropertyValue = additionalProperties.get("secretProperty");

String result = secretPropertyValue.accept(new JsonValue.Visitor<>() {
    @Override
    public String visitNull() {
        return "It's null!";
    }

    @Override
    public String visitBoolean(boolean value) {
        return "It's a boolean!";
    }

    @Override
    public String visitNumber(Number value) {
        return "It's a number!";
    }

    // Other methods include `visitMissing`, `visitString`, `visitArray`, and `visitObject`
    // The default implementation of each unimplemented method delegates to `visitDefault`, which throws by default, but can also be overridden
});
```

To access a property's raw JSON value, which may be undocumented, call its `_` prefixed method:

```java
import java.util.Optional;
import so.prelude.sdk.core.JsonField;
import so.prelude.sdk.models.VerificationCreateParams;

JsonField<VerificationCreateParams.Target> target = client.verification().create(params)._target();

if (target.isMissing()) {
  // The property is absent from the JSON response
} else if (target.isNull()) {
  // The property was set to literal null
} else {
  // Check if value was provided as a string
  // Other methods include `asNumber()`, `asBoolean()`, etc.
  Optional<String> jsonString = target.asString();

  // Try to deserialize into a custom type
  MyClass myObject = target.asUnknown().orElseThrow().convert(MyClass.class);
}
```

### Response validation

In rare cases, the API may return a response that doesn't match the expected type. For example, the SDK may expect a property to contain a `String`, but the API could return something else.

By default, the SDK will not throw an exception in this case. It will throw [`PreludeInvalidDataException`](prelude-java-core/src/main/kotlin/so/prelude/sdk/errors/PreludeInvalidDataException.kt) only if you directly access the property.

If you would prefer to check that the response is completely well-typed upfront, then either call `validate()`:

```java
import so.prelude.sdk.models.VerificationCreateResponse;

VerificationCreateResponse verification = client.verification().create(params).validate();
```

Or configure the method call to validate the response using the `responseValidation` method:

```java
import so.prelude.sdk.models.VerificationCreateParams;
import so.prelude.sdk.models.VerificationCreateResponse;

VerificationCreateResponse verification = client.verification().create(
  params, RequestOptions.builder().responseValidation(true).build()
);
```

Or configure the default for all method calls at the client level:

```java
import so.prelude.sdk.client.PreludeClient;
import so.prelude.sdk.client.okhttp.PreludeOkHttpClient;

PreludeClient client = PreludeOkHttpClient.builder()
    .fromEnv()
    .responseValidation(true)
    .build();
```

## FAQ

### Why don't you use plain `enum` classes?

Java `enum` classes are not trivially [forwards compatible](https://www.stainless.com/blog/making-java-enums-forwards-compatible). Using them in the SDK could cause runtime exceptions if the API is updated to respond with a new enum value.

### Why do you represent fields using `JsonField<T>` instead of just plain `T`?

Using `JsonField<T>` enables a few features:

- Allowing usage of [undocumented API functionality](#undocumented-api-functionality)
- Lazily [validating the API response against the expected shape](#response-validation)
- Representing absent vs explicitly null values

### Why don't you use [`data` classes](https://kotlinlang.org/docs/data-classes.html)?

It is not [backwards compatible to add new fields to a data class](https://kotlinlang.org/docs/api-guidelines-backward-compatibility.html#avoid-using-data-classes-in-your-api) and we don't want to introduce a breaking change every time we add a field to a class.

### Why don't you use checked exceptions?

Checked exceptions are widely considered a mistake in the Java programming language. In fact, they were omitted from Kotlin for this reason.

Checked exceptions:

- Are verbose to handle
- Encourage error handling at the wrong level of abstraction, where nothing can be done about the error
- Are tedious to propagate due to the [function coloring problem](https://journal.stuffwithstuff.com/2015/02/01/what-color-is-your-function)
- Don't play well with lambdas (also due to the function coloring problem)

## Semantic versioning

This package generally follows [SemVer](https://semver.org/spec/v2.0.0.html) conventions, though certain backwards-incompatible changes may be released as minor versions:

1. Changes to library internals which are technically public but not intended or documented for external use. _(Please open a GitHub issue to let us know if you are relying on such internals.)_
2. Changes that we do not expect to impact the vast majority of users in practice.

We take backwards-compatibility seriously and work hard to ensure you can rely on a smooth upgrade experience.

We are keen for your feedback; please open an [issue](https://www.github.com/prelude-so/java-sdk/issues) with questions, bugs, or suggestions.
