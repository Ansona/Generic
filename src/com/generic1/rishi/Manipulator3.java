package com.generic1.rishi;
/**
 * 泛型带来的问题解决办法2
 * @author Dell
 *
 */
public class Manipulator3{
	private Hasf obj;
	public Manipulator3(Hasf obj){
		this.obj = obj;
	}
	public void manipulate(){
		obj.f();
	}
	public static void main(String[] args){
		Hasf hasf = new Hasf();
		Manipulator3 manipulator3 = new Manipulator3(hasf);
		manipulator3.manipulate();
	}
}