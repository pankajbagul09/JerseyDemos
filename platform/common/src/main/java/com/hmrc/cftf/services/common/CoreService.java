package com.hmrc.cftf.services.common;

import com.hmrc.cftf.services.common.model.ServiceRequest;
import com.hmrc.cftf.services.common.model.ServiceResponse;

import java.io.Serializable;

/**
 * Top level interface for any common service that is developed for content services platform
 * @author anilhemnani
 *
 * @param <INPUT>
 * @param <OUTPUT>
 */
public interface CoreService<INPUT extends Serializable, OUTPUT extends Serializable>{
	OUTPUT invoke(INPUT input);
}
