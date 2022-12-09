package dio.me.praticandoLogicaComDesafiosDeCodigo;

import java.util.Locale;
import java.util.Scanner;

public class SeusPrimeirosIfsComJava {

	/*
	 * Fa�a um programa que calcule e imprima o sal�rio a ser transferido para um
	 * funcion�rio.
	 * 
	 * Para realizar o calculo receba o valor bruto do sal�rio e o adicional dos
	 * benef�cios. O sal�rio a ser transferido � calculado da seguinte maneira:
	 * 
	 * (valor bruto do sal�rio - percentual de imposto mediante ao sal�rio) +
	 * adicional dos benef�cios
	 * 
	 * Para calcular o percentual de imposto segue as aliquotas:
	 * 
	 * De R$ 0.00 a R$ 1100.00 = 5.00% De R$ 1100.01 a R$ 2500.00 = 10.00% 
	 * Maior que R$ 2500.00 = 15.00%
	 */

	public static void main(String[] args) {
		
		  Locale.setDefault(Locale.US);
		  Scanner sc = new Scanner(System.in);
		  float valorSalario = sc.nextFloat();
		  float valorBeneficios = sc.nextFloat();
		  
		  float valorImposto = 0;
		  if (valorSalario >= 0 && valorSalario <= 1100) {
			  valorImposto = 0.05F * valorSalario;
		  } else if(valorSalario >= 1101.01 && valorSalario <= 2500) {
			  valorImposto = 0.10F * valorSalario;
		  } else {
			  valorImposto = 0.15F * valorSalario;
		  }
		  
		  float saida = valorSalario - valorImposto + valorBeneficios;
		  System.out.println(String.format("%.2f", saida));
		  
		  sc.close();
		}
	}