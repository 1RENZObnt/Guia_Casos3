package com.Senati.ETI;

import java.util.Scanner;

public class Caso4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=0,i=1,num_mayor=0;
		while(i<=4) {
			System.out.print("ingrese numero "+ i + ": ");
			n=sc.nextInt();
			if (n>num_mayor)
				num_mayor=n;
			i++;
			
		}
	System.out.println("/nResultados");
	System.out.println("--------------------");
	System.out.println("el numero mayor es: "+num_mayor);
	
	
	
	
	}
	
	
	

}
