
# Controle de Fluxo
_By Natan Nunes Mendes (NatanNMendes)_

[![GitHub](https://img.shields.io/badge/GitHub-181717?style=for-the-badge&logo=github&logoColor=white)](https://github.com/NatanNMendes)
[![Perfil DIO](https://img.shields.io/badge/-Meu%20Perfil%20na%20DIO-3333FF?style=for-the-badge&logo=gitbook&logoColor=white)](https://www.dio.me/users/natan_nunes_mendes_95684)
[![LinkedIn](https://img.shields.io/badge/linkedin-%230077B5.svg?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/natan-nunes-mendes-progamador/)
[![WhatsApp](https://img.shields.io/badge/WhatsApp-25D366?style=for-the-badge&logo=whatsapp&logoColor=white)](https://wa.me/5575988055119)  

Esta aplicação Java consiste em um simples contador que recebe dois parâmetros do usuário e conta de um parâmetro até o outro, imprimindo os números na tela. O código é dividido em três classes: `App`, `Contador`, e `ParametrosInvalidosException`.

## `App`

A classe `App` é a classe principal da aplicação. Ela é responsável por receber entrada do usuário, instanciar objetos da classe `Contador`, e lidar com exceções se ocorrerem.

```java
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
```

- **`main` método**: Este é o ponto de entrada da aplicação Java. Quando o programa é executado, o código dentro deste método é executado primeiro.
  
- **Inicialização do Scanner**: A primeira parte do `main` método cria um objeto `Scanner` para permitir a entrada de dados do usuário através do terminal. Isso é feito pela linha `Scanner terminal = new Scanner(System.in);`.
  
- **Leitura dos Parâmetros**: Em seguida, a aplicação solicita ao usuário que insira dois parâmetros inteiros. Estes são lidos pelo Scanner usando o método `nextInt()` e armazenados nas variáveis `parametroUm` e `parametroDois`.
  
- **Instanciação do Contador**: Depois de obter os parâmetros do usuário, um objeto `Contador` é criado usando os valores fornecidos pelo usuário.
  
- **Tratamento de Exceção**: Um bloco `try-catch` é usado para lidar com exceções que podem ser lançadas pelo método `contar()` do objeto `Contador`. Se uma exceção do tipo `ParametrosInvalidosException` for lançada, o programa imprime a mensagem de erro correspondente.
  
- **Fechamento do Scanner**: Por fim, o Scanner é fechado usando o método `close()` para liberar os recursos do sistema após o uso.


## `Contador`

A classe `Contador` é responsável pela lógica de contagem. Ela recebe dois parâmetros e conta de um parâmetro até o outro, imprimindo os números na tela.

```java
public class Contador {
    private int parametroUm;
    private int parametroDois;

    public Contador(int parametroUm, int parametroDois) {
        this.parametroUm = parametroUm;
        this.parametroDois = parametroDois;
    }

    public void contar() throws ParametrosInvalidosException {
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        for (int contador = parametroUm; contador <= parametroDois; contador++) {
            System.out.println("Imprimindo o número " + contador);
        }
    }
}
```
- **Atributos**: A classe possui dois atributos privados: `parametroUm` e `parametroDois`, que armazenam os valores dos parâmetros recebidos.

- **Construtor**: O construtor da classe recebe os dois parâmetros e os armazena nos atributos correspondentes.

- **Método `contar()`**: Este método executa a lógica de contagem. Ele itera de `parametroUm` até `parametroDois`, imprimindo cada número no console. Se `parametroDois` for menor ou igual a `parametroUm`, lança uma exceção `ParametrosInvalidosException`.

## `ParametrosInvalidosException`

A classe `ParametrosInvalidosException` é uma exceção personalizada que é lançada quando os parâmetros fornecidos são inválidos.

```java
public class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String message) {
        super(message);
    }
}
```
- **Construtor**: O construtor da classe recebe uma mensagem de erro como parâmetro e a passa para o construtor da classe base `Exception`, que define a mensagem da exceção.

Este README fornece uma visão geral do propósito de cada classe e o que cada parte do código faz. Ele ajuda os desenvolvedores a entenderem rapidamente como a aplicação funciona e como podem interagir com ela.