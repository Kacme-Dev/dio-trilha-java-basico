import java.util.Random;

public class ExemploDoWhile {
    public static void main(String[] args) {

        System.out.println("Discando...");

        do 
        {
            // executando repetidas vezes até alguém atender
            System.out.println("Telefone tocando...");            
        }            
        while (tocando());

        //System.out.println("Alô!!!");
    }

    private static boolean tocando() {
        boolean atendeu = new Random().nextInt(3)==1;

        if (atendeu){
            System.out.println("Atendeu? " + atendeu);
            System.out.println("Alô!!!");
        }

        else{
            System.out.println("Atendeu? " + atendeu);
            System.out.println("Aguardando!");
        }

        //System.out.println("Atendeu? " + atendeu);

        return ! atendeu; // negando o ato de continuar tocando
    }
}
