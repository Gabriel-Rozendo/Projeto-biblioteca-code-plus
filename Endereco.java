import java.util.Scanner;

public class Endereco {

    private String rua;
    private String numero;
    private String bairro;

    Scanner scanner = new Scanner(System.in);

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getRua() {
        return rua;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getBairro() {
        return bairro;
    }

    public void cadastrarEndereco() {
        System.out.println("Cadastrando o endereço...");
        System.out.print("Rua: ");
        rua = scanner.next();
        System.out.print("Número: ");
        numero = scanner.next();
        System.out.print("Bairro: ");
        bairro = scanner.next();
    }
}
