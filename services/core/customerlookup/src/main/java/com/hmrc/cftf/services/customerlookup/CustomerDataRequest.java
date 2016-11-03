package com.hmrc.cftf.services.customerlookup;

public class CustomerDataRequest extends com.hmrc.cftf.services.common.model.ServiceRequest{

	private String customerName;

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
}
