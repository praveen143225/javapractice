package com.createiq.basics;

public class MainClass4 {
	// main method;
	int a=125;
	int b=243;
	int c=145;
	int d=421;
	public void add(int f,int g) {
		System.out.println(f+g);
		System.out.println(g-f);
		System.out.println(f*g);
		System.out.println(g/f);
		System.out.println(g%f);
	}
	
	public static void main(String [] args) {
		
		int a=20;
		int b=40;
		int f=212;
		int d=35;
		System.out.println(a+b);
        System.out.println(b-a);
        System.out.println(f*a);
		System.out.println(d/a);
		System.out.println(f%a);
		
		// Object creation for createIq
	
		//CreateIq c = new CreateIq();
	//	c.Hello();
	//	c.Hi();
	//	c.morning();
	//	c.love();
		MainClass4 m=new MainClass4();
		m. a=125;
		m. b=243;
		m. c=145;
		m. d=421;
		System.out.println(m.a + m.b);
		System.out.println(m.c * m.d);
		System.out.println(m.d / m.a);
		System.out.println(m.c % m.b);
        System.out.println(m.d - m.b);
        m.add(26,35);
        
        

}
}