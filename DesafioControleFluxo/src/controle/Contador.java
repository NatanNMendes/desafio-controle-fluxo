package controle;

public class Contador {
    private int parametroUm;
    private int parametroDois;

    public Contador(int parametroUm, int parametroDois) {
        this.parametroUm = parametroUm;
        this.parametroDois = parametroDois;
    }

    public void contar() throws ParametrosInvalidosException {
        if (parametroUm >= parametroDois) { // Alterei de > para >=
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        for (int contador = parametroUm; contador <= parametroDois; contador++) { // Alterei a lógica do loop
            System.out.println("Imprimindo o número " + contador);
        }
    }
}
