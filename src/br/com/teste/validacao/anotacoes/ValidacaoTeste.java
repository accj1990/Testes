package br.com.teste.validacao.anotacoes;

import java.util.Iterator;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

public class ValidacaoTeste {
	public static void main(String [] args)
	{
		//Cliente c = new Cliente("Ana Carolina", "110.203.436-30");
		Cliente c = new Cliente(null, "110.203.436-30"); // decomente para testar e comente os demais clientes
		//Cliente c = new Cliente("Ana", "110.203.436-30");
		//Cliente c = new Cliente("Ana Carolina", "11.203.436-30");	// decomente para testar e comente os demais clientes
		//Cliente c = new Cliente("Ana", "11.203.436-30"); // decomente para testar e comente os demais clientes


		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator ();
		
		Set<ConstraintViolation<Cliente>> constraintViolations = validator.validate(c);
		Iterator<ConstraintViolation<Cliente>> iterator = constraintViolations.iterator();
        while (iterator.hasNext()){
        	ConstraintViolation<Cliente> error = iterator.next();
        	String msgError = error.getMessage(); 
    		System.out.println (msgError);
        }
		
		
	}
}

