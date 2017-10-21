/*	Exemplo de codigo Java que calcula os 10 primeiros
 * 	numeros primos. 
*/

class Primos
{
	public static void main(String [] args)
	{
		int cont = 1;
		int vet [] = new int [10];
		int primo = 2;
		vet [0] = primo;

		System.out.println(vet[0]);
		for (int i = 3; i < 50; i++)
		{
			if (cont < 10)
			{
                boolean isprimo = verificar(i, vet, cont);
				if (isprimo)
				{
					System.out.println(i);
					vet[cont] = i;
					cont++;
				}
				
			}
			else{break;}
		}
		
	}

	public static boolean verificar(int num, int vet[], int cont)
	{
		boolean isprimo = true;
		for (int i = 0; i< cont; i++)
		{
			if ((num%vet[i] == 0) && !(i == vet[i]))
			{
			   isprimo = false;
			   break;
			}

		}
		return isprimo;
	}

}