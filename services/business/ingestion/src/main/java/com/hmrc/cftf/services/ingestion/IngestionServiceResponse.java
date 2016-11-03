package com.hmrc.cftf.services.ingestion;

import com.hmrc.cftf.services.common.model.ServiceResponse;

public class IngestionServiceResponse extends ServiceResponse{
    private String fileName;
    private boolean success = false;
    private String errorMessage = null;

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    @Override
    public String toString() {
        return "IngestionServiceResponse{" +
                       "fileName='" + fileName + '\'' +
                       ", success=" + success +
                       ", errorMessage='" + errorMessage + '\'' +
                       '}';
    }
}
