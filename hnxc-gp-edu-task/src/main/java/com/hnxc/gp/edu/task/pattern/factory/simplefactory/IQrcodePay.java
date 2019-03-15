package com.hnxc.gp.edu.task.pattern.factory.simplefactory;

import javax.servlet.http.HttpServletRequest;

import com.hnxc.gp.edu.task.pattern.factory.simplefactory.vo.OrderVO;

/**
   * 扫码支付工厂
 * @author ywh
 * @since 2019-03-15
 * */
public interface IQrcodePay {
	
	/**
	 *  根据二维码实现类地址获取二维码（银联、支付宝、微信等）
	 *  @param Class 二维码支付渠道实现类全路径
	 *  @return 二维码地址
	 * */
	public String getQrcode(String clazz);		
		
	/**
	 * 根据订单号查询订单的支付状态
	 * @param orderno 订单号
	 * @return ordervo 订单实体
	 * */
	public OrderVO queryPayResult(String orderno);
	
	/**
	 * 接收各支付渠道的支付结果反馈
	 * @param request
	 * */
	public void serverNotify(HttpServletRequest request) ;
	

}
