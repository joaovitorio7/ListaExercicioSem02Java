package ex05;

import java.time.LocalDate;

public class TestaFreqCardiaca {
    public static void main(String[] args) {
        String nome = "João";
        String sobrenome = "Silva";
        LocalDate dataNascimento = LocalDate.of(1990, 5, 15);

        FrequenciaCardiaca pessoa = new FrequenciaCardiaca(nome, sobrenome, dataNascimento);

        System.out.println("Nome: " + pessoa.getNome() + " " + pessoa.getSobrenome());
        System.out.println("Data de Nascimento: " + pessoa.getDataNascimento());
        System.out.println("Idade: " + pessoa.calcularIdade() + " anos");
        System.out.println("Frequência Cardíaca Máxima: " + pessoa.calcularFrequenciaCardiacaMaxima() + " bpm");
        System.out.println("Frequência Cardíaca Alvo: " + pessoa.calcularFrequenciaCardiacaAlvo() + " bpm");
    }
}