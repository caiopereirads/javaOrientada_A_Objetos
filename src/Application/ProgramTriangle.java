package Application;

import java.util.Locale;
import java.util.Scanner;
import Entities.Triangle;
public class ProgramTriangle {
 /* Faze um programa para ler as medidas dos lados de dois triangulos.
  * Mostrar a área dos dois triangulos
  * Mostrar qual é maior*/
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Insira as medidas do triangulo X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Insira as medidas do triangulo Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double tX = (x.a + x.b + x.c)/2;
		double areaX = Math.sqrt(tX * (tX-x.a)*(tX-x.b)*(tX-x.c));
		
		double tY = (y.a + y.b + y.c)/2;
		double areaY = Math.sqrt(tY * (tY-y.a)*(tY-y.b)*(tY-y.c));
		
		
		
		
		System.out.printf("Medida do triângulo X: %.4f%n ",areaX);
		System.out.printf("Medida do triângulo Y: %.4f%n",areaY);
		
		if(areaX > areaY) {
			System.out.println("Maior área: X");
		}
		else {
			System.out.println("Maior área: Y");
		}
		sc.close();
		
	}

}
