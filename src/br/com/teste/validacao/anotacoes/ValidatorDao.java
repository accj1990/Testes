package br.com.teste.validacao.anotacoes;

import java.util.Iterator;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

/*
 * Validador generico
 * 
 */
public class ValidatorDao {
	
	public static Exception validate(Object e) throws Exception
	{
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator ();
		
		Set<ConstraintViolation<Object>> constraintViolations = validator.validate(e);
		Iterator<ConstraintViolation<Object>> iterator = constraintViolations.iterator();
		ConstraintViolation<Object> error;
		String msgError = null;
        while (iterator.hasNext()){
        	error = iterator.next();
        	msgError = error.getMessage(); 
    		//System.out.println (msgError);
        	if(msgError != null)
        	{
        		Exception exception = new Exception(msgError);
        		return exception;
        	}
        }
        
        return null;
	}

}
