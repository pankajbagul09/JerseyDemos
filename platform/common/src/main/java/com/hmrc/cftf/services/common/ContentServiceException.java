package com.hmrc.cftf.services.common;

/**
 * Created by anilhemnani on 14/09/2016.
 */
public class ContentServiceException extends RuntimeException {
    public ContentServiceException() {
    }

    public ContentServiceException(String message) {
        super(message);
    }

    public ContentServiceException(String message, Throwable cause) {
        super(message, cause);
    }

    public ContentServiceException(Throwable cause) {
        super(cause);
    }

    public ContentServiceException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
