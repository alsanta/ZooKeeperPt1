package com.Santana.ZooKeeperPt1;
//  Making the gorilla class inherit from the mammal class
public class Gorilla extends Mammal{
//	Member Variables
	
//	Methods for Gorilla class
	public void throwSomthing() {
		this.energy -= 5; 
		System.out.println("The Gorilla throws something soft at you");
	}
	
	public void eatBananas() {
		this.energy += 10;
		System.out.println("After eating a banana the Gorilla feels refreshed");
	}
	
	public void climb() {
		this.energy -= 10;
		System.out.println("The Gorilla climbs to safety");
	}

}
