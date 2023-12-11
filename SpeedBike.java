package Atividades_Gabriela_Miranda;

public class SpeedBike implements Veiculo {
		public int velocidade;
		public int marcha;
		public int diminuirVelocidade;
		public String cor;
		public String modelo;
		
    public SpeedBike() {
    	
    }
    
    public SpeedBike( int vel, int m, int d, String mol, String cor) {
    	this.marcha = m;
    	this.velocidade = vel;
    	this.diminuirVelocidade = d;
    	this.cor = cor;
    	this.modelo = mol;
    	
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
	public String getFrear() {
		return getFrear();
	}

    public void estado() {
    	int velocidadefinal = velocidade - diminuirVelocidade;
    	if (velocidade > 700) {
    		System.out.println("Bike esta muito rapida!!");
    } else if (velocidade <= 20) {
    	System.out.println("Bike esta lenta!");
    }
    	System.out.println("Modelo: " + modelo + "   "+ "Cor:  " + cor +  "  " + "Qual a marcha? " + marcha + "     " + "Velocidade Inicial: " +
    			velocidade +  "     " + "Velocidade final: " + velocidadefinal);
    }

	@Override
	public String Modelo() {
		return modelo;
	}

	@Override
	public String Cor() {
		return cor;
	}
}
