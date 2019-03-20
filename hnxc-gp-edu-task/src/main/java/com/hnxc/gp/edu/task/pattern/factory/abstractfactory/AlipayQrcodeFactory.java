package com.hnxc.gp.edu.task.pattern.factory.abstractfactory;


public class AlipayQrcodeFactory implements IQrcodeFactory {


@Override
public IGetQrcode createGetQrcode() {
	return new AlipayGetQrcodeFactory();
}

@Override
	public IServerNotify createServerNotify() {
		return new AlipayServerNotify();
	}

}
