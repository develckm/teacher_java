package com.econ.input_output;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
 * (input output)통신은 byte 단위로 통신을 한다. 
 *  통신으로 입력받은 문자열을 확인하기 위해서는 바이트 단위의 정보를 반복문으로 받아서 조합해야한다.
 *  자바의 문자열은 2바이트의 조합으로 되어 있기 때문에 기본적인 Input을 사용하면 정확한 문자 조합을 할 수 없다.
 *  
 *  stream과 buffer를 사용하면 데이터의 시작과 끝 지점을 한꺼번에 받아서 조합할 수 있다.
 *  특히 BufferedReader.readLine()은 라인개행 전까지의 문자를 모두 받아서 조합할 수 있어서 
 *  1바트 or 2바이트의 문자가 섞여와도 정확하게 조합할 수있다. 
 * 
 * */
public class L02InputStream {
	public static void main(String[]args) {
		InputStreamReader isr=null;
		BufferedReader br=null;
		
		isr=new InputStreamReader(System.in);
		br=new BufferedReader(isr);
		String line="";
		try {
			if((line=br.readLine())!=null) {
				System.out.println("line:"+line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
