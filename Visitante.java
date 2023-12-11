package Atividades_Gabriela_Miranda;

public class Visitante {
    // atributos
    private String nome;
    private int idade;
    private double altura;

    // métodos
    public Visitante(String name, double al, int id) {
        nome = name;
        idade = id;
        altura = al;
    }

    public String getNome() {
        return nome;
    }

    public void setChangeNome(String n) {
        nome = n;
    }

    public int getIdade() {
        return idade;
    }

    public void setChangeId(int i) {
        idade = i;
    }

    public double getAltura() {
        return altura;
    }

    public void setChangeAl(double al) {
        altura = al;
    }

    // métodos especiais
    public boolean getpodeAndarNoBrinquedo() {
        if (idade >= 10 && altura >= 1.50) {
            System.out.println("Pode andar no brinquedo");
            return true;
        }
        System.out.println("Não pode andar no brinquedo");
        return false;
    }
}

