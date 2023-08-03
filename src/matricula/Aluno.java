package matricula;
import java.util.Scanner;
public class Aluno {
    private String registroAcademico;
    private String nome;
    private double notaProva1;
    private double notaProva2;
    private double notaTrabalho;

    public Aluno (String registroAcademico, String nome, double notaProva1, double notaProva2, double notaTrabalho){
        this.registroAcademico = registroAcademico;
        this.nome = nome;
        this.notaProva1 = notaProva1;
        this.notaProva2 = notaProva2;
        this.notaTrabalho = notaTrabalho;
    }

    public double media () {
        double mediaProvas = (notaProva1 + notaProva2) *3.5;
        double mediaTrabalho = notaTrabalho * 3;
        return (mediaProvas + mediaTrabalho) / 10;

    }

    public String situcao () {
        double mediaFinal = media();
        return mediaFinal >= 7.0 ? "Aprovado" : "Exame";

    }

    @Override
    public String toString() {
        return  "RA: " + registroAcademico + " | Nome: " + nome;
    }

    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("informe o nome do aluno:");
            String nome = scanner.nextLine();

        System.out.println("informe o RA do aluno:");
            String registroAcademico = scanner.nextLine();

        System.out.println("informe a nota da prava 1:");
            double notaProva1 = scanner.nextDouble();

        System.out.println("informe a nota da prova 2:");
            double notaProva2 = scanner.nextDouble();

        System.out.println("informe a nota de trabalho: ");
            double notaTrabalho = scanner.nextDouble();

            scanner.close();

    Aluno aluno = new
    Aluno(registroAcademico, nome, notaProva1, notaProva2, notaTrabalho);
    System.out.println("Resultado");
    System.out.println(aluno.toString() + " | Média: " + aluno.media() + " | Situação: " + aluno.situcao());
    }
}


