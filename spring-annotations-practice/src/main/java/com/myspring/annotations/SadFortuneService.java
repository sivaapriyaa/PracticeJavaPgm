package com.myspring.annotations;

public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
	
		return "Today is a sad day";
	}

}
