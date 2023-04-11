package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;

/**
 * @@author Vinícius Pelizzari
 *
 * Para a realização deste projeto, foi usado pesquisas e uso de IA...
 *
 * OBS: não encontrei o arquivo '.json'
 */
public class Faturamento {

    public static void FaturamentoD() {

        ObjectMapper obj = new ObjectMapper();
        double[] fDiario = null;
        try {
            fDiario = obj.readValue(new File("faturamentoMes.json"), double[].class);
        } catch (IOException e) {
            Fibonacci.imprimmir("Arquivo '.json' não foi encontrado");
        }

        double vMenor = Double.MAX_VALUE;
        double vMaior = Double.MIN_VALUE;
        for (double valor : fDiario) {
            if (valor < vMenor) {
                vMenor = valor;
            }
            if (valor > vMaior) {
                vMaior = valor;
            }
        }
        Fibonacci.imprimmir("O menor valor de faturamento diário registrado foi: " + vMenor + " R$\n");
        Fibonacci.imprimmir("O menor valor de faturamento diário registrado foi: " + vMaior + " R$");

        int diasFaturando = 0;
        double totalFatura = 0.0;
        for (double valor : fDiario) {
            if (valor > 0.0) {
                diasFaturando++;
                totalFatura += valor;
            }
        }
        double mediaMensal = totalFatura / diasFaturando;
        Fibonacci.imprimmir("A média mensal de faturamento registrado foi: " + mediaMensal + " R$");

        int dMaiorMedia = 0;
        for (double valor : fDiario) {
            if (valor > mediaMensal) {
                dMaiorMedia++;
            }
        }
        Fibonacci.imprimmir("Quantia de diárias com faturamento acima da média mensal: " + dMaiorMedia);
    }
}

