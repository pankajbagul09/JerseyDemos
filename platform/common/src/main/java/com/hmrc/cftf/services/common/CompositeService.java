package com.hmrc.cftf.services.common;

import com.hmrc.cftf.services.common.model.ServiceRequest;
import com.hmrc.cftf.services.common.model.ServiceResponse;

/**
 * Top level interface for any common service that is developed for content services platform
 * @author anilhemnani
 *
 * @param <INPUT>
 * @returns
 */
public interface CompositeService<INPUT extends ServiceRequest, OUTPUT extends ServiceResponse>{
	OUTPUT invoke(INPUT input);
	public OUTPUT getResponseTemplate();
	public INPUT getRequestTemplate();
}
