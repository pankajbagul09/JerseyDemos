package com.hmrc.cftf.services.common;

import com.hmrc.cftf.services.common.model.ServiceRequest;
import com.hmrc.cftf.services.common.model.ServiceResponse;

import java.io.Serializable;

public abstract class AbstractCoreService<INPUT extends Serializable, OUTPUT extends Serializable> implements CoreService<INPUT, OUTPUT> {

	public final OUTPUT invoke(INPUT input) {
		return execute(input);
	}
	public abstract OUTPUT execute(INPUT input);

}
