package com.ajs;

import org.openqa.selenium.remote.html5.AddApplicationCache;

public class Master {
		
	public void add() {
		// TODO Auto-generated method stub
		int a=4,b=5,c;
		c=a+b;
		System.out.println("The addition of number is : "+c);
	}
	public void add(int a)
	{
		int c;
		int b=5;
		c=a+b;
		System.out.println(c);
	}
	public void add(int a,int b,int c)
	{
		int  d = a+b+c;
		System.out.println(d);
	}
	public void add(int a,int b,int c,int d)
	{
		int e = a+b+c+d;
		System.out.println(e);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Master m = new Master();
		m.add();
		m.add(3);
		m.add(3, 4, 6);
		m.add(1, 2, 3, 4);
		

	}

}
