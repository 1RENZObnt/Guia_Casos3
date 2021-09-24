package com.Senati.ETI;
import java.util.Scanner;
public class Caso6 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		String nombre="",estado="",rp="S";
		int edad=0,nr=0,n_apto=0;
		
		while (rp.equals("S")||rp.equals("s")) {
			nr++;
			
			System.out.println("--------------");
			System.out.println("Registro N. "+nr);
			System.out.println("--------------");
			System.out.print("participante...: ");
			nombre=sc.nextLine();
			System.out.println("Edad.........: ");
			edad=sc.nextInt();
			
			if (edad>=18) {
				estado="Apto para votar";
				n_apto++;
			}
			else
				estado="Menor de edad";
			
			System.out.println("Estado.......: "+estado);
			//reiniciar el bufer de lectura
			sc.nextLine();
			System.out.println("¿Desea registrar otro participante? <S/N>");
			rp=sc.nextLine();
			}
		System.out.println("\nRESULTADO");
		System.out.println("-----------");
		System.out.println("Número de participantes..: "+nr);
		System.out.println("Aptos para votar.........: "+n_apto);

		

	}

}
