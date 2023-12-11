package Atividades_Gabriela_Miranda;

abstract public class Pessoa {
	//atributos
	private String nome;
	private String endereco;
    private int telefone;
    private int cpf;
    private int celular;
    //construtor
    
    public Pessoa() {
    }
    
    
    //setter e getter 
    public String getNome() {	
		return nome;
	}
	
	public void setNome (String n) {
		nome = n;
	}

	public String getEndereco() {	
		return endereco;
	}
	
	public void setEndereco (String e) {
		endereco = e;
	}
    
	public int getTelefone() {	
		return telefone;
	}
	
	public void setTelefone ( int tel) {
		telefone = tel;
	}

	public int getCpf() {	
		return cpf;
	}
	
	public void setCpf (int c) {
		cpf = c;
	}
	
	public int getCelular() {	
		return celular;
	}
	
	public void setNome (int cel) {
		celular = cel;
	}

}
