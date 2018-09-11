package com.vk.api.sdk.exceptions;

public class ApiRateLimitReachedException extends ApiException {
    public ApiRateLimitReachedException(String message) {
        super(29, "Rate Limit Reached", message);
    }
}

