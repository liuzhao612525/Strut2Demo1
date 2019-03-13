package cn.itcast.action;

public class HelloAction {
	
	//第一种 普通方法
	
	//访问serlet的时候，都会执行service方法
	//写类继承HttpServlet，重写类里面的方法
	//在web。xml中配置servlet访问路径
	//访问action，每次访问action的时候，都会默认执行execute方法。
	
		public String execute() {
			return "ok";
		}
		
		public String add() {
			return "add";
		}
}
