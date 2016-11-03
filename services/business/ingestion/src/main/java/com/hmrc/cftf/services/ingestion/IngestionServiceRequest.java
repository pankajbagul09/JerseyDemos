package com.hmrc.cftf.services.ingestion;

import com.hmrc.cftf.services.common.model.ServiceRequest;

public class IngestionServiceRequest extends ServiceRequest {
	
	private String customerName;
	private String contentType;
	private String sourceSystem;
	private String contentAsXml;
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getContentType() {
		return contentType;
	}
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}
	public String getSourceSystem() {
		return sourceSystem;
	}
	public void setSourceSystem(String sourceSystem) {
		this.sourceSystem = sourceSystem;
	}
	public String getContentAsXml() {
		return contentAsXml;
	}
	public void setContentAsXml(String contentAsXml) {
		this.contentAsXml = contentAsXml;
	}

	@Override
	public String toString() {
		return "IngestionServiceRequest{" +
					   "customerName='" + customerName + '\'' +
					   ", contentType='" + contentType + '\'' +
					   ", sourceSystem='" + sourceSystem + '\'' +
					   ", contentAsXml='" + contentAsXml + '\'' +
					   '}';
	}
}
