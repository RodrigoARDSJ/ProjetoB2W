package br.com.fiap.biblioteca.model;

public class Livro {
	protected Autor autores;
	protected String titulo;
	protected String editora;
	
	
	public Livro(String titulo, String autores, String editora) {
	    this.titulo = titulo;
	    this.autores.setNome(autores);
	    this.editora = editora; }
	
	

	public Livro() {
		// TODO Auto-generated constructor stub
	}



	public String getEditora() {
		return editora;
	}



	public void setAutores(Autor autores) {
		this.autores = autores;
	}



	public String getTitulo(){
	    return titulo; }

	public Autor getAutores(){
	    return autores; }

	public void setTitulo(String titulo){
	    this.titulo = titulo; }

	public void setAutores(int ind,String autores){ 
	    this.autores.setNome(autores);} 

	public void setEditora(String editora){
	    this.editora=editora; }

	public Object get(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	public void remove(int i) {
		// TODO Auto-generated method stub
		
	}

	public void remove(Livro livro) {
		// TODO Auto-generated method stub
		
	}
	}


