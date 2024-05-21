package controle;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        Contador contador = new Contador(parametroUm, parametroDois);

        try {
            contador.contar();
        } catch (ParametrosInvalidosException exception) {
            System.out.println(exception.getMessage());
        }
        
        terminal.close(); // Fechar o scanner após o uso
    }
}
