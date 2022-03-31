package com.econ.lib;

public class StringParseInt {

	String str_num; //�޾ƿ;��ϴ� �ʵ� "1a23"
	char [] c_num; //= {'1','a','2','3'};    "1a23".split("")={"1","a","2","3"} (x)
	int num; //123 //=>Integer.paseint("123")
	//public StringParseInt(){} //�����Ǿ� �ִٰ� �����ϸ� �������.
	private boolean check_num; //����ȯ ������ ���ڿ����� üũ�ϴ� �ʵ�
	private String check_str_num; //forceParseInt �����
	public StringParseInt(String str_num) { 
		//�������� ������ ��ü�� ó�������� �� �� �ʿ��� ���� �ʱ�ȭ �ϱ� ���ؼ���.
		this.str_num=str_num;
		this.c_num=new char[str_num.length()];
		for(int i=0; i<str_num.length(); i++) {
			this.c_num[i]=(char)str_num.charAt(i);
			//this �� ��ü ���ο��� �ʵ带 �����ϴ� ������
		}
	}
	//function parsIntCheck(){ return this.check_num; }
	/**
	 * ���ڿ��� ������ �ƴ� ���� ã���� false�� ��ȯ
	 * ��) "1a93" => false
	 *     "1234" => true
	 */
	public boolean parseIntCehck() {
		check_num=true;//�ڹٴ� this �������� 
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
	 * ���ڿ��� ������ �ƴ� ���� ã�Ƽ� ������ �� ��ȯ�� �ִ� �Լ�
	 * ��) "1a93" =>"193"
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
			System.out.println(str+"�� ������ ����ȯ �Ұ��� ���ڿ��Դϴ�.");
			int num=Integer.parseInt( spi.forceParseInt() );
			System.out.println(str+"�� ������ ����ȯ ������ ������ ���� :"+num);
		}
		
		
		for(int i=0; i<spi.c_num.length; i++) {
			System.out.print(spi.c_num[i]+",");
		}
	}
}




