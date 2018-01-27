package br.com.teste.validacao.anotacoes;

import java.util.ArrayList;

class TesteValidatorGenerico {
	
	public static void main(String [] args)
	{
		Cliente a = new Cliente("Ana", "110.203.436-30");
		Cliente b = new Cliente("Ana Carolina", "11.203.436-30");
		Cliente c = new Cliente("Ana Carolina", "110.20.436-30");
		Cliente d = new Cliente("Ana", "110.20.436-30");
		Cliente e = new Cliente("Ana Carolina", "110..436-30");
		
		ArrayList<Object> lista = new ArrayList<>();
		lista.add(a);
		lista.add(b);
		lista.add(c);
		lista.add(d);
		lista.add(e);
		
		int i = 0;
		while (i < lista.size())
		{
			try {
				ValidatorDao.validate(lista.get(i));
			} catch (Exception e1) {
				
				e1.printStackTrace();
			}
			i++;
		}
	}

}
