package lab2;

import java.util.Scanner;

public class test {

	
	public static void main(String[] args) {
	           int a;
	        System.out.println("Please enter a number");
	        Scanner sc = new Scanner(System.in);
	        if (sc.hasNextInt()) {
	            a = sc.nextInt();
	            int y = 1;
	            for (int i = 1; i <= a; i++) {
	                y = y * i;
	            }
	            System.out.print(a + "!=");
	            System.out.print(y);
	        }
	    }
}