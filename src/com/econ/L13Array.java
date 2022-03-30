package com.econ;
class Month{
	int month; //1,2,3,4~12
	String en_month;//Jan,Feb ....
	String kr_month;//1월,2월
	Month(int month, String en_month){
		this.month=month;
		this.en_month=en_month;
		this.kr_month=month+"월";
	}
}

public class L13Array {
	public static void main(String[]args) {
		//Array는 인덱스를 참조키로 사용하는 참조형 데이터 타입
		//인덱스와 길이를 제외하고 Object의 필드로만 구성된 경량 배열 타입이다.
		String [] month= {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
		Month [] obj_mon= {new Month(1,"Jan"),new Month(2,"Feb"),new Month(3,"Mar"),new Month(4,"Apr") ,new Month(5,"May") ,new Month(6,"Jul") ,new Month(12,"Dec")};
		
		int[] p_arr={-3000,1000,12000,2500,500,3000};
		System.out.println(p_arr.length);
		System.out.println(p_arr[4]);
		try {
			System.out.println(p_arr[5]);//길이는 1부터, index는 0부터 시작			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("실행 좀 되어주세요!");
		
		int p_arr_total=0;
		
		for(int i=0;i<p_arr.length; i++) {
			p_arr_total+=p_arr[i];
		}
		System.out.println(p_arr_total+"won");
		int max = 0; //처음에 발견한 것이 max
		int max_i=0;
		for(int i=0; i<p_arr.length; i++) {
			if(i==0) {
				max=p_arr[i];
			}else{
				if( max < p_arr[i] ) {
					max=p_arr[i];
					max_i=i;
				}
			}
		}
		System.out.println(max_i+":"+max);
		//최소값을 찾으세요
		//최대값을 맨앞으로 옮겨서 정렬하세요 (선택 정렬)
		String [] weeks=new String[7];
		weeks[0]="월요일";
		weeks[1]="화요일";
		weeks[2]="수요일";
		weeks[3]="목요일";
		weeks[4]="금요일";
		weeks[5]="토요일";
		weeks[6]="일요일";
		String [] weeks2= {"월","화","수","목","금","토","일"};	
	}
}



