package com.hmrc.cftf.services.ingestion;

/**
 * Created by anilhemnani on 14/09/2016.
 */
public interface IngestionHelperService {
    public IngestionServiceResponse createResponse(String fileName);
    public IngestionServiceRequest updateCustomerInformation(IngestionServiceRequest input);
}
