package com.hnxc.gp.edu.task.pattern.factory.abstractfactory;

public class AlipayGetQrcodeFactory implements IGetQrcode {

	@Override
	public String getQrcode() {
		String qrcode = "阿里支付二维码";
		System.out.println(qrcode);
		return qrcode;
	}

}
