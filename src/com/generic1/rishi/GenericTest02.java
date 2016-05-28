package com.generic1.rishi;
/**
 * Java泛型
 * @author Dell
 *@version 1.0
 */
public class GenericTest02<T> {
	private T a;
	public GenericTest02(T a){
		this.a = a;
	}
	public T get() {
		return a;
	}
	public void set(T a) {
		this.a = a;
	}
	public static void main(String[] args){
		//This time 指定泛型的参数类型为String
		GenericTest02<String> gt02 = new GenericTest02<>("Hey,I am here");
		String s = gt02.get();
		System.out.println(s);
		
		//ok,now,,,let us look others type can or cannot ;
		//gt02.set(1);//无法编译
	}
}
