import java.util.Scanner;

public class ControleTernario {
    public static void main(String[] args) {
        
        double nota;
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a nota do aluno [Use vírgula para decimais]: ");
        nota = sc.nextDouble();

        String resultado = nota >=7 ? "Aprovado" : nota>=5 && nota <7 ? "Recuperação" : "Reprovado";

        System.out.print(resultado);
    }
}