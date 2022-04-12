package com.econ.input_output;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
 * (input output)����� byte ������ ����� �Ѵ�. 
 *  ������� �Է¹��� ���ڿ��� Ȯ���ϱ� ���ؼ��� ����Ʈ ������ ������ �ݺ������� �޾Ƽ� �����ؾ��Ѵ�.
 *  �ڹ��� ���ڿ��� 2����Ʈ�� �������� �Ǿ� �ֱ� ������ �⺻���� Input�� ����ϸ� ��Ȯ�� ���� ������ �� �� ����.
 *  
 *  stream�� buffer�� ����ϸ� �������� ���۰� �� ������ �Ѳ����� �޾Ƽ� ������ �� �ִ�.
 *  Ư�� BufferedReader.readLine()�� ���ΰ��� �������� ���ڸ� ��� �޾Ƽ� ������ �� �־ 
 *  1��Ʈ or 2����Ʈ�� ���ڰ� �����͵� ��Ȯ�ϰ� ������ ���ִ�. 
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
