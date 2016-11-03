package com.hmrc.cftf.services.common;

import com.hmrc.cftf.services.common.model.ServiceRequest;
import com.hmrc.cftf.services.common.model.ServiceResponse;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.Serializable;

public abstract class AbstractCompositeService<INPUT extends ServiceRequest, OUTPUT extends ServiceResponse> implements CompositeService<INPUT, OUTPUT> {

	private ApplicationContext context;
	private String serviceName;
	public AbstractCompositeService(String processFlowXmlPath, String serviceName){
				context = new ClassPathXmlApplicationContext(processFlowXmlPath);
		this.serviceName = serviceName;
	}


	public OUTPUT invoke(INPUT input) {
		return (OUTPUT) context.getBean(serviceName, CoreService.class).invoke(input);
	}

	public abstract OUTPUT getResponseTemplate();

	public abstract INPUT getRequestTemplate();
}
