package ex05;

import java.time.LocalDate;
import java.time.Period;

class FrequenciaCardiaca {
    private String nome;
    private String sobrenome;
    private LocalDate dataNascimento;

    public FrequenciaCardiaca(String nome, String sobrenome, LocalDate dataNascimento) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public int calcularIdade() {
        LocalDate hoje = LocalDate.now();
        Period periodo = Period.between(dataNascimento, hoje);
        return periodo.getYears();
    }

    public int calcularFrequenciaCardiacaMaxima() {
        int idade = calcularIdade();
        return 220 - idade;
    }

    public String calcularFrequenciaCardiacaAlvo() {
        int frequenciaCardiacaMaxima = calcularFrequenciaCardiacaMaxima();
        int minimoAlvo = (int) (frequenciaCardiacaMaxima * 0.50);
        int maximoAlvo = (int) (frequenciaCardiacaMaxima * 0.85);
        return minimoAlvo + " - " + maximoAlvo;
    }
}
