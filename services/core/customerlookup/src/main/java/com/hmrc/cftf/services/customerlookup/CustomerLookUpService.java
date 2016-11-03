package com.hmrc.cftf.services.customerlookup;

import java.util.Properties;

import com.hmrc.cftf.services.common.AbstractCoreService;

public class CustomerLookUpService extends AbstractCoreService<CustomerDataRequest, CustomerDataResponse> {
	private final Properties customerData;

	public CustomerLookUpService(Properties properties) throws Exception {
		customerData = properties;
		System.out.println("Number of properties " + customerData.size());
	}

	@Override
	public CustomerDataResponse execute(CustomerDataRequest input) {
		System.out.println("Customer Lookup Executing");
		CustomerDataResponse response = new CustomerDataResponse();
		response.setCustomerId(customerData.getProperty(input.getCustomerName(), "UNKNOWN_CUSTOMER"));
		return response;
	}

}
