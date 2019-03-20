package com.hnxc.gp.edu.task.pattern.factory.abstractfactory;

import javax.servlet.http.HttpServletRequest;

public class AlipayServerNotify implements IServerNotify {

	@Override
	public void serverNotify(HttpServletRequest request) {
		System.out.println("支付宝结果通知");
	}

}
