package com.hnxc.gp.edu.task.pattern.factory.factorymethod;

import com.hnxc.gp.edu.task.pattern.factory.simplefactory.IQrcodePay;
import com.hnxc.gp.edu.task.pattern.factory.simplefactory.impl.ChinaPayQrcodePay;

public class ChinaPayQrcodePayFactory implements IQrcodeFactory {

	@Override
	public IQrcodePay create() {
		return new ChinaPayQrcodePay();
	}

}
