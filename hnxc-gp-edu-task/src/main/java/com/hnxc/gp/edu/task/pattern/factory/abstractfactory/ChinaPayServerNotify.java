package com.hnxc.gp.edu.task.pattern.factory.abstractfactory;

import javax.servlet.http.HttpServletRequest;

public class ChinaPayServerNotify implements IServerNotify {

	@Override
	public void serverNotify(HttpServletRequest request) {
		System.out.println("银联支付结果通知");
	}

}
