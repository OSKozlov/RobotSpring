package ru.javabegin.training.spring.impls.sony;

import ru.javabegin.training.spring.interfaces.Leg;

public class SonyLeg implements Leg {

	@Override
	public void go() {
		System.out.println("Go to Sony!");
	}

}
