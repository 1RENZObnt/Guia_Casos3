package com.Senati.ETI;
import java.util.Scanner;

public class Caso7 {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("nombre...........:");
		String nombre=sc.nextLine();
		//for de fora ascendente de 1 en 1
		
		for(int x =1; x <=10;x++) {
			System.out.println(x+". Bienvenido(a) "+ nombre + " al curso. ");
		}

	}

}
