package com.model;

import org.springframework.stereotype.Component;

@Component
public class AddrImpl implements Addr {
	@Override
	public String show() {
		return new User("hbfaith","changsha").getAddr().toString();
	}
}
