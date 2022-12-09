package dio.me.praticandoLogicaComDesafiosDeCodigo;

import java.util.Locale;
import java.util.Scanner;

public class SeusPrimeirosIfsComJava {

	/*
	 * Faça um programa que calcule e imprima o salário a ser transferido para um
	 * funcionário.
	 * 
	 * Para realizar o calculo receba o valor bruto do salário e o adicional dos
	 * benefícios. O salário a ser transferido é calculado da seguinte maneira:
	 * 
	 * (valor bruto do salário - percentual de imposto mediante ao salário) +
	 * adicional dos benefícios
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