package com.ikubinfo.aop.proxy;

import org.springframework.aop.framework.ProxyFactory;

public class AopMainTestProxy {

	public static void main(String[] args) {
		
		ProxyFactory factory = new ProxyFactory(new UserServiceImpl());
		factory.addInterface(UserService.class);
		factory.addAdvice(new TestBeforeAdvice());
		UserService service = (UserService) factory.getProxy();

		service.printName();
	}
}
