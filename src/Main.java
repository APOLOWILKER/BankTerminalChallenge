import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nome = "Apolo Wilker";
        String tipoConta = "Corrente";
        double saldo = 2000.50;
        int option = 0;

        System.out.println("#### ********************** ####");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo atual " + saldo);
        System.out.println("\n#### ********************** ####");

        String menu = """
                ** Menu BANK **
                Escolha uma opção:
                
                1. Consultar saldo
                2. Transferir valores
                3. Depositar valores
                4. Finalizar sessão.
                """;
        Scanner leitura = new Scanner(System.in);

        while (option != 4) {
            System.out.println("\n" + menu);
            option = leitura.nextInt();
            if (option == 1) {
                System.out.println("\nO seu saldo é: " + saldo);
            } else if (option == 2) {
                System.out.println("Qual valor deseja transferir ? ");
                double valor = leitura.nextDouble();
                if(valor > saldo) {
                    System.out.println("**Seu saldo é insuficiente para a TRANSFERENCIA**");
                } else {
                    saldo -= valor;
                    System.out.println("Valor Transferido: " + valor + "seu saldo agora é: " + saldo);
                }
            } else if (option == 3) {
                System.out.println("Qual valor deseja depositar ? ");
                double valor = leitura.nextDouble();

                    saldo += valor;
                    System.out.println("Valor Depositado: " + valor + "seu saldo agora é: " + saldo);

            } else {
                System.out.println("Opção invalida");
            }
        }

    }
}
