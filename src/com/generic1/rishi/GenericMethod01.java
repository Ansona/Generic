package com.generic1.rishi;

/**
 * ·ºÐÍ·½·¨
 * @author Dell
 *@version 1.0
 */
public class GenericMethod01 {
	public <K,V> void f(K k,V v){
		System.out.println(k.getClass().getSimpleName());
		System.out.println(v.getClass().getSimpleName());
	}
	public static void main(String[] args) {
		GenericMethod01 gm01 = new GenericMethod01();
		gm01.f(new String("aaa"), new Integer(2));
	}
}
