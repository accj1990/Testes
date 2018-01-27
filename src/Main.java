import br.com.teste.anotacoes.Cliente;

public class Main {

	public static void main(String[] args) {
	
			
			try {
				Cliente c = new Cliente("Ana","110.203.436-30");
			}catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
	}

}
