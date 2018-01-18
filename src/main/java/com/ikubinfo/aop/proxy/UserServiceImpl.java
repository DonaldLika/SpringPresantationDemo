package com.ikubinfo.aop.proxy;

public class UserServiceImpl implements UserService {

	@Override
	public void printName() {
		System.out.println("Name is Printed");
	}

}
