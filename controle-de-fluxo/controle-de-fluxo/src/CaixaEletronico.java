import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) throws Exception {
        
        double saldo = 25.0;
        double valorSolicitado;
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o valor solicitado");
        valorSolicitado = sc.nextDouble();
        
        if (valorSolicitado < saldo) saldo = saldo - valorSolicitado;

        System.out.println("Saldo atualizado R$ "+ saldo);        
    }
}
