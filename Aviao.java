/* 2 - 	Crie uma classe avi�o e apresente os atributos e m�todos referentes 
 		esta classe, em seguida crie um objeto avi�o, defina as instancias 
 		deste objeto e apresente as informa��es deste objeto no console. */

package P.O.O;

public class Aviao {
	private String companhiaAerea;
	private String modeloAviao;
	private String paisAviao;
	private int ano;
	
	public Aviao (String companhiaAerea, String modeloAviao, String paisAviao, int ano)
	{
		this.companhiaAerea = companhiaAerea;
		this.modeloAviao = modeloAviao;
		this.paisAviao = paisAviao;
		this.ano = ano;
	}
	
	public String getinfoAviao()
	{
		String infoAviao = "\nCompanhia �erea: " +companhiaAerea+ "\nModelo avi�o: " +modeloAviao+ "\nPa�s do avi�o: " +paisAviao+ "\nAno: " +ano;
		return infoAviao;
	}
}