package com.hnxc.gp.edu.task.pattern.factory.factorymethod;

import com.hnxc.gp.edu.task.pattern.factory.simplefactory.IQrcodePay;

public class FactoryMethodTest {
	
	
	public static void main(String[] args) {
		
		ChinaPayQrcodePayFactory chinaPayQrcodePayFactory = new ChinaPayQrcodePayFactory();
		
		IQrcodePay qrcodePay = chinaPayQrcodePayFactory.create();
		qrcodePay.getQrcode("");
		
		
		AliQrcodePayFactory aliQrcodePayFactory = new AliQrcodePayFactory();
		qrcodePay = aliQrcodePayFactory.create();
		qrcodePay.getQrcode("");
		
		
	}
	
}
