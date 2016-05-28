package com.generic1.rishi;
/**
 *泛型学习
 *使用强制转化，使得输入任何参数成为你想要的类型
 * @author Dell
 *@version 1.0
 */
public class GenericTest01 {
	private Object a;
	public GenericTest01(Object a){
		this.a = a;
	}
	public void set(Object a){
		this.a = a;
	}
	public Object get(){
		return a;
	}
	public static void main(String[] args){
		//任何参数都可以向上转型为Object,so它可以接受任何参数类型
		GenericTest01 gt01 = new GenericTest01("Hello guys");
		//返回Object类型，需要强制转换成String类型
		String s = (String)gt01.get();
		System.out.println(s);
		
		//接受int类型的参数
		gt01.set(1);
		int i = (int)gt01.get();
		System.out.println(i);
	}
}
