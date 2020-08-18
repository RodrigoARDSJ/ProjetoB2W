package br.com.fiap.biblioteca.model;

import java.util.Scanner;

public class Main {
	private static Biblioteca b1;

	public static void main(String[] args){	
	
		
	    System.out.println("O que deseja fazer?");
	    System.out.println("");
	    System.out.println("1- Adicionar Livro");
	    System.out.println("2- Excluir Livro");
	    System.out.println("5- Pesquisar Livro (por título)");
	    System.out.println("6- Listar Livros Cadastrados");
	    System.out.println("0- Sair");
	    System.out.println("");
	    System.out.print("Digite sua opção: ");
	    
	    Scanner entrada  = new Scanner(System.in);
	    Biblioteca b = new Biblioteca();
	    String s1,s2,s3;
	    boolean continuar=true;
	    
	          
	          switch (entrada.nextInt()) {
	            case 1: 
	                    System.out.print("Digite o nome do Livro: ");
	                    s1 = entrada.nextLine();
	                    System.out.print("Digite o autor: ");
	                    s2 = entrada.nextLine();
	                    System.out.print("Digite a editora: ");
	                    s3 = entrada.nextLine();
	                    b.adiciona(b);break;
	            case 2: 
	                    System.out.print("Digite o titulo do livro que deseja remover: ");
	                    s1=entrada.nextLine();
	                    b.remover(s1);break;                
	            case 3: 
	                    System.out.print("Digite o nome da Editora que deseja adicionar: ");
	                    s1=entrada.nextLine();
	            case 4: 
	                    System.out.print("Digite o nome da Editora que deseja remover: ");
	                    s1=entrada.nextLine();
	            case 5: 
	                    System.out.print("Digite o nome do livro que deseja buscar: ");
	                    s1=entrada.nextLine();
	                    b.retornaLivro(s1);break;
	            case 6: 
				b1 = null;
				b1.atualiza(null);break;
	            case 0: //====================================================
	                    continuar=false; break;
	                    }
	}}
	         
	        
	
