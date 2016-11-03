package com.hmrc.cftf.services.ingestion;

import com.hmrc.cftf.services.common.CoreService;
import com.hmrc.cftf.services.customerlookup.CustomerDataRequest;
import com.hmrc.cftf.services.customerlookup.CustomerDataResponse;

/**
 * Created by anilhemnani on 14/09/2016.
 */
public class IngestionHelperServiceImpl implements IngestionHelperService {

    private CoreService customerLookupService;
    public IngestionHelperServiceImpl(CoreService customerLookupService){
        this.customerLookupService = customerLookupService;
    }
    public IngestionServiceResponse createResponse(String fileName) {
        IngestionServiceResponse response = new IngestionServiceResponse();
        response.setFileName(fileName);
        response.setSuccess(true);
        return response;
    }

    public IngestionServiceRequest updateCustomerInformation(IngestionServiceRequest input) {
        System.out.println("Updating customer information");
        CustomerDataRequest customerDataRequest = new CustomerDataRequest();
        customerDataRequest.setCustomerName(input.getCustomerName());
        CustomerDataResponse response = (CustomerDataResponse) customerLookupService.invoke(customerDataRequest);
        String content = input.getContentAsXml();
        content = content.replaceAll("%%CUSTOMER_ID%%", response.getCustomerId());
        content = content.replaceAll("%%CUSTOMER_NAME%%", input.getCustomerName());
        input.setContentAsXml(content);
        return input;
    }
}
