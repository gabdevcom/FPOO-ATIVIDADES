package Atividades_Gabriela_Miranda;

public class TesteCao {

	public static void main(String[] args) {
		Cachorro c1 = new Cachorro("Mel", 20.50f, 'F', 4);
		Cachorro c2 = new Cachorro("Sansao", 50.50f, 'M', 4);
		Cachorro c3 = new Cachorro("Dalila", 46.50f, 'F', 4);
		
		System.out.println("Primeiro cachorro:  " + c1.getNome() + "  "+ c1.getPeso()
		+ "  " + c1.getQtdPatas() + " Patas] " + c1.getSexo());
		c1.Dormir();
		
		
		System.out.println("Segundo cachorro:  " + c2.getNome() + "  "+ c2.getPeso()
		+ "  " + c2.getQtdPatas() + "  Patas " + c2.getSexo());
		c2.Brincar();
		c2.Correr();
		
		
		System.out.println("Terceiro cachorro:  " + c3.getNome() + "  "+ c3.getPeso()
		+ "  " + c3.getQtdPatas() + "  Patas " + c3.getSexo());
		c3.Latir();
	}
}
