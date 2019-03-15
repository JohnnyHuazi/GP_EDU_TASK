package com.hnxc.gp.edu.task.pattern.factory.simplefactory.impl;

import javax.servlet.http.HttpServletRequest;

import com.hnxc.gp.edu.task.pattern.factory.simplefactory.IQrcodePay;
import com.hnxc.gp.edu.task.pattern.factory.simplefactory.vo.OrderVO;

public class AliQrcodePay implements IQrcodePay {

	@Override
	public String getQrcode(String clazz) {
		
		System.out.println("这是支付宝二维码地址");
		
		return "这是支付宝二维码地址";
	}

	@Override
	public OrderVO queryPayResult(String orderno) {
		
		//根据订单号  调用支付宝查询接口  获取订单支付状态并返回订单实体
		OrderVO order = new OrderVO();
		order.setStats("chinapay");
		
		return order;
	}

	@Override
	public void serverNotify(HttpServletRequest request) {
		
		String orderno = request.getParameter("orderno");
		String stats = request.getParameter("stats");
		String paydatetime = request.getParameter("paydatetime");
		
		//处理订单状态

	}

}
