package com.generic1.rishi;
/**
 * �������ʹ���������
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
		//obj.f();//�����޷����룬δ���巽����f();��Ϊ���Ͳ�������������ȷ��obj�Ƿ���f()����
	}
	public static void main(String[] args){
		Hasf hasf = new Hasf();
		Manipulator1<Hasf> manipulator1 = new Manipulator1<>(hasf);
		manipulator1.manipulate();
	}
}
