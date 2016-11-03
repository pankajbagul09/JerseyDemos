package com.hmrc.cftf.services.documentum;

import com.hmrc.cftf.services.common.AbstractCoreService;

public class Type2ToDocumentumTransformer extends AbstractCoreService<String, String> {

	@Override
	public String execute(String input) {
		System.out.println("Type 2 transformer executing");

		input = "Transformed by Type2 Transformer"+System.getProperty("line.separator")+input;
		return input;
	}

}
