package com.hmrc.cftf.services.ingestion;

import com.hmrc.cftf.services.common.ContentType;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        IngestionService service = new IngestionService();
        IngestionServiceRequest request = new IngestionServiceRequest();
        request.setContentAsXml("<SOME XML CONTENT for %%CUSTOMER_ID%%>");
        request.setContentType(ContentType.TYPE_1.name());
        request.setCustomerName("anil.hemnani");
        request.setSourceSystem("IFS");
        IngestionServiceResponse response  = service.invoke(request);
        System.out.printf(response.toString());
    }
}
