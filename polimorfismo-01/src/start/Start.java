package start;

import entidade.Cachorro;
import entidade.Galinha;

public class Start {
	
	public static void main(String[] args){
		
		Cachorro pitbull = new Cachorro();
		
		pitbull.setNome("Rex");
		pitbull.setPeso(36);
		
		Galinha carijo = new Galinha();
		
		carijo.setNome("Fragolino");
		carijo.setPeso(7);
		
		pitbull.fazerBarulho();
		carijo.fazerBarulho();
		
		System.out.println(pitbull.getNome());
		System.out.println(pitbull.getPeso());
		
		
		System.out.println(carijo.getNome());
		System.out.println(carijo.getPeso());
	}

}
