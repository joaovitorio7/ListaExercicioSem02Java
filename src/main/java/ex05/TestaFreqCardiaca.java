package ex05;

import java.util.Scanner;

public class TestaFreqCardiaca {
    public String dataNascimento;

    public void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe sua data de nascimento no formato dd/MM/yyyy:");
        String dataNascimento = scanner.nextLine();

        FrequenciaCardiaca frequenciaCardiaca =
                new FrequenciaCardiaca("Fulano", "Blabla", dataNascimento);

        System.out.printf("Idade: %d %nFrequencia Card. Máx.:%d %nFreq. Card. Alvo:%.1f-%.1f",
                frequenciaCardiaca.calculaIdade(this.dataNascimento), frequenciaCardiaca.frequenciaCardiacaMaxima(),
                frequenciaCardiaca.frequenciaCardiacaAlvo()[0],
                frequenciaCardiaca.frequenciaCardiacaAlvo()[1]);
    }
}
