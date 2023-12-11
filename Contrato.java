package AdocaoPet_Gabriela_Miranda;

public class Contrato {
		private int numContrato;

		public Contrato() {
			
			
		}
		
		
		public Contrato( int nc) {
			this.numContrato = nc;
			
		}
		public int getNumContrato() {
			return numContrato;
		}

		public void setNumContrato(int numContrato) {
			this.numContrato = numContrato;
		}
		
		public void assineContrato() {
			System.out.println(" Assine o contrato: ");
		}
}
