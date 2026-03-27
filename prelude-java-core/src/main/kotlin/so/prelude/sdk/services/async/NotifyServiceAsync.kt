// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.services.async

import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import so.prelude.sdk.core.ClientOptions
import so.prelude.sdk.core.RequestOptions
import so.prelude.sdk.core.http.HttpResponseFor
import so.prelude.sdk.models.NotifyGetSubscriptionConfigParams
import so.prelude.sdk.models.NotifyGetSubscriptionConfigResponse
import so.prelude.sdk.models.NotifyGetSubscriptionPhoneNumberParams
import so.prelude.sdk.models.NotifyGetSubscriptionPhoneNumberResponse
import so.prelude.sdk.models.NotifyListSubscriptionConfigsParams
import so.prelude.sdk.models.NotifyListSubscriptionConfigsResponse
import so.prelude.sdk.models.NotifyListSubscriptionPhoneNumberEventsParams
import so.prelude.sdk.models.NotifyListSubscriptionPhoneNumberEventsResponse
import so.prelude.sdk.models.NotifyListSubscriptionPhoneNumbersParams
import so.prelude.sdk.models.NotifyListSubscriptionPhoneNumbersResponse
import so.prelude.sdk.models.NotifySendBatchParams
import so.prelude.sdk.models.NotifySendBatchResponse
import so.prelude.sdk.models.NotifySendParams
import so.prelude.sdk.models.NotifySendResponse

