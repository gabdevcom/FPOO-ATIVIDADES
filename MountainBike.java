package Atividades_Gabriela_Miranda;

public class MountainBike implements Veiculo{
		public int velocidade;
		public int marcha;
		public int diminuirVelocidade;
		
		public MountainBike() {
			
		}
		
		public MountainBike(int v, int m, int d) {
			this.marcha = m;
			this.velocidade = v;
			this.diminuirVelocidade = d;
		}
		
		  public void estado() {
		    	int velocidadefinal = velocidade - diminuirVelocidade;
		    	if (velocidade > 1) {
		    		System.out.println("esta em movimento!");
		    } else if (velocidade <= 0) {
		    	System.out.println("esta parado...");
		    }
		    	System.out.println("Qual a marcha? " + marcha + "     " + "Velocidade Inicial: " +
		    			velocidade +  "     " + "Velocidade final: " + velocidadefinal);
		    }
		@Override
		public String mudarMarcha() {
			return null;
		}

		@Override
		public void acelerar() {
       System.out.println("Esta acelerando . . . ");
		}

		@Override
		public void frear() {
			System.out.println("Esta freando . . .");
			
		}
}
