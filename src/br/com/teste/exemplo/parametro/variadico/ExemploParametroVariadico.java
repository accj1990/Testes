package br.com.teste.exemplo.parametro.variadico;

public class ExemploParametroVariadico 
{
	public static void main(String[] args) 
	{
		System.out.println(somar(1,2,3));
		System.out.println(somar(1,2,3,4));
	}
	
	public static int somar (int... numero)
	{
		int soma = 0;
		for(int i = 0; i < numero.length; i++)
		{
			soma+=numero[i];
		}
		
		return soma;
	}
}
