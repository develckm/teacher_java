package com.econ.exception;

class Calc{
	private int a,b;
	Calc(int a,int b){
		this.a=a;
		this.b=b;
	}
	public int div() throws Exception{
		//예외위임 : 사용하는 쪽에서  Try catch 작성을 강제한다. 
		return a/b;
	}
	public int sum() {
		return a+b;
	}
}
public class L01TryCatch {
	//main에 throws 를 사용하면 예외처리를 하지 않는다는 의미다. (main이 모든 코드의 최종 사용자기 때문)
	public static void main(String[]args){
		Calc c=new Calc(10, 0);
		try {
			System.out.println(c.div());
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("오류가 뜨지 않아도 마지막에 무조건 실행"); 
			//통신을 할때 연결된 망을 끈을 때 사용된다. 예) mysql conn을 end()해야하는 것  
		}
		System.out.println(c.sum()); //오류가 발생하면 시스템이 멈춘다.-> 꼭꼭꼭 예외처리를 해야한다. 
	}
}
