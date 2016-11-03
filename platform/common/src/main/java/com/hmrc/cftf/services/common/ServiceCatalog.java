package com.hmrc.cftf.services.common;

import java.util.HashMap;
import java.util.Map;

public enum ServiceCatalog {
	CUSTOMER_LOOKUP_SERVICE("customerDataRequestChannel", "customerDataResponseChannel", "customerLookupService");
	private String inputChannelName;
	private String outputChannelName;
	private String serviceName;
	private ServiceCatalog(String input, String output, String serviceName){
		this.inputChannelName = input;
		this.outputChannelName = output;
		this.serviceName = serviceName;
	}
	public String getInputChannelName() {
		return inputChannelName;
	}
	public String getOutputChannelName() {
		return outputChannelName;
	}
	public String getServiceName() {
		return serviceName;
	}
	
}
