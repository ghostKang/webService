package weaver.xhyy.webservice;

import java.rmi.RemoteException;

import cn.com.weaver.workflow.webservices.ISendToOAServicePortTypeProxy;


/**
 * 中转服务
 * @author 浴缸
 *
 */
public class Transfer {

	public void send(String in0,String in1,String in2,String in3,String in4,String in5,String in6,String in7,String in8){
		
		// web代理
		ISendToOAServicePortTypeProxy proxy = new ISendToOAServicePortTypeProxy();
		try {
			// web中的方法
			proxy.submitKyjflwfbx(in0, in1, in2, in3, in4, in5, in6, in7, in8);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
    }
	
}
