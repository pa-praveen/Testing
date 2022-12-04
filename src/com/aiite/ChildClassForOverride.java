package com.aiite;

public class ChildClassForOverride extends Overriding {
	public void marriage()
	{
		System.out.println("Easwar's willing: Will Marry Trisha");
	}
	public void asset()
	{
		System.out.println("Easwar doesn't have any asset now");
	}
	public static void main(String[] args) {
		Overriding m = new ChildClassForOverride();
		m.asset();
		m.asset();
		ChildClassForOverride e = new ChildClassForOverride();
				e.asset();
	}
}
