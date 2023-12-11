package Atividades_Gabriela_Miranda;

public class Professor extends Pessoa {
	private String nomeCurso;
	private float salario;

	public Professor() { 
		super();
 }
	
	public Professor(String curso, float sal) {
		 this.nomeCurso = curso;
		 this.salario = sal;
	 }
	
	
 	public String getNomeCurso() {
     return nomeCurso;
 	}

 	public void setNomeCurso(String n) {
     nomeCurso = n;
 	}
 
 	public float getSalario() {
 	     return salario;
 	 	}

 	 	public void float setSalario(float s) {
 	     salario = s;
 	 	}
 	 
 	

}