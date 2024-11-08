import java.util.Scanner;

public class Funcionario {

    private String nome;
    private String cpf;
    private String cargo;
    private double salario;

    Scanner scanner = new Scanner(System.in);

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void cadastrarFuncionario() {
        System.out.print("Digite o nome do funcionário: ");
        nome = scanner.next();
        System.out.print("Digite o CPF: ");
        cpf = scanner.next();
        System.out.print("Digite o cargo do funcionário: ");
        cargo = scanner.next();
        System.out.print("Digite o salário: R$ ");
        salario = scanner.nextDouble();

        Endereco endereco = new Endereco();
        endereco.cadastrarEndereco();
    }

}
