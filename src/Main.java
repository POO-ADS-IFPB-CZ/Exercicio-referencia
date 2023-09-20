import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Avenida Padre Rolim",
                100, "Cajazeiras");
        Funcionario funcionario = new Funcionario("111.111.111-01",
            "João", LocalDate.of(1990,2,20),
                2000, endereco);

        System.out.println(funcionario.getNome());
        System.out.println(funcionario.getEndereco().getRua().toUpperCase());
        System.out.println(funcionario.getNascimento().getYear());

    }
}