import br.com.teste.validacao.anotacoes.Cliente;

public class Main {

	public static void main(String[] args) {
	
			
			try {
				Cliente c = new Cliente(null,"110.203.436-30");
			}catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
	}

}
