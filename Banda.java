package Atividades_Gabriela_Miranda;

import java.util.List;

public class Banda {
		private String nome;
		private List<MembroBanda> membros;
		
		
		public Banda() {
			
		}
		public Banda( List<MembroBanda> m) {
			this.membros = m;
		}
		
		
		
		public String getNome() {
			return nome;
		}
	
		public void setNome(String nome) {
			this.nome = nome;
		}
		public List<MembroBanda> getMembros() {
			return membros;
		}
		public void setMembros(List<MembroBanda> membros) {
			this.membros = membros;
		}
		
		public List<MembroBanda> getAdicionarMembro() {
			return membros;
		     
		}
		
		public void realizarShow() {
			System.out.println("Os artistas subiram no palco!!!!");
		}
}
