package br.com.fiap.biblioteca.model;



public class Biblioteca extends Livro{
	int[] totalLivros;
	Livro livro;
	
	public Biblioteca(int[] totalLivros){
		super();
		this.totalLivros = totalLivros;
	}
	
	public Biblioteca(){
		this.totalLivros = new int[10];	

	}

	public void adiciona(Livro livro){
		this.adiciona(livro);
		if(totalLivros[10] > 10){
			System.err.println("Não foi possivel adicionar mais livros");
		}else{
			System.out.println("Livros adicionado com sucesso");
		}
	}
	 

	public void remover(String titulo){
	    for (int i = 0; i < totalLivros.length; i++) {  
		if (livro.get(i).equals(titulo))   
	        livro.remove(i); 
	      else System.out.println("Livro não encontrado");
	    } 
	}

	public void remover(Livro livro){
	    livro.remove(livro); }
	    
	 public Livro retornaLivro(String titulo){  
	    for (int i = 0; i < totalLivros.length; i++) {    
	      if (livro.get(i).equals(titulo))     
	        return (Livro) livro.get(i);}    
	        return null;}   

	public int atualiza(int[] totalLivros){
	    this.totalLivros = totalLivros;
	    return totalLivros.length; 
	   }
	
	public boolean cheio(){
		if(totalLivros[10] > totalLivros[10]){
			return true;
		}
		return false;
	}
	
	public boolean vaio(){
		if(totalLivros[10] <= -1 ){
			return false;
		}
		return true;
	}

}


