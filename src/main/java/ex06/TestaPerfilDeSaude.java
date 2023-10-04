package ex06;

import java.util.Scanner;
public class TestaPerfilDeSaude {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o nome: ");
        String nome = scanner.nextLine();

        System.out.print("Informe o sobrenome: ");
        String sobrenome = scanner.nextLine();

        System.out.print("Informe o sexo: ");
        String sexo = scanner.nextLine();

        System.out.print("Informe a data de nascimento (dd/mm/aaaa): ");
        String dataNascimento = scanner.nextLine();

        System.out.print("Informe a altura (em metros): ");
        double altura = scanner.nextDouble();

        System.out.print("Informe o peso (em quilogramas): ");
        double peso = scanner.nextDouble();

        // Cria um objeto PerfilDeSaude com as informações fornecidas
        PerfilDeSaude perfil = new PerfilDeSaude(nome, sobrenome, sexo, dataNascimento, altura, peso);

        // Imprime as informações do perfil
        System.out.println("\nInformações do Perfil de Saúde:");
        System.out.println("Nome: " + perfil.getNome() + " " + perfil.getSobrenome());
        System.out.println("Sexo: " + perfil.getSexo());
        System.out.println("Data de Nascimento: " + perfil.getDataNascimento());
        System.out.println("Altura: " + perfil.getAltura() + " metros");
        System.out.println("Peso: " + perfil.getPeso() + " quilogramas");

        // Calcula e imprime as informações adicionais
        System.out.println("\nInformações Adicionais:");
        System.out.println("Idade: " + perfil.calcularIdade() + " anos");
        System.out.println("IMC: " + perfil.calcularIMC());
        System.out.println("Frequência Cardíaca Máxima: " + perfil.calcularFrequenciaCardiacaMaxima() + " bpm");
        System.out.println("Faixa de Frequência Cardíaca Alvo: " + perfil.calcularFrequenciaCardiacaAlvo() + " bpm");
    }
}
