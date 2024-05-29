import java.util.Scanner;

public class SistemaDeMedida {
    public static void main(String[] args) {
        
        String medida;
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o tamanho desejado:");
        medida = sc.next();

        switch (medida){

            case "P":{
                System.out.print("PEQUENO!");
                break;
            }
            case "M":{
                System.out.print("MÉDIO!");
                break;
            }
            case "G":{
                System.out.print("GRANDE!");
                break;
            }
            case "GG":{
                System.out.print("EXTRA GRANDE!");
                break;
            }
            case "XG":{
                System.out.print("PULL SIZE!");
                break;
            }
            default:
            System.out.print("TAMANHO INVÁLIDO!");
        }
    }
}
