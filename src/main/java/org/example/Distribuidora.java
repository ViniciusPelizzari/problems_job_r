package org.example;

/**
 * @@author Vinícius Pelizzari
 */
public class Distribuidora {

    static float sp = 67836.43F;
    static float rj = 36678.66F;
    static float mg = 29229.88F;
    static float es = 27165.48F;
    static float outros = 19849.53F;

    static float total = (sp + rj + mg + es + outros);
    static float totalP = total/100;

    public static void Execution(){
        Fibonacci.imprimmir("Valor total de venda: " + total + " R$");
        Fibonacci.imprimmir("A porcentagem do estado do RJ é: " + cPorcentagem(rj) + "%");
        Fibonacci.imprimmir("A porcentagem do estado do SP é: " + cPorcentagem(sp) + "%");
        Fibonacci.imprimmir("A porcentagem do estado do MG é: " + cPorcentagem(mg) + "%");
        Fibonacci.imprimmir("A porcentagem do estado do ES é: " + cPorcentagem(es) + "%");
        Fibonacci.imprimmir("A porcentagem do estado do OUTROS é: " + cPorcentagem(outros) + "\n");
    }

    public static float cPorcentagem(float s){
        float totalEstado = (s/totalP); // utilização da variável s no cálculo
        return totalEstado;
    }
}
