package com.generic1.rishi;
/**
 * 擦除类型带来的问题
 * @author Dell
 *@version 1.0
 */
class Hasf{
	public void f(){
		System.out.println("Hasf.f()");
	}
}
public class Manipulator1<T>{
	private T obj;
	public Manipulator1(T obj){
		this.obj = obj;
	}
	public void manipulate(){
		//obj.f();//此行无法编译，未定义方法发f();因为类型擦除，编译器不确定obj是否有f()方法
	}
	public static void main(String[] args){
		Hasf hasf = new Hasf();
		Manipulator1<Hasf> manipulator1 = new Manipulator1<>(hasf);
		manipulator1.manipulate();
	}
}
