package ru.javabegin.training.spring.impls.toshiba;

import ru.javabegin.training.spring.interfaces.Leg;

public class ToshibaLeg implements Leg {

	@Override
	public void go() {
		System.out.println("Go to Toshiba!");
	}

}
