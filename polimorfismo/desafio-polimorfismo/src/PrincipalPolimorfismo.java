public class PrincipalPolimorfismo {
 
     public static void main(String[] args) {
         
         Aluno a1 = new Aluno();
         Professor p1 = new Professor();
         
         a1.nome = "Juca Bala";
         a1.registroAcademico = 2021232625;
         a1.cpf = "248.985.457-52";
         a1.RG = "85.459.258-6";
         a1.curso = "Estudo da sabedoria Humana";
         a1.dataNascimento = "25/08/1986";
         a1.dataIngresso = "12/03/2015";
         a1.endereco = "Rua das Couves, 25";
         a1.notaVestibular = 10;
         a1.telCelular = "(15) 96523-2213";
         a1.telFixo = "(15) 2365-8956";
         
         p1.nome = "Professor Girafales";
         p1.salario = 200.00f;
         p1.cpf = "012.345.678-90";
         p1.dataNascimento = "26/10/1965";
         p1.RG = "22.568.956-9";
         p1.endereco = "Rua Pindamanguapio, 12";
         p1.matricula = 90020;
         p1.telCelular = "(18) 99845-6952";
         p1.telFixo = "(18) 3314-6598";
         p1.dataContrato = "01/02/2024";
         
         System.out.println("---------------------------\n |Dados pessoais do aluno|\n---------------------------");
         System.out.println(a1.retornaDados());
         
         System.out.println("-------------------------------\n |Dados pessoais do professor|\n-------------------------------");
         System.out.println(p1.retornaDados());
     }
 }