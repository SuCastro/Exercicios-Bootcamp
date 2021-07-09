package P.O.O;

public class Cavalo extends Animal {

	private String raca;
	private String genero;
	
	public Cavalo (String nome, int idade, String raca, String genero) {
		super (nome, idade);
		this.raca = raca;
		this.genero = genero;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public void infoCavalo () { //nome do método (eu que crio)
		System.out.println("\nNome do cavalo: " +getNome()+ "\nIdade do cavalo: " +getIdade()+ 
		           			"\nRaça do cavalo: " +raca+ "\nGenero do cavalo: " +genero);
	}
	
	
}