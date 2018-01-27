package br.com.teste.validacao;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Validar {
	String parametro();
	String formato();
	String mensagem() default "Parâmetro informado é inválido.";
	String metodo();
}
