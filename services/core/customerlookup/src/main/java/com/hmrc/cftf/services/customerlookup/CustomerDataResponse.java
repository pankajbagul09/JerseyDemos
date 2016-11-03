package com.hmrc.cftf.services.customerlookup;


public class CustomerDataResponse extends com.hmrc.cftf.services.common.model.ServiceResponse{

	private String customerId = null;

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	
}
