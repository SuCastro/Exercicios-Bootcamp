package P.O.O;

public class ClientesTeste {

	public static void main(String[] args) 
	{//instanciar os objetos da classe
		
		 Clientes cliente1= new Clientes ("Suellen Castro Pires", "22 anos", "(11) 94002-8922", "suellen.cpires@outlook.com");
		 cliente1.imprimirInfo();
		 
		 Clientes cliente2= new Clientes ("Vinicius Alipio da Silva", "25 anos", "(11) 12345-5789", "vinialipio@gmail.com");
		 cliente2.imprimirInfo();
		 
		 Clientes cliente3= new Clientes ("Kaique B. S. Reis", "23 anos","(11) 99999-9999", "kaiquereis@outlook.com");
		 cliente3.imprimirInfo();
	}
}