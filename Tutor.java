package AdocaoPet_Gabriela_Miranda;

public class Tutor {
		private String nome;
		private int idade;
		private double telefone;
		private double cpf;
		private String email;
		private String endereco;
		
		
		public Tutor() {
			
		}
		
		
		public Tutor(String nome, int idade, int telefone, double cpf, String email, String endereco) {
			super();
			this.nome = nome;
			this.idade = idade;
			this.telefone = telefone;
			this.cpf = cpf;
			this.email = email;
			this.endereco = endereco;
		}



		public String getNome() {
			return nome;
		}


		public void setNome(String nome) {
			this.nome = nome;
		}


		public int getIdade() {
			return idade;
		}


		public void setIdade(int idade) {
			this.idade = idade;
		}


		public double getTelefone() {
			return telefone;
		}


		public void setTelefone(int telefone) {
			this.telefone = telefone;
		}


		public double getCpf() {
			return cpf;
		}


		public void setCpf(double cpf) {
			this.cpf = cpf;
		}


		public String getEmail() {
			return email;
		}


		public void setEmail(String email) {
			this.email = email;
		}


		public String getEndereco() {
			return endereco;
		}


		public void setEndereco(String endereco) {
			this.endereco = endereco;
		}
		
	public void assinarContrato() {
			System.out.println("Assinando. . . pode levar para casa!!");
		}
}
