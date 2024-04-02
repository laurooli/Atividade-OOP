import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Conta: ");
        int numero = Integer.parseInt(scn.nextLine());

        System.out.println("Agencia: ");
        String agencia = scn.nextLine();

        System.out.println("Nome do titular:");
        String nome = scn.nextLine();
        scn.close();

        ContaTerminal conta = new ContaTerminal(numero, agencia, nome);
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agencia é " + agencia + ", conta " + numero + " e seu saldo " + conta.getSaldo() + " já está disponivel");

    }
}