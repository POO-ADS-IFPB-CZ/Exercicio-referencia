import java.time.LocalDate;

public class Funcionario {

    private String cpf;
    private String nome;
    private LocalDate nascimento;
    private float salario;
    private Endereco endereco;

    public Funcionario (String cpf, String nome, LocalDate nascimento,
                        float salario, Endereco endereco){
        this.cpf = cpf;
        this.nome = nome;
        this.nascimento = nascimento;
        this.salario = salario;
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
