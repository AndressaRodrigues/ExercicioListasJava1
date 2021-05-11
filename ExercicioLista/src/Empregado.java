

//import jdk.nashorn.internal.objects.annotations.Getter;

public class Empregado {
    private int id;
    private String nome;
    private double salario;


    public Empregado(Integer id, String nome, Double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }
    public void setName(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }
    public void setSalario(Double salario) {
        this.salario = salario;
    }


    public void aumentaSalario(double porcentagem) {
        this.salario += salario*(1+(porcentagem/100));
    }
}