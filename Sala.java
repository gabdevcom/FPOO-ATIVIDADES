package Atividades_Gabriela_Miranda;

public class Sala extends Comodo {
		private  boolean temTv;
		private String sala;

		
		public Sala() {
			super();
		}
		
		
		public Sala(boolean tTv) {
			super();
			this.temTv = tTv;
		}
		
		public Sala (String salaN, boolean ttv1 ) {
			super();
			this.temTv= ttv1;
			this.setSala(salaN);
		}
		
		
		public boolean getTemTv() {
			return temTv;
		}

		public void setTemTv(boolean temTv) {
			this.temTv = temTv;
		}


		public String getSala() {
			return sala;
		}


		public void setSala(String sala) {
			this.sala = sala;
		}
		
		
}
