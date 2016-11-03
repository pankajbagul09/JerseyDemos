package com.hmrc.cftf.services.documentum;

import com.hmrc.cftf.services.common.AbstractCoreService;

import java.io.Serializable;

public class Type1ToDocumentumTransformer extends AbstractCoreService<String, String> {

	@Override
	public String execute(String input) {
		System.out.println("Type 1 transformer executing");
		input = "Transformed by Type1 Transformer" + System.getProperty("line.separator") + input;
		return input;
	}
}
