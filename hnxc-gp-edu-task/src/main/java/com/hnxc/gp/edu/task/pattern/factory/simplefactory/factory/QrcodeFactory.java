package com.hnxc.gp.edu.task.pattern.factory.simplefactory.factory;

import com.hnxc.gp.edu.task.pattern.factory.simplefactory.IQrcodePay;

public class QrcodeFactory {
	
	public IQrcodePay create(String classpath) {
		
		try {
			Class clazz = Class.forName(classpath);
			
			
            if (null != clazz) {
                return (IQrcodePay)clazz.newInstance();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
		
	}
	
	

}
