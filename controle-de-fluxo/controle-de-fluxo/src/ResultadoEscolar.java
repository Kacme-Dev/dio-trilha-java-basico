import java.util.Scanner;

public class ResultadoEscolar {
    public static void main(String[] args) {
        
        double nota;
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a nota do aluno [Use vírgula para decimais]: ");
        nota = sc.nextDouble();

        if (nota >= 7) {
            System.out.print("Aluno aprovado!");
        }

        else if (nota >= 5 && nota < 7  ) {
            System.out.print("Aluno em recuperação!");
        }

        else {
            System.out.println("Aluno reprovado!");
        }
    }
}
