package com.aiite;

public class Overloading {
	public void chennai()
	{
		System.out.println("Vanakkam Chennai");
	}
	public void chennai(int a)		//type of argument, order of argument, number of argument
	{
		System.out.println("My area number:" +a);
	}
	public void chennai(int a, long b)
	{
		long c=a+b;
		System.out.println("My area number is"+c);
	}
	public void chennai(long a, int b)
	{
		long c=a*b;
		System.out.println("My area number will be"+c);
	}
	public static void main(String[] args) {
		Overloading s = new Overloading();
		s.chennai();
		s.chennai(100);
		s.chennai(10, 547855786l);
		s.chennai(45345343l, 20);
	}
}
