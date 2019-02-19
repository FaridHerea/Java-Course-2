package oopPrinciplesUsingJavaScanner;

import java.util.Scanner;

//main class
public class all {
	public static void main(String[] args) {
		
		//inheritage declaration
		Inherit2 inherit = new Inherit2();
		//encapsulation declaration
		Capsule setCapsule = new Capsule();
		//polymorphism declaration
		Polymorphism my = new Polymorphism();
		//scanner declaration
		Scanner number = new Scanner(System.in);
		//inherited output 1
		System.out.println(inherit.firstNumberText);
		//encapsulated input 1
		setCapsule.setFirstNumber(number.nextInt());
		//inherited output 2
		inherit.secondNumberText();
		//encapsulated input 2
		setCapsule.setSecondNumber(number.nextInt());
		//encapsulated output
		System.out.println(setCapsule.getFirstNumber() + " plus " + setCapsule.getSecondNumber() + " is " + setCapsule.getSum() + " !");
		//using polymorphism
		my.punchLine("oneHitKill");
		
		//using abstraction
//		AbstractClass myAbstractClass = new AbstractClass();
	}
}

//inheritance
//normal class
class Inherit1 {
	
	public String firstNumberText = "Enter a number!";
}

//inheritance
//inherit class
class Inherit2 extends Inherit1{
	
	public void secondNumberText() {
		System.out.println("Another!");
	}

}

//abstraction
//abstract class
abstract class AbstractClass {
	//abstract method
	abstract void abstractMethod();
	
	//concrete method
	void concrete() {
		System.out.println("Nice call!");
	}
}

//encapsulation
//normal class
class Capsule {
	//encapsulated variables
	private int firstNumber;
	private int secondNumber;
	private int sum;

	//Getter methods
	public int getFirstNumber() {
		return firstNumber;
	}
	public int getSecondNumber() {
		return secondNumber;
	}
	public int getSum() {
		sum = firstNumber + secondNumber;
		return sum;
	}
	
	//Setter methods
	public void setFirstNumber(int firstNumber) {
		this.firstNumber = firstNumber;
	}
	public void setSecondNumber(int secondNumber) {
		this.secondNumber = secondNumber;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
}

//Polymorphism
class Polymorphism{
	public void punchLine(String oneHitKill) {
		System.out.println("Quick maphs!");
	}
}