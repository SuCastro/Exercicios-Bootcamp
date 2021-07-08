/* 2 - 	Crie uma classe avião e apresente os atributos e métodos referentes 
 		esta classe, em seguida crie um objeto avião, defina as instancias 
 		deste objeto e apresente as informações deste objeto no console. */

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
		String infoAviao = "\nCompanhia Áerea: " +companhiaAerea+ "\nModelo avião: " +modeloAviao+ "\nPaís do avião: " +paisAviao+ "\nAno: " +ano;
		return infoAviao;
	}
}
