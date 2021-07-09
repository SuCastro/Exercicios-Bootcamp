package P.O.O;

public class Preguica extends Animal {
	
	private String especie;
	private int numDedos;
	
	public Preguica (String nome, int idade, String especie, int numDedos) { //parametros
		super(nome, idade);
		this.especie = especie;
		this.numDedos = numDedos;
	}

	public String getRegiao() {
		return especie;
	}

	public void setRegiao(String especie) {
		this.especie = especie;
	}

	public int getNumDedos() {
		return numDedos;
	}

	public void setNumDedos(int numDedos) {
		this.numDedos = numDedos;
	}
	
	public void infoPreguica () {
		System.out.println("\nNome do pregui�a: " +getNome()+ "\nIdade do pregui�a: " +getIdade()+ 
		           "\nEsp�cie do pregui�a: " +especie+ "\nN�mero de dedos do Bixo Pregui�a: " +numDedos);
	}
}
