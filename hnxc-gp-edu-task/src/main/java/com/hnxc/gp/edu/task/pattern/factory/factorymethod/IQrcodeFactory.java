package com.hnxc.gp.edu.task.pattern.factory.factorymethod;

import com.hnxc.gp.edu.task.pattern.factory.simplefactory.IQrcodePay;

/**
 * 二维码支付-工厂方法模式
 * 
 * */
public interface IQrcodeFactory {
	
	/**
	 * 工厂方法创建类
	 * */
	public IQrcodePay create();
	

}
