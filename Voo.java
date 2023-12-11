package Atividades_Gabriela_Miranda;

import java.time.LocalDate;

public class Voo {
		private int numeroVoo;
		private String origem;
		private String destino;
		private double preco;
		private LocalDate dataIda;
		private  LocalDate dataVolta;
		
		public Voo(){
			
		}
		
		public Voo(int nv, String o, String d, double p, LocalDate di, LocalDate dv) {
			this.dataIda = di;
			this.dataVolta = dv;
			this.destino = d;
			this.numeroVoo = nv;
			this.preco = p;
			this.origem = o;
		}
		
		public int getNumeroVoo() {
			return numeroVoo;
		}
		public void setNumeroVoo(int numeroVoo) {
			this.numeroVoo = numeroVoo;
		}
		public String getOrigem() {
			return origem;
		}
		public void setOrigem(String origem) {
			this.origem = origem;
		}
		public String getDestino() {
			return destino;
		}
		public void setDestino(String destino) {
			this.destino = destino;
		}
		public double getPreco() {
			return preco;
		}
		public void setPreco(double preco) {
			this.preco = preco;
		}
		public LocalDate getDataIda() {
			return dataIda;
		}
		public void setDataIda(LocalDate dataIda) {
			this.dataIda = dataIda;
		}
		public LocalDate getDataVolta() {
			return dataVolta;
		}
		public void setDataVolta(LocalDate dataVolta) {
			this.dataVolta = dataVolta;
		}
	
		public LocalDate dataEstaDisponivel() {
			return dataIda;
			
		}
		
		public void MostrarDetalhes() {
			System.out.println("Origem:  " + origem + "\n Destino: "
					+ destino + "\n Preco: " + preco + " \n Ida: " + dataIda + "\n Volta:  " + dataVolta );
		}
}
		



