package com.hnxc.gp.edu.task.pattern.factory.abstractfactory;

public class ChinaPayQrcodeFactory implements IQrcodeFactory {

	@Override
	public IGetQrcode createGetQrcode() {
		
		return new ChinaPayGetQrcode();
		
	}

	@Override
	public IServerNotify createServerNotify() {
		return new ChinaPayServerNotify();
	}

}
