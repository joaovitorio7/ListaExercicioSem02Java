package ex06;

import java.util.Calendar;

class PerfilDeSaude {
    private String nome;
    private String sobrenome;
    private String sexo;
    private String dataNascimento;
    private double altura; // em metros
    private double peso; // em quilogramas

    public PerfilDeSaude(String nome, String sobrenome, String sexo, String dataNascimento, double altura, double peso) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getSexo() {
        return sexo;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public int calcularIdade() {
        // Calcula a idade com base na data de nascimento
        int anoAtual = Calendar.getInstance().get(Calendar.YEAR);
        int anoNascimento = Integer.parseInt(dataNascimento.split("/")[2]);
        return anoAtual - anoNascimento;
    }

    public double calcularIMC() {
        // Calcula o Índice de Massa Corporal (IMC)
        return peso / (altura * altura);
    }

    public int calcularFrequenciaCardiacaMaxima() {
        // Calcula a frequência cardíaca máxima (220 - idade)
        int idade = calcularIdade();
        return 220 - idade;
    }

    public String calcularFrequenciaCardiacaAlvo() {
        // Calcula a faixa alvo de frequência cardíaca (50% a 85% da frequência cardíaca máxima)
        int frequenciaCardiacaMaxima = calcularFrequenciaCardiacaMaxima();
        int frequenciaMinima = (int) (0.5 * frequenciaCardiacaMaxima);
        int frequenciaMaxima = (int) (0.85 * frequenciaCardiacaMaxima);
        return frequenciaMinima + " a " + frequenciaMaxima;
    }
}
