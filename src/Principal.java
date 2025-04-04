import java.util.Scanner;
public class Principal {

    public static void main(String[] args) {
    Aluno aluno = new Aluno();

    Scanner leitor = new Scanner(System.in);

    System.out.println("Digite o nome do aluno");
    aluno.nome = leitor.next() + leitor.nextLine();

    System.out.println("digite seu rm");
    aluno.rm = leitor.next();

    System.out.println("Digite a nota do cp1");
    aluno.cp1 = leitor.nextDouble();

    System.out.println("Digite a nota do cp2");
    aluno.cp2 = leitor.nextDouble();

    System.out.println("Digite a nota da cp2");
    aluno.cp3 = leitor.nextDouble();

    System.out.println("Digite a nota do challenge");
    aluno.challenge = leitor.nextDouble();

    System.out.println("Digite a nota do gs");
    aluno.gs = leitor.nextDouble();
    double mediaCp = aluno.calcularMediaCp();
    double mediaSemestral = aluno.calcularMediaSemestral();

        System.out.println("Aluno: " + aluno.nome );
        System.out.println("Media cp: " + mediaCp + "Media Semestral: " + mediaSemestral);
        }

}