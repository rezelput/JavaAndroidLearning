package lab2;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String a;
	        Scanner scn = new Scanner(System.in);
	        System.out.println("������� �����: ");
	        if(scn.hasNextInt()){
	           a=scn.nextLine();
	           int c=0;
	           for(int i=0;i<a.length();i++){
	                char m=a.charAt(i);
	                c=(a.charAt(i)-48)+c;
	                
	            }
	            System.out.println("����� ���� ����� ���������� ����� ����� "+c);  
	        }
	        else System.out.println("������. �� ����� �� �����!");
	    }
	}


