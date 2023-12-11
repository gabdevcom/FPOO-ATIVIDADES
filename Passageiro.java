package Atividades_Gabriela_Miranda;

public class Passageiro {
	 private String nome;
	 private String sobrenome;
	 private String email;
	 
	 public Passageiro() {
		 
	 }
	 
	 public Passageiro( String n, String s, String e) {
		 this.email = e;
		 this.nome = n;
		 this.sobrenome = s;
	 }
	 
	 
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	 
}
