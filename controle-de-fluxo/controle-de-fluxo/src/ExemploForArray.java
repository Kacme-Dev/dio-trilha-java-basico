public class ExemploForArray {
    public static void main(String[] args) {
        
        String alunos[] = {"FELIPE", "JONAS", "JÚLIA", "MARCOS"};

        // Exemplo com FOR
        for (int x = 0; x < alunos.length; x++) {
            System.out.println("O (a) aluno (a) do índeice é: " + alunos[x]);
        }

        System.out.println("");
        System.out.println("-------------------------------------------------------");
        System.out.println("");

        // Exemplo com FOReach
        for (String aluno : alunos) {
            System.out.println("O (a) aluno (a) do índeice é: " + aluno);
        }
    }    
}
