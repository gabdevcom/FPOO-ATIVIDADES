package Atividades_Gabriela_Miranda;

public class Vaso {
	
	//atributos
		private String cor;
		private double tamanho;
		private String material;
		
		//construtores
		public Vaso(){
			
		}
		
		public Vaso(String cor, double tamanho, String material) {
			this.cor = cor;
			this.material = material;
			this.tamanho = tamanho;
		}
		
	//setter e getters

		public String getCor() {	
			return cor;
		}
		
		public void setCor (String c) {
			cor = c;
		}
			
		public String getMaterial() {	
			return material;
		}
		
		public void setMaterial (String m) {
			material = m;
		}
			

		public double getTamanho() {	
			return tamanho;
		}
		
		public void setTamanho(double t) {
			tamanho = t;
		}
			
		//metodos
		public void ExibirVaso() {
			System.out.println("Cor do vaso:  " + cor + "" + "Tamanho do vaso:  " +
		tamanho + "" + "Tipo de material do vaso:  " + material);
		}
		
		
		
}
