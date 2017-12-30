
public class Fibonacci 
{
	public static void main(String[] args) 
	{
		int vet[]= new int[20]; // vetor para guardar a sequencia
		
		/* primeiros elementos */
		vet[0] = 0;
		vet[1] = 1;  
		
		// calcular a sequencia
		for(int i = 2; i<vet.length;i++)
		{
			vet[i] = (vet[i-1] + vet[i-2]);
		}
		
		// exibir a sequencia
		for(int i = 0; i < vet.length;i++)
		{
			System.out.println(vet[i]);
		}

	}

}
