package br.com.teste.reflexao;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Refletion {

	public static List<String> listMethods(Class<?> classe)
	{
		Method[] listMethods = classe.getMethods();
		List<String> methods = new ArrayList<>();
		
		for (int i = 0; i < listMethods.length; i++)
		{
			methods.add(listMethods[i].getName() + "("+listMethods[i].getParameterTypes().getClass().getTypeName()+")");
			//System.out.println(listMethods[i].getName() + "("+listMethods[i].getReturnType().getSimpleName()+  ")");

		}
		
		return methods;
	}
	
	public static List<String> listProperties(Class<?> classe)
	{
		Field[] listFields = classe.getFields();
		List<String> fields = new ArrayList<>();
		
		for (int i = 0; i < listFields.length; i++)
		{
			fields.add(listFields[i].getName() + "("+listFields[i].getType().getSimpleName()+")");
			//System.out.println(listFields[i].getName() + "("+listFields[i].getName()+  ")");

		}
		
		return fields;
	}

	public static void main(String[] args) {
		Class<?> integer = Integer.class;
		
		listMethods(integer);
		System.out.println("#######################################################");
		listProperties(integer);

	}

}
