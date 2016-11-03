package com.hmrc.cftf.services.customerlookup;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hmrc.cftf.services.common.CoreService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("customerlookup/process-flow.xml");
        CoreService<CustomerDataRequest, CustomerDataResponse> customerLookupService = ctx.getBean("customerLookupService", CoreService.class);
        CustomerDataRequest request = new CustomerDataRequest();
        request.setCustomerName("anil.hemnani");
        CustomerDataResponse response = customerLookupService.invoke(request);
        System.out.println("Customer Id for "+request.getCustomerName()+" is "+response.getCustomerId());
    }
}
