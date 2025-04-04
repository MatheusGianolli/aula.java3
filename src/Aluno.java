public class Aluno {

    String nome;
    String rm;
    double cp1;
    double cp2;
    double cp3;
    double challenge;
    double gs;

    double calcularMediaCp() {

        double mediaCp = (cp1 + cp2 + cp3) / 3;
        return mediaCp;


    }

    double calcularMediaSemestral() {
        double mediaCp = calcularMediaCp();
        double mediaSemestral = mediaCp * 0.2 + challenge * 0.2 + gs * 0.6;
        return mediaSemestral;


    }

}
