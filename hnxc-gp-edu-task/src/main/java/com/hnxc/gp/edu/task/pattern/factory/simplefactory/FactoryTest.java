package com.hnxc.gp.edu.task.pattern.factory.simplefactory;

import com.hnxc.gp.edu.task.pattern.factory.simplefactory.factory.QrcodeFactory;

public class FactoryTest {

	public static void main(String[] args) {
		
		try {
			QrcodeFactory factory = new QrcodeFactory();
			
			String chinapay = "com.hnxc.gp.edu.task.pattern.factory.simplefactory.impl.ChinaPayQrcodePay";
			String alipay = "com.hnxc.gp.edu.task.pattern.factory.simplefactory.impl.AliQrcodePay";
			
			IQrcodePay qrcodePay = factory.create(chinapay);
			IQrcodePay aliPay = factory.create(alipay);
			qrcodePay.getQrcode(chinapay);
			aliPay.getQrcode(chinapay);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
	}
}
