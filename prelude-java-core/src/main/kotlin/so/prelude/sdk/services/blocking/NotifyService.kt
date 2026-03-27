// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
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
interface NotifyService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): NotifyService

    /** Retrieve a specific subscription management configuration by its ID. */
    fun getSubscriptionConfig(configId: String): NotifyGetSubscriptionConfigResponse =
        getSubscriptionConfig(configId, NotifyGetSubscriptionConfigParams.none())

    /** @see getSubscriptionConfig */
    fun getSubscriptionConfig(
        configId: String,
        params: NotifyGetSubscriptionConfigParams = NotifyGetSubscriptionConfigParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NotifyGetSubscriptionConfigResponse =
        getSubscriptionConfig(params.toBuilder().configId(configId).build(), requestOptions)

    /** @see getSubscriptionConfig */
    fun getSubscriptionConfig(
        configId: String,
        params: NotifyGetSubscriptionConfigParams = NotifyGetSubscriptionConfigParams.none(),
    ): NotifyGetSubscriptionConfigResponse =
        getSubscriptionConfig(configId, params, RequestOptions.none())

    /** @see getSubscriptionConfig */
    fun getSubscriptionConfig(
        params: NotifyGetSubscriptionConfigParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NotifyGetSubscriptionConfigResponse

    /** @see getSubscriptionConfig */
    fun getSubscriptionConfig(
        params: NotifyGetSubscriptionConfigParams
    ): NotifyGetSubscriptionConfigResponse = getSubscriptionConfig(params, RequestOptions.none())

    /** @see getSubscriptionConfig */
    fun getSubscriptionConfig(
        configId: String,
        requestOptions: RequestOptions,
    ): NotifyGetSubscriptionConfigResponse =
        getSubscriptionConfig(configId, NotifyGetSubscriptionConfigParams.none(), requestOptions)

    /**
     * Retrieve the current subscription status for a specific phone number within a subscription
     * configuration.
     */
    fun getSubscriptionPhoneNumber(
        phoneNumber: String,
        params: NotifyGetSubscriptionPhoneNumberParams,
    ): NotifyGetSubscriptionPhoneNumberResponse =
        getSubscriptionPhoneNumber(phoneNumber, params, RequestOptions.none())

    /** @see getSubscriptionPhoneNumber */
    fun getSubscriptionPhoneNumber(
        phoneNumber: String,
        params: NotifyGetSubscriptionPhoneNumberParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NotifyGetSubscriptionPhoneNumberResponse =
        getSubscriptionPhoneNumber(
            params.toBuilder().phoneNumber(phoneNumber).build(),
            requestOptions,
        )

    /** @see getSubscriptionPhoneNumber */
    fun getSubscriptionPhoneNumber(
        params: NotifyGetSubscriptionPhoneNumberParams
    ): NotifyGetSubscriptionPhoneNumberResponse =
        getSubscriptionPhoneNumber(params, RequestOptions.none())

    /** @see getSubscriptionPhoneNumber */
    fun getSubscriptionPhoneNumber(
        params: NotifyGetSubscriptionPhoneNumberParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NotifyGetSubscriptionPhoneNumberResponse

    /**
     * Retrieve a paginated list of subscription management configurations for your account.
     *
     * Each configuration represents a subscription management setup with phone numbers for
     * receiving opt-out/opt-in requests and a callback URL for webhook events.
     */
    fun listSubscriptionConfigs(): NotifyListSubscriptionConfigsResponse =
        listSubscriptionConfigs(NotifyListSubscriptionConfigsParams.none())

    /** @see listSubscriptionConfigs */
    fun listSubscriptionConfigs(
        params: NotifyListSubscriptionConfigsParams = NotifyListSubscriptionConfigsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NotifyListSubscriptionConfigsResponse

    /** @see listSubscriptionConfigs */
    fun listSubscriptionConfigs(
        params: NotifyListSubscriptionConfigsParams = NotifyListSubscriptionConfigsParams.none()
    ): NotifyListSubscriptionConfigsResponse =
        listSubscriptionConfigs(params, RequestOptions.none())

    /** @see listSubscriptionConfigs */
    fun listSubscriptionConfigs(
        requestOptions: RequestOptions
    ): NotifyListSubscriptionConfigsResponse =
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
    ): NotifyListSubscriptionPhoneNumberEventsResponse =
        listSubscriptionPhoneNumberEvents(phoneNumber, params, RequestOptions.none())

    /** @see listSubscriptionPhoneNumberEvents */
    fun listSubscriptionPhoneNumberEvents(
        phoneNumber: String,
        params: NotifyListSubscriptionPhoneNumberEventsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NotifyListSubscriptionPhoneNumberEventsResponse =
        listSubscriptionPhoneNumberEvents(
            params.toBuilder().phoneNumber(phoneNumber).build(),
            requestOptions,
        )

    /** @see listSubscriptionPhoneNumberEvents */
    fun listSubscriptionPhoneNumberEvents(
        params: NotifyListSubscriptionPhoneNumberEventsParams
    ): NotifyListSubscriptionPhoneNumberEventsResponse =
        listSubscriptionPhoneNumberEvents(params, RequestOptions.none())

    /** @see listSubscriptionPhoneNumberEvents */
    fun listSubscriptionPhoneNumberEvents(
        params: NotifyListSubscriptionPhoneNumberEventsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NotifyListSubscriptionPhoneNumberEventsResponse

    /**
     * Retrieve a paginated list of phone numbers and their subscription statuses for a specific
     * subscription configuration.
     *
     * You can optionally filter by subscription state (SUB or UNSUB).
     */
    fun listSubscriptionPhoneNumbers(configId: String): NotifyListSubscriptionPhoneNumbersResponse =
        listSubscriptionPhoneNumbers(configId, NotifyListSubscriptionPhoneNumbersParams.none())

    /** @see listSubscriptionPhoneNumbers */
    fun listSubscriptionPhoneNumbers(
        configId: String,
        params: NotifyListSubscriptionPhoneNumbersParams =
            NotifyListSubscriptionPhoneNumbersParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NotifyListSubscriptionPhoneNumbersResponse =
        listSubscriptionPhoneNumbers(params.toBuilder().configId(configId).build(), requestOptions)

    /** @see listSubscriptionPhoneNumbers */
    fun listSubscriptionPhoneNumbers(
        configId: String,
        params: NotifyListSubscriptionPhoneNumbersParams =
            NotifyListSubscriptionPhoneNumbersParams.none(),
    ): NotifyListSubscriptionPhoneNumbersResponse =
        listSubscriptionPhoneNumbers(configId, params, RequestOptions.none())

    /** @see listSubscriptionPhoneNumbers */
    fun listSubscriptionPhoneNumbers(
        params: NotifyListSubscriptionPhoneNumbersParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NotifyListSubscriptionPhoneNumbersResponse

    /** @see listSubscriptionPhoneNumbers */
    fun listSubscriptionPhoneNumbers(
        params: NotifyListSubscriptionPhoneNumbersParams
    ): NotifyListSubscriptionPhoneNumbersResponse =
        listSubscriptionPhoneNumbers(params, RequestOptions.none())

    /** @see listSubscriptionPhoneNumbers */
    fun listSubscriptionPhoneNumbers(
        configId: String,
        requestOptions: RequestOptions,
    ): NotifyListSubscriptionPhoneNumbersResponse =
        listSubscriptionPhoneNumbers(
            configId,
            NotifyListSubscriptionPhoneNumbersParams.none(),
            requestOptions,
        )

    /**
     * Send transactional and marketing messages to your users via SMS, RCS and WhatsApp with
     * automatic compliance enforcement.
     */
    fun send(params: NotifySendParams): NotifySendResponse = send(params, RequestOptions.none())

    /** @see send */
    fun send(
        params: NotifySendParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NotifySendResponse

    /** Send the same message to multiple recipients in a single request. */
    fun sendBatch(params: NotifySendBatchParams): NotifySendBatchResponse =
        sendBatch(params, RequestOptions.none())

    /** @see sendBatch */
    fun sendBatch(
        params: NotifySendBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NotifySendBatchResponse

    /** A view of [NotifyService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): NotifyService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v2/notify/management/subscriptions/{config_id}`,
         * but is otherwise the same as [NotifyService.getSubscriptionConfig].
         */
        @MustBeClosed
        fun getSubscriptionConfig(
            configId: String
        ): HttpResponseFor<NotifyGetSubscriptionConfigResponse> =
            getSubscriptionConfig(configId, NotifyGetSubscriptionConfigParams.none())

        /** @see getSubscriptionConfig */
        @MustBeClosed
        fun getSubscriptionConfig(
            configId: String,
            params: NotifyGetSubscriptionConfigParams = NotifyGetSubscriptionConfigParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NotifyGetSubscriptionConfigResponse> =
            getSubscriptionConfig(params.toBuilder().configId(configId).build(), requestOptions)

        /** @see getSubscriptionConfig */
        @MustBeClosed
        fun getSubscriptionConfig(
            configId: String,
            params: NotifyGetSubscriptionConfigParams = NotifyGetSubscriptionConfigParams.none(),
        ): HttpResponseFor<NotifyGetSubscriptionConfigResponse> =
            getSubscriptionConfig(configId, params, RequestOptions.none())

        /** @see getSubscriptionConfig */
        @MustBeClosed
        fun getSubscriptionConfig(
            params: NotifyGetSubscriptionConfigParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NotifyGetSubscriptionConfigResponse>

        /** @see getSubscriptionConfig */
        @MustBeClosed
        fun getSubscriptionConfig(
            params: NotifyGetSubscriptionConfigParams
        ): HttpResponseFor<NotifyGetSubscriptionConfigResponse> =
            getSubscriptionConfig(params, RequestOptions.none())

        /** @see getSubscriptionConfig */
        @MustBeClosed
        fun getSubscriptionConfig(
            configId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<NotifyGetSubscriptionConfigResponse> =
            getSubscriptionConfig(
                configId,
                NotifyGetSubscriptionConfigParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get
         * /v2/notify/management/subscriptions/{config_id}/phone_numbers/{phone_number}`, but is
         * otherwise the same as [NotifyService.getSubscriptionPhoneNumber].
         */
        @MustBeClosed
        fun getSubscriptionPhoneNumber(
            phoneNumber: String,
            params: NotifyGetSubscriptionPhoneNumberParams,
        ): HttpResponseFor<NotifyGetSubscriptionPhoneNumberResponse> =
            getSubscriptionPhoneNumber(phoneNumber, params, RequestOptions.none())

        /** @see getSubscriptionPhoneNumber */
        @MustBeClosed
        fun getSubscriptionPhoneNumber(
            phoneNumber: String,
            params: NotifyGetSubscriptionPhoneNumberParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NotifyGetSubscriptionPhoneNumberResponse> =
            getSubscriptionPhoneNumber(
                params.toBuilder().phoneNumber(phoneNumber).build(),
                requestOptions,
            )

        /** @see getSubscriptionPhoneNumber */
        @MustBeClosed
        fun getSubscriptionPhoneNumber(
            params: NotifyGetSubscriptionPhoneNumberParams
        ): HttpResponseFor<NotifyGetSubscriptionPhoneNumberResponse> =
            getSubscriptionPhoneNumber(params, RequestOptions.none())

        /** @see getSubscriptionPhoneNumber */
        @MustBeClosed
        fun getSubscriptionPhoneNumber(
            params: NotifyGetSubscriptionPhoneNumberParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NotifyGetSubscriptionPhoneNumberResponse>

        /**
         * Returns a raw HTTP response for `get /v2/notify/management/subscriptions`, but is
         * otherwise the same as [NotifyService.listSubscriptionConfigs].
         */
        @MustBeClosed
        fun listSubscriptionConfigs(): HttpResponseFor<NotifyListSubscriptionConfigsResponse> =
            listSubscriptionConfigs(NotifyListSubscriptionConfigsParams.none())

        /** @see listSubscriptionConfigs */
        @MustBeClosed
        fun listSubscriptionConfigs(
            params: NotifyListSubscriptionConfigsParams =
                NotifyListSubscriptionConfigsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NotifyListSubscriptionConfigsResponse>

        /** @see listSubscriptionConfigs */
        @MustBeClosed
        fun listSubscriptionConfigs(
            params: NotifyListSubscriptionConfigsParams = NotifyListSubscriptionConfigsParams.none()
        ): HttpResponseFor<NotifyListSubscriptionConfigsResponse> =
            listSubscriptionConfigs(params, RequestOptions.none())

        /** @see listSubscriptionConfigs */
        @MustBeClosed
        fun listSubscriptionConfigs(
            requestOptions: RequestOptions
        ): HttpResponseFor<NotifyListSubscriptionConfigsResponse> =
            listSubscriptionConfigs(NotifyListSubscriptionConfigsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /v2/notify/management/subscriptions/{config_id}/phone_numbers/{phone_number}/events`, but
         * is otherwise the same as [NotifyService.listSubscriptionPhoneNumberEvents].
         */
        @MustBeClosed
        fun listSubscriptionPhoneNumberEvents(
            phoneNumber: String,
            params: NotifyListSubscriptionPhoneNumberEventsParams,
        ): HttpResponseFor<NotifyListSubscriptionPhoneNumberEventsResponse> =
            listSubscriptionPhoneNumberEvents(phoneNumber, params, RequestOptions.none())

        /** @see listSubscriptionPhoneNumberEvents */
        @MustBeClosed
        fun listSubscriptionPhoneNumberEvents(
            phoneNumber: String,
            params: NotifyListSubscriptionPhoneNumberEventsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NotifyListSubscriptionPhoneNumberEventsResponse> =
            listSubscriptionPhoneNumberEvents(
                params.toBuilder().phoneNumber(phoneNumber).build(),
                requestOptions,
            )

        /** @see listSubscriptionPhoneNumberEvents */
        @MustBeClosed
        fun listSubscriptionPhoneNumberEvents(
            params: NotifyListSubscriptionPhoneNumberEventsParams
        ): HttpResponseFor<NotifyListSubscriptionPhoneNumberEventsResponse> =
            listSubscriptionPhoneNumberEvents(params, RequestOptions.none())

        /** @see listSubscriptionPhoneNumberEvents */
        @MustBeClosed
        fun listSubscriptionPhoneNumberEvents(
            params: NotifyListSubscriptionPhoneNumberEventsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NotifyListSubscriptionPhoneNumberEventsResponse>

        /**
         * Returns a raw HTTP response for `get
         * /v2/notify/management/subscriptions/{config_id}/phone_numbers`, but is otherwise the same
         * as [NotifyService.listSubscriptionPhoneNumbers].
         */
        @MustBeClosed
        fun listSubscriptionPhoneNumbers(
            configId: String
        ): HttpResponseFor<NotifyListSubscriptionPhoneNumbersResponse> =
            listSubscriptionPhoneNumbers(configId, NotifyListSubscriptionPhoneNumbersParams.none())

        /** @see listSubscriptionPhoneNumbers */
        @MustBeClosed
        fun listSubscriptionPhoneNumbers(
            configId: String,
            params: NotifyListSubscriptionPhoneNumbersParams =
                NotifyListSubscriptionPhoneNumbersParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NotifyListSubscriptionPhoneNumbersResponse> =
            listSubscriptionPhoneNumbers(
                params.toBuilder().configId(configId).build(),
                requestOptions,
            )

        /** @see listSubscriptionPhoneNumbers */
        @MustBeClosed
        fun listSubscriptionPhoneNumbers(
            configId: String,
            params: NotifyListSubscriptionPhoneNumbersParams =
                NotifyListSubscriptionPhoneNumbersParams.none(),
        ): HttpResponseFor<NotifyListSubscriptionPhoneNumbersResponse> =
            listSubscriptionPhoneNumbers(configId, params, RequestOptions.none())

        /** @see listSubscriptionPhoneNumbers */
        @MustBeClosed
        fun listSubscriptionPhoneNumbers(
            params: NotifyListSubscriptionPhoneNumbersParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NotifyListSubscriptionPhoneNumbersResponse>

        /** @see listSubscriptionPhoneNumbers */
        @MustBeClosed
        fun listSubscriptionPhoneNumbers(
            params: NotifyListSubscriptionPhoneNumbersParams
        ): HttpResponseFor<NotifyListSubscriptionPhoneNumbersResponse> =
            listSubscriptionPhoneNumbers(params, RequestOptions.none())

        /** @see listSubscriptionPhoneNumbers */
        @MustBeClosed
        fun listSubscriptionPhoneNumbers(
            configId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<NotifyListSubscriptionPhoneNumbersResponse> =
            listSubscriptionPhoneNumbers(
                configId,
                NotifyListSubscriptionPhoneNumbersParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `post /v2/notify`, but is otherwise the same as
         * [NotifyService.send].
         */
        @MustBeClosed
        fun send(params: NotifySendParams): HttpResponseFor<NotifySendResponse> =
            send(params, RequestOptions.none())

        /** @see send */
        @MustBeClosed
        fun send(
            params: NotifySendParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NotifySendResponse>

        /**
         * Returns a raw HTTP response for `post /v2/notify/batch`, but is otherwise the same as
         * [NotifyService.sendBatch].
         */
        @MustBeClosed
        fun sendBatch(params: NotifySendBatchParams): HttpResponseFor<NotifySendBatchResponse> =
            sendBatch(params, RequestOptions.none())

        /** @see sendBatch */
        @MustBeClosed
        fun sendBatch(
            params: NotifySendBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NotifySendBatchResponse>
    }
}
