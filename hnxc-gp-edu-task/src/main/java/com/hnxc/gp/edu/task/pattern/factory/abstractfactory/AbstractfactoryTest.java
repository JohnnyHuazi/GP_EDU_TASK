package com.hnxc.gp.edu.task.pattern.factory.abstractfactory;

public class AbstractfactoryTest {
	
	public static void main(String[] args) {
		IQrcodeFactory qrcodeFactory = new ChinaPayQrcodeFactory();
		qrcodeFactory.createGetQrcode().getQrcode();
		qrcodeFactory.createServerNotify().serverNotify(null);
		qrcodeFactory = new ChinaPayQrcodeFactory();
		
		qrcodeFactory = new AlipayQrcodeFactory();
		qrcodeFactory.createGetQrcode().getQrcode();
		qrcodeFactory.createServerNotify().serverNotify(null);
	}

}
