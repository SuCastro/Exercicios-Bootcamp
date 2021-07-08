package P.O.O;

public class AviaoTeste {

	public static void main(String[] args) {
		Aviao aviao1 = new Aviao("AirFrance", "Boing A320", "França", 2020);
		aviao1.getinfoAviao();
		
		System.out.println(aviao1.getinfoAviao());
		
		Aviao aviao2 = new Aviao ("Azul", "Boing A187", "Brazil", 2018);
		aviao2.getinfoAviao();
		
		System.out.println(aviao2.getinfoAviao());
	}

}
