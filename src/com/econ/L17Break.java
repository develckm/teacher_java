package com.econ;
class StringParseInt{
	char [] c_num= {'9','a','1','2'}; //912 ����ϰ� �ִµ�  "9a12"�� ���Ե� ���ڿ�
	public StringParseInt(String nums){ //"91a12"=>9112
		//nums=>this.c_1num ���� ����  
	}
	public boolean checkInt() { //������ ���ڿ����� üũ
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
				continue; //����Ʃ�� ������ �������� �ٽ� �ݺ��� ���� �������� �ǵ��ư���.
			}
			s_num+=c_num[i]; //a�� ���� �����ϰ� ���ϰ� �ʹ�.				
		}
		System.out.println(Integer.parseInt(s_num)+10);
		
		String nums="16a7b5"; //=>"1675"�� �ٲ㼭 +10 ������ �ϼ���! 
		
		//���� ����ȯ �������� �˻� �� ��ȯ �Ұ��� false�� ��ȯ 
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
		System.out.println("�� ��ȯ ����?:"+num_check);
	}
}






