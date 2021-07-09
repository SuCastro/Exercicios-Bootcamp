package P.O.O;

public class AnimalTeste {

	public static void main(String[] args) {
		
		Cachorro cachorro1 = new Cachorro ("Thor", 4 , "Golden Retriver", "Caramelo");
		cachorro1.infoCachorro();
		System.out.println("\n___________________________________________");
		
		Cavalo cavalo1 = new Cavalo ("Pé de pano", 12 , "Marajoara", "Branco");
		cavalo1.infoCavalo();
		System.out.println("\n___________________________________________");
                              
		Preguica preguica1 = new Preguica ("Flash", 8 , "mamífero", 3 );
		preguica1.infoPreguica();
		System.out.println("\n___________________________________________");

	}

}