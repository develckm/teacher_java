package com.econ.exception;

class Calc{
	private int a,b;
	Calc(int a,int b){
		this.a=a;
		this.b=b;
	}
	public int div() throws Exception{
		//�������� : ����ϴ� �ʿ���  Try catch �ۼ��� �����Ѵ�. 
		return a/b;
	}
	public int sum() {
		return a+b;
	}
}
public class L01TryCatch {
	//main�� throws �� ����ϸ� ����ó���� ���� �ʴ´ٴ� �ǹ̴�. (main�� ��� �ڵ��� ���� ����ڱ� ����)
	public static void main(String[]args){
		Calc c=new Calc(10, 0);
		try {
			System.out.println(c.div());
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("������ ���� �ʾƵ� �������� ������ ����"); 
			//����� �Ҷ� ����� ���� ���� �� ���ȴ�. ��) mysql conn�� end()�ؾ��ϴ� ��  
		}
		System.out.println(c.sum()); //������ �߻��ϸ� �ý����� �����.-> ������ ����ó���� �ؾ��Ѵ�. 
	}
}
