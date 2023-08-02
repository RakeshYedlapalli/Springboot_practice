package com.gap.sample.practice.design.patterns.factorymethod.impl1.message;

public class JSONMessage extends Message {

	@Override
	public String getContent() {
		return "{\"JSON]\":[]}";
	}
	
}
