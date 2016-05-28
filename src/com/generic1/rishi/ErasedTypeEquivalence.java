package com.generic1.rishi;
/**
 * 泛型的类型擦除
 * 类型擦除----> it means 类型参数只存在于编译期，在运行时，JVM并不知道泛型的存在
 * @author Dell
 *@version 1.0
 */
import java.util.ArrayList;
public class ErasedTypeEquivalence {
	public static void main(String[] args){
		Class c1 = new ArrayList<String>().getClass();
		Class c2 = new ArrayList<Integer>().getClass();
		System.out.println(c1==c2);
		
	}
}
