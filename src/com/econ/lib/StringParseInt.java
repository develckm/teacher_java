package com.econ.lib;

public class StringParseInt {

	String str_num; //받아와야하는 필드 "1a23"
	char [] c_num; //= {'1','a','2','3'};    "1a23".split("")={"1","a","2","3"} (x)
	int num; //123 //=>Integer.paseint("123")
	//public StringParseInt(){} //생략되어 있다가 정의하면 사라진다.
	private boolean check_num; //형변환 가능한 문자열인지 체크하는 필드
	private String check_str_num; //forceParseInt 실행결
	public StringParseInt(String str_num) { 
		//생성자의 목적은 객체를 처음생성할 때 꼭 필요한 것을 초기화 하기 위해서다.
		this.str_num=str_num;
		this.c_num=new char[str_num.length()];
		for(int i=0; i<str_num.length(); i++) {
			this.c_num[i]=(char)str_num.charAt(i);
			//this 는 객체 내부에서 필드를 접근하는 접근자
		}
	}
	//function parsIntCheck(){ return this.check_num; }
	/**
	 * 문자열에 정수가 아닌 것을 찾으면 false를 반환
	 * 예) "1a93" => false
	 *     "1234" => true
	 */
	public boolean parseIntCehck() {
		check_num=true;//자바는 this 생략가능 
		//c_num={'1,','a','2','3'}
		for(int i=0; i<c_num.length;i++) {
			if(!(c_num[i]>=48 && c_num[i]<=57)) {
				check_num=false;
				return check_num;
			}	
		}
		return check_num; 
	}
	/**
	 * 문자열에 정수가 아닌 것을 찾아서 제거한 후 반환해 주는 함수
	 * 예) "1a93" =>"193"
	 */
	public String forceParseInt() {
		//c_num= {'1','a','2','3'}; 
		check_str_num="";
		for(int i=0; i<c_num.length;i++) {
			if(c_num[i]>=48 && c_num[i]<=57) {
				check_str_num+=c_num[i];				
			}
		}
		return check_str_num;
	}
}

class TestJRE{
	public static void main(String[]args) {
		//const arr=new Array(1,2,3);
		//const arr=[1,2,3];		
		//a[1]=13;
		String str="78a9b5"; //=>7895
		StringParseInt spi=new StringParseInt(str);
		//System.out.println("spi.check_num:"+spi.check_num);
		
		if(spi.parseIntCehck()){
			int num=Integer.parseInt(str);
			System.out.println("num:"+num);
		}else {
			System.out.println(str+"은 정수로 형변환 불가한 문자열입니다.");
			int num=Integer.parseInt( spi.forceParseInt() );
			System.out.println(str+"을 강제로 형변환 가능한 정수로 변형 :"+num);
		}
		
		
		for(int i=0; i<spi.c_num.length; i++) {
			System.out.print(spi.c_num[i]+",");
		}
	}
}




