package com.hnxc.gp.edu.task.pattern.factory.abstractfactory;

public interface IQrcodeFactory {
	
	public IGetQrcode createGetQrcode();
	
	public IServerNotify createServerNotify();
	

}
