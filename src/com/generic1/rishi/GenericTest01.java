package com.generic1.rishi;
/**
 *����ѧϰ
 *ʹ��ǿ��ת����ʹ�������κβ�����Ϊ����Ҫ������
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
		//�κβ�������������ת��ΪObject,so�����Խ����κβ�������
		GenericTest01 gt01 = new GenericTest01("Hello guys");
		//����Object���ͣ���Ҫǿ��ת����String����
		String s = (String)gt01.get();
		System.out.println(s);
		
		//����int���͵Ĳ���
		gt01.set(1);
		int i = (int)gt01.get();
		System.out.println(i);
	}
}
