package cn.itcast.action;

import com.opensymphony.xwork2.ActionSupport;

//第三中方式:继承类(一般使用此方法)

public class PersonAction extends ActionSupport {
	@Override
	public String execute() throws Exception {
		
		return SUCCESS;
	}
}