/** Send transactional and marketing messages with compliance enforcement. */
interface NotifyServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): NotifyServiceAsync

    /** Retrieve a specific subscription management configuration by its ID. */
    fun getSubscriptionConfig(
        configId: String
    ): CompletableFuture<NotifyGetSubscriptionConfigResponse> =
        getSubscriptionConfig(configId, NotifyGetSubscriptionConfigParams.none())

    /** @see getSubscriptionConfig */
    fun getSubscriptionConfig(
        configId: String,
        params: NotifyGetSubscriptionConfigParams = NotifyGetSubscriptionConfigParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NotifyGetSubscriptionConfigResponse> =
        getSubscriptionConfig(params.toBuilder().configId(configId).build(), requestOptions)

    /** @see getSubscriptionConfig */
    fun getSubscriptionConfig(
        configId: String,
        params: NotifyGetSubscriptionConfigParams = NotifyGetSubscriptionConfigParams.none(),
    ): CompletableFuture<NotifyGetSubscriptionConfigResponse> =
        getSubscriptionConfig(configId, params, RequestOptions.none())

    /** @see getSubscriptionConfig */
    fun getSubscriptionConfig(
        params: NotifyGetSubscriptionConfigParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NotifyGetSubscriptionConfigResponse>

    /** @see getSubscriptionConfig */
    fun getSubscriptionConfig(
        params: NotifyGetSubscriptionConfigParams
    ): CompletableFuture<NotifyGetSubscriptionConfigResponse> =
        getSubscriptionConfig(params, RequestOptions.none())

    /** @see getSubscriptionConfig */
    fun getSubscriptionConfig(
        configId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<NotifyGetSubscriptionConfigResponse> =
        getSubscriptionConfig(configId, NotifyGetSubscriptionConfigParams.none(), requestOptions)

    /**
     * Retrieve the current subscription status for a specific phone number within a subscription
     * configuration.
     */
    fun getSubscriptionPhoneNumber(
        phoneNumber: String,
        params: NotifyGetSubscriptionPhoneNumberParams,
    ): CompletableFuture<NotifyGetSubscriptionPhoneNumberResponse> =
        getSubscriptionPhoneNumber(phoneNumber, params, RequestOptions.none())

    /** @see getSubscriptionPhoneNumber */
    fun getSubscriptionPhoneNumber(
        phoneNumber: String,
        params: NotifyGetSubscriptionPhoneNumberParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NotifyGetSubscriptionPhoneNumberResponse> =
        getSubscriptionPhoneNumber(
            params.toBuilder().phoneNumber(phoneNumber).build(),
            requestOptions,
        )

    /** @see getSubscriptionPhoneNumber */
    fun getSubscriptionPhoneNumber(
        params: NotifyGetSubscriptionPhoneNumberParams
    ): CompletableFuture<NotifyGetSubscriptionPhoneNumberResponse> =
        getSubscriptionPhoneNumber(params, RequestOptions.none())

    /** @see getSubscriptionPhoneNumber */
    fun getSubscriptionPhoneNumber(
        params: NotifyGetSubscriptionPhoneNumberParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NotifyGetSubscriptionPhoneNumberResponse>

    /**
     * Retrieve a paginated list of subscription management configurations for your account.
     *
     * Each configuration represents a subscription management setup with phone numbers for
     * receiving opt-out/opt-in requests and a callback URL for webhook events.
     */
    fun listSubscriptionConfigs(): CompletableFuture<NotifyListSubscriptionConfigsResponse> =
        listSubscriptionConfigs(NotifyListSubscriptionConfigsParams.none())

    /** @see listSubscriptionConfigs */
    fun listSubscriptionConfigs(
        params: NotifyListSubscriptionConfigsParams = NotifyListSubscriptionConfigsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NotifyListSubscriptionConfigsResponse>

    /** @see listSubscriptionConfigs */
    fun listSubscriptionConfigs(
        params: NotifyListSubscriptionConfigsParams = NotifyListSubscriptionConfigsParams.none()
    ): CompletableFuture<NotifyListSubscriptionConfigsResponse> =
        listSubscriptionConfigs(params, RequestOptions.none())

    /** @see listSubscriptionConfigs */
    fun listSubscriptionConfigs(
        requestOptions: RequestOptions
    ): CompletableFuture<NotifyListSubscriptionConfigsResponse> =
        listSubscriptionConfigs(NotifyListSubscriptionConfigsParams.none(), requestOptions)

    /**
     * Retrieve a paginated list of subscription events (status changes) for a specific phone number
     * within a subscription configuration.
     *
     * Events are ordered by timestamp in descending order (most recent first).
     */
    fun listSubscriptionPhoneNumberEvents(
        phoneNumber: String,
        params: NotifyListSubscriptionPhoneNumberEventsParams,
    ): CompletableFuture<NotifyListSubscriptionPhoneNumberEventsResponse> =
        listSubscriptionPhoneNumberEvents(phoneNumber, params, RequestOptions.none())

    /** @see listSubscriptionPhoneNumberEvents */
    fun listSubscriptionPhoneNumberEvents(
        phoneNumber: String,
        params: NotifyListSubscriptionPhoneNumberEventsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NotifyListSubscriptionPhoneNumberEventsResponse> =
        listSubscriptionPhoneNumberEvents(
            params.toBuilder().phoneNumber(phoneNumber).build(),
            requestOptions,
        )

    /** @see listSubscriptionPhoneNumberEvents */
    fun listSubscriptionPhoneNumberEvents(
        params: NotifyListSubscriptionPhoneNumberEventsParams
    ): CompletableFuture<NotifyListSubscriptionPhoneNumberEventsResponse> =
        listSubscriptionPhoneNumberEvents(params, RequestOptions.none())

    /** @see listSubscriptionPhoneNumberEvents */
    fun listSubscriptionPhoneNumberEvents(
        params: NotifyListSubscriptionPhoneNumberEventsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NotifyListSubscriptionPhoneNumberEventsResponse>

    /**
     * Retrieve a paginated list of phone numbers and their subscription statuses for a specific
     * subscription configuration.
     *
     * You can optionally filter by subscription state (SUB or UNSUB).
     */
    fun listSubscriptionPhoneNumbers(
        configId: String
    ): CompletableFuture<NotifyListSubscriptionPhoneNumbersResponse> =
        listSubscriptionPhoneNumbers(configId, NotifyListSubscriptionPhoneNumbersParams.none())

    /** @see listSubscriptionPhoneNumbers */
    fun listSubscriptionPhoneNumbers(
        configId: String,
        params: NotifyListSubscriptionPhoneNumbersParams =
            NotifyListSubscriptionPhoneNumbersParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NotifyListSubscriptionPhoneNumbersResponse> =
        listSubscriptionPhoneNumbers(params.toBuilder().configId(configId).build(), requestOptions)

    /** @see listSubscriptionPhoneNumbers */
    fun listSubscriptionPhoneNumbers(
        configId: String,
        params: NotifyListSubscriptionPhoneNumbersParams =
            NotifyListSubscriptionPhoneNumbersParams.none(),
    ): CompletableFuture<NotifyListSubscriptionPhoneNumbersResponse> =
        listSubscriptionPhoneNumbers(configId, params, RequestOptions.none())

    /** @see listSubscriptionPhoneNumbers */
    fun listSubscriptionPhoneNumbers(
        params: NotifyListSubscriptionPhoneNumbersParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NotifyListSubscriptionPhoneNumbersResponse>

    /** @see listSubscriptionPhoneNumbers */
    fun listSubscriptionPhoneNumbers(
        params: NotifyListSubscriptionPhoneNumbersParams
    ): CompletableFuture<NotifyListSubscriptionPhoneNumbersResponse> =
        listSubscriptionPhoneNumbers(params, RequestOptions.none())

    /** @see listSubscriptionPhoneNumbers */
    fun listSubscriptionPhoneNumbers(
        configId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<NotifyListSubscriptionPhoneNumbersResponse> =
        listSubscriptionPhoneNumbers(
            configId,
            NotifyListSubscriptionPhoneNumbersParams.none(),
            requestOptions,
        )

    /**
     * Send transactional and marketing messages to your users via SMS, RCS and WhatsApp with
     * automatic compliance enforcement.
     */
    fun send(params: NotifySendParams): CompletableFuture<NotifySendResponse> =
        send(params, RequestOptions.none())

    /** @see send */
    fun send(
        params: NotifySendParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NotifySendResponse>

    /** Send the same message to multiple recipients in a single request. */
    fun sendBatch(params: NotifySendBatchParams): CompletableFuture<NotifySendBatchResponse> =
        sendBatch(params, RequestOptions.none())

    /** @see sendBatch */
    fun sendBatch(
        params: NotifySendBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NotifySendBatchResponse>

    /**
     * A view of [NotifyServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): NotifyServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v2/notify/management/subscriptions/{config_id}`,
         * but is otherwise the same as [NotifyServiceAsync.getSubscriptionConfig].
         */
        fun getSubscriptionConfig(
            configId: String
        ): CompletableFuture<HttpResponseFor<NotifyGetSubscriptionConfigResponse>> =
            getSubscriptionConfig(configId, NotifyGetSubscriptionConfigParams.none())

        /** @see getSubscriptionConfig */
        fun getSubscriptionConfig(
            configId: String,
            params: NotifyGetSubscriptionConfigParams = NotifyGetSubscriptionConfigParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NotifyGetSubscriptionConfigResponse>> =
            getSubscriptionConfig(params.toBuilder().configId(configId).build(), requestOptions)

        /** @see getSubscriptionConfig */
        fun getSubscriptionConfig(
            configId: String,
            params: NotifyGetSubscriptionConfigParams = NotifyGetSubscriptionConfigParams.none(),
        ): CompletableFuture<HttpResponseFor<NotifyGetSubscriptionConfigResponse>> =
            getSubscriptionConfig(configId, params, RequestOptions.none())

        /** @see getSubscriptionConfig */
        fun getSubscriptionConfig(
            params: NotifyGetSubscriptionConfigParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NotifyGetSubscriptionConfigResponse>>

        /** @see getSubscriptionConfig */
        fun getSubscriptionConfig(
            params: NotifyGetSubscriptionConfigParams
        ): CompletableFuture<HttpResponseFor<NotifyGetSubscriptionConfigResponse>> =
            getSubscriptionConfig(params, RequestOptions.none())

        /** @see getSubscriptionConfig */
        fun getSubscriptionConfig(
            configId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<NotifyGetSubscriptionConfigResponse>> =
            getSubscriptionConfig(
                configId,
                NotifyGetSubscriptionConfigParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get
         * /v2/notify/management/subscriptions/{config_id}/phone_numbers/{phone_number}`, but is
         * otherwise the same as [NotifyServiceAsync.getSubscriptionPhoneNumber].
         */
        fun getSubscriptionPhoneNumber(
            phoneNumber: String,
            params: NotifyGetSubscriptionPhoneNumberParams,
        ): CompletableFuture<HttpResponseFor<NotifyGetSubscriptionPhoneNumberResponse>> =
            getSubscriptionPhoneNumber(phoneNumber, params, RequestOptions.none())

        /** @see getSubscriptionPhoneNumber */
        fun getSubscriptionPhoneNumber(
            phoneNumber: String,
            params: NotifyGetSubscriptionPhoneNumberParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NotifyGetSubscriptionPhoneNumberResponse>> =
            getSubscriptionPhoneNumber(
                params.toBuilder().phoneNumber(phoneNumber).build(),
                requestOptions,
            )

        /** @see getSubscriptionPhoneNumber */
        fun getSubscriptionPhoneNumber(
            params: NotifyGetSubscriptionPhoneNumberParams
        ): CompletableFuture<HttpResponseFor<NotifyGetSubscriptionPhoneNumberResponse>> =
            getSubscriptionPhoneNumber(params, RequestOptions.none())

        /** @see getSubscriptionPhoneNumber */
        fun getSubscriptionPhoneNumber(
            params: NotifyGetSubscriptionPhoneNumberParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NotifyGetSubscriptionPhoneNumberResponse>>

        /**
         * Returns a raw HTTP response for `get /v2/notify/management/subscriptions`, but is
         * otherwise the same as [NotifyServiceAsync.listSubscriptionConfigs].
         */
        fun listSubscriptionConfigs():
            CompletableFuture<HttpResponseFor<NotifyListSubscriptionConfigsResponse>> =
            listSubscriptionConfigs(NotifyListSubscriptionConfigsParams.none())

        /** @see listSubscriptionConfigs */
        fun listSubscriptionConfigs(
            params: NotifyListSubscriptionConfigsParams =
                NotifyListSubscriptionConfigsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NotifyListSubscriptionConfigsResponse>>

        /** @see listSubscriptionConfigs */
        fun listSubscriptionConfigs(
            params: NotifyListSubscriptionConfigsParams = NotifyListSubscriptionConfigsParams.none()
        ): CompletableFuture<HttpResponseFor<NotifyListSubscriptionConfigsResponse>> =
            listSubscriptionConfigs(params, RequestOptions.none())

        /** @see listSubscriptionConfigs */
        fun listSubscriptionConfigs(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<NotifyListSubscriptionConfigsResponse>> =
            listSubscriptionConfigs(NotifyListSubscriptionConfigsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /v2/notify/management/subscriptions/{config_id}/phone_numbers/{phone_number}/events`, but
         * is otherwise the same as [NotifyServiceAsync.listSubscriptionPhoneNumberEvents].
         */
        fun listSubscriptionPhoneNumberEvents(
            phoneNumber: String,
            params: NotifyListSubscriptionPhoneNumberEventsParams,
        ): CompletableFuture<HttpResponseFor<NotifyListSubscriptionPhoneNumberEventsResponse>> =
            listSubscriptionPhoneNumberEvents(phoneNumber, params, RequestOptions.none())

        /** @see listSubscriptionPhoneNumberEvents */
        fun listSubscriptionPhoneNumberEvents(
            phoneNumber: String,
            params: NotifyListSubscriptionPhoneNumberEventsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NotifyListSubscriptionPhoneNumberEventsResponse>> =
            listSubscriptionPhoneNumberEvents(
                params.toBuilder().phoneNumber(phoneNumber).build(),
                requestOptions,
            )

        /** @see listSubscriptionPhoneNumberEvents */
        fun listSubscriptionPhoneNumberEvents(
            params: NotifyListSubscriptionPhoneNumberEventsParams
        ): CompletableFuture<HttpResponseFor<NotifyListSubscriptionPhoneNumberEventsResponse>> =
            listSubscriptionPhoneNumberEvents(params, RequestOptions.none())

        /** @see listSubscriptionPhoneNumberEvents */
        fun listSubscriptionPhoneNumberEvents(
            params: NotifyListSubscriptionPhoneNumberEventsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NotifyListSubscriptionPhoneNumberEventsResponse>>

        /**
         * Returns a raw HTTP response for `get
         * /v2/notify/management/subscriptions/{config_id}/phone_numbers`, but is otherwise the same
         * as [NotifyServiceAsync.listSubscriptionPhoneNumbers].
         */
        fun listSubscriptionPhoneNumbers(
            configId: String
        ): CompletableFuture<HttpResponseFor<NotifyListSubscriptionPhoneNumbersResponse>> =
            listSubscriptionPhoneNumbers(configId, NotifyListSubscriptionPhoneNumbersParams.none())

        /** @see listSubscriptionPhoneNumbers */
        fun listSubscriptionPhoneNumbers(
            configId: String,
            params: NotifyListSubscriptionPhoneNumbersParams =
                NotifyListSubscriptionPhoneNumbersParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NotifyListSubscriptionPhoneNumbersResponse>> =
            listSubscriptionPhoneNumbers(
                params.toBuilder().configId(configId).build(),
                requestOptions,
            )

        /** @see listSubscriptionPhoneNumbers */
        fun listSubscriptionPhoneNumbers(
            configId: String,
            params: NotifyListSubscriptionPhoneNumbersParams =
                NotifyListSubscriptionPhoneNumbersParams.none(),
        ): CompletableFuture<HttpResponseFor<NotifyListSubscriptionPhoneNumbersResponse>> =
            listSubscriptionPhoneNumbers(configId, params, RequestOptions.none())

        /** @see listSubscriptionPhoneNumbers */
        fun listSubscriptionPhoneNumbers(
            params: NotifyListSubscriptionPhoneNumbersParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NotifyListSubscriptionPhoneNumbersResponse>>

        /** @see listSubscriptionPhoneNumbers */
        fun listSubscriptionPhoneNumbers(
            params: NotifyListSubscriptionPhoneNumbersParams
        ): CompletableFuture<HttpResponseFor<NotifyListSubscriptionPhoneNumbersResponse>> =
            listSubscriptionPhoneNumbers(params, RequestOptions.none())

        /** @see listSubscriptionPhoneNumbers */
        fun listSubscriptionPhoneNumbers(
            configId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<NotifyListSubscriptionPhoneNumbersResponse>> =
            listSubscriptionPhoneNumbers(
                configId,
                NotifyListSubscriptionPhoneNumbersParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `post /v2/notify`, but is otherwise the same as
         * [NotifyServiceAsync.send].
         */
        fun send(params: NotifySendParams): CompletableFuture<HttpResponseFor<NotifySendResponse>> =
            send(params, RequestOptions.none())

        /** @see send */
        fun send(
            params: NotifySendParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NotifySendResponse>>

        /**
         * Returns a raw HTTP response for `post /v2/notify/batch`, but is otherwise the same as
         * [NotifyServiceAsync.sendBatch].
         */
        fun sendBatch(
            params: NotifySendBatchParams
        ): CompletableFuture<HttpResponseFor<NotifySendBatchResponse>> =
            sendBatch(params, RequestOptions.none())

        /** @see sendBatch */
        fun sendBatch(
            params: NotifySendBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NotifySendBatchResponse>>
    }
}
