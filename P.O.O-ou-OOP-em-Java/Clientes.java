/* 1 - Crie uma classe cliente e apresente os atributos e metodos referentes 
		esta classe, em seguida crie um objeto cliente, defina as instancias 
		deste objeto e apresente as informacoes deste objeto no console.*/

package P.O.O;

public class Clientes {
	
	//cliente da minha loja de roupas
	//declaracao dos atributos 
	private String nome;
	private String idade;
	private String telefone;
	private String email;
	
	//metodos no contrutor
	public Clientes (String nome, String idade, String telefone, String email)
	{
		this.nome = nome;
		this.idade = idade;
		this.telefone = telefone;
		this.email = email;
	}
	//declaracao dos demais metodos da classe
	
		public void imprimirInfo()
		{
			System.out.println("\nNome: " +nome+ "\nIdade: " +idade
					+ "\nTelefone: " +telefone+ "\nEmail: " +email);
		}
		
		//Get= pegar //Set=inserir
		public String getNome() 
		{return nome;}
		
		public void setNome(String nome) 
		{this.nome = nome;}
		
		public String getTelefone() 
		{return telefone;}
		
		public void setTelefone(String telefone) 
		{this.telefone = telefone;}
		
		public String getIdade() 
		{return idade;}
		
		public void setIdade(String idade) 
		{this.idade = idade;}
		
		public String getTamanhoRoupa() 
		{return email;}
		
		public void setTamanhoRoupa(String tamanhoRoupa) 
		{this.email = tamanhoRoupa;}
}
