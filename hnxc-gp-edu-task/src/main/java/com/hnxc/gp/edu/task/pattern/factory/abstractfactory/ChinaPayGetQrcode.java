package com.hnxc.gp.edu.task.pattern.factory.abstractfactory;

public class ChinaPayGetQrcode implements IGetQrcode {

	@Override
	public String getQrcode() {
		String qrcode =  "银联支付二维码";
		System.out.println(qrcode);
		return qrcode;
	}

}
