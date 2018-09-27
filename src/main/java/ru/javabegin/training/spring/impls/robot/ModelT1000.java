package ru.javabegin.training.spring.impls.robot;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import ru.javabegin.training.spring.interfaces.Hand;
import ru.javabegin.training.spring.interfaces.Head;
import ru.javabegin.training.spring.interfaces.Leg;
import ru.javabegin.training.spring.interfaces.Robot;

public class ModelT1000 implements Robot, InitializingBean, DisposableBean {
	
	private Hand hand;
	private Leg leg;
	private Head head;
	
	public ModelT1000() {
		// TODO Auto-generated constructor stub
	}
	
	public ModelT1000(Hand hand, Leg leg, Head head) {
		super();
		this.hand = hand;
		this.leg = leg;
		this.head = head;
	}	

	@Override
	public void action() {
		head.calc();
		hand.catchSomething();
		leg.go();
	}

	@Override
	public void dance() {
		System.out.println("T1000 is dancing!");
	}
	
	public Hand getHand() {
		return hand;
	}

	public void setHand(Hand hand) {
		this.hand = hand;
	}

	public Leg getLeg() {
		return leg;
	}

	public void setLeg(Leg leg) {
		this.leg = leg;
	}

	public Head getHead() {
		return head;
	}

	public void setHead(Head head) {
		this.head = head;
	}

	public void initObject() {
		System.out.println("init");
	}

	public void destroyObject() {
		System.out.println("destroy");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("---Destroy---");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("---Init---");
	}
	
}
