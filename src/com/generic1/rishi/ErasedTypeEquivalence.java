package com.generic1.rishi;
/**
 * ���͵����Ͳ���
 * ���Ͳ���----> it means ���Ͳ���ֻ�����ڱ����ڣ�������ʱ��JVM����֪�����͵Ĵ���
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
