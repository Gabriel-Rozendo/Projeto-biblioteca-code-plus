import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        byte op = 1;

        do {
            System.out.println("O que você deseja fazer? \n" +
                    "[1] Cadastrar Funcionário \n" +
                    "[2] Cadastrar Usuário \n" +
                    "[3] Cadastrar Livro \n" +
                    "[4] Mostrar Dados do Cadastro \n" +
                    "[5] Ir para Locação \n" +
                    "[0] Sair");
            System.out.print("Digite uma opção: ");
            op = scanner.nextByte();

            Funcionario funcionario = new Funcionario();

            switch (op) {
                case 1:
                    funcionario.cadastrarFuncionario();
            }

        } while (op != 0);
    }
}
