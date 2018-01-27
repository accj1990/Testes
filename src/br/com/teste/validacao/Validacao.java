package br.com.teste.validacao;

public interface Validacao{
 
	public String nome = "[[a-z-A-ZáàâãéèêíïóôõöúçñÁÀÂÃÉÈÍÏÓÔÕÖÚÇÑ]+ "
	          		+ "\\\\s [a-z-A-ZáàâãéèêíïóôõöúçñÁÀÂÃÉÈÍÏÓÔÕÖÚÇÑ]+]+ "
	          			+ "[\\\\s [a-z-A-ZáàâãéèêíïóôõöúçñÁÀÂÃÉÈÍÏÓÔÕÖÚÇÑ]+]*";
	
}
