package com.econ;
class StringParseInt{
	char [] c_num= {'9','a','1','2'}; //912 기대하고 있는데  "9a12"가 포함된 문자열
	StringParseInt(String nums){
		//nums=>this.c_num 변형 대입  
	}
	public boolean checkInt() { //정수의 문자열인지 체크
		return false;
	}
	public int forceParseInt(){
		//this.c_num;
		int pars_c=0; //aa919=>912   (9a19=>919)
		return pars_c;
	}
}


public class L17Break {
	public static void main(String[]args) {
		char [] c_num= {'9','a','1','2'}; 
		String s_num="";
		for(int i=0; i<c_num.length; i++) {
			if( c_num[i]<47 || c_num[i]>58){
				continue; //컨디튜를 실행한 시점에서 다시 반복문 실행 시점으로 되돌아간다.
			}
			s_num+=c_num[i]; //a일 때는 제외하고 더하고 싶다.				
		}
		System.out.println(Integer.parseInt(s_num)+10);
		
		String nums="16a7b5"; //=>"1675"로 바꿔서 +10 연산을 하세요! 
		
		//수로 형변환 가능한지 검사 후 변환 불가면 false를 반환 
		boolean num_check=true;
		
		for(int i=0; i<nums.length(); i++) {
			char c=nums.charAt(i);
			if(c<48||c>57) {
				num_check=false;
				break;
			}else {
				num_check=true;
			}
		}
		System.out.println("형 변환 가능?:"+num_check);
	}
}






