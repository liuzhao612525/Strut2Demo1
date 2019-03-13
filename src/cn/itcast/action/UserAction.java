package cn.itcast.action;

import com.opensymphony.xwork2.Action;

// 第二种实现接口(用的少)

public class UserAction implements Action {

	@Override
	public String execute() throws Exception {
		
		return SUCCESS;
	}

}
