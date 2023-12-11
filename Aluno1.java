package Atividades_Gabriela_Miranda;

import java.util.Scanner;

public class Aluno1 extends Pessoa{
		private String nome;
		private float nota;
		public float media;
		
		
		public Aluno1(){
			super();
		}
		
		public void Aluno(String n, float nt){
			this.nome = n;
			this.nota = nt;
		}

		public String getNome() {	
			return nome;
		}
		
		public void setNome (String n) {
			nome = n;
		}
			
		public float getNota() {	
				return nota;
		}
			
		public void setNota(float nt) {
				this.nota = nt;
		}
	
		//metodos especiais 
		public void calcularMedia() {
			Scanner entrada = new Scanner(System.in);
			System.out.println("Digite a primeira nota:");
			float nota = entrada.nextFloat();
			System.out.println("Digite a segunda nota:");
			float nota1 = entrada.nextFloat();
			media = ((nota + nota1)/2);
			System.out.println("Sua media e " + media);
		}
		
		public void SituacaoFinal() {
			if (media >= 7) {
				System.out.println("Voce está aprovada(o)!" );
				} else if ( media < 7 ){
					System.out.println("Voce foi reprovada(o)!");
				}
			}
}
