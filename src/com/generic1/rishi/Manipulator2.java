package com.generic1.rishi;

/**
 * �������ʹ���������Ľ������1
 * @author Dell
 *@version 1.0
 * @param <T>
 */
public class Manipulator2<T extends Hasf>{
	private T obj;
	public Manipulator2(T obj){
		this.obj = obj;
	}
	public void manipulate(){
		obj.f();
	}
	public static void main(String[] args){
		Hasf hasf = new Hasf();
		Manipulator2<Hasf> manipulator2 = new Manipulator2<>(hasf);
		manipulator2.manipulate();
	}
}
