package com.generic1.rishi;
/**
 * Java����
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
		//This time ָ�����͵Ĳ�������ΪString
		GenericTest02<String> gt02 = new GenericTest02<>("Hey,I am here");
		String s = gt02.get();
		System.out.println(s);
		
		//ok,now,,,let us look others type can or cannot ;
		//gt02.set(1);//�޷�����
	}
}
