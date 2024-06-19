
 public class PrincipalHeranca {
 
     public static void main(String[] args) {
         
         Aluno a1 = new Aluno();
         Professor p1 = new Professor();
         
         a1.nome = "Kleber Moreno";
         a1.registroAcademico = 1234567890;
         a1.cpf = "025.645.897-65";
         a1.RG = "12.568.328-5";
         a1.curso = "Analise e Desenvolvimento de Sistemas";
         a1.dataNascimento = "25/03/1978";
         a1.dataIngresso = "01/07/2022";
         a1.endereco = "Rua Das Pitangas, 12";
         a1.notaVestibular = 8;
         a1.telCelular = "(11) 94587-5632)";
         a1.telFixo = "(11) 3216-8569)";
         
         p1.nome = "Mestre Yoda";
         p1.salario = 200f;
         p1.cpf = "012.345.678-90";
         p1.dataNascimento = "26/10/1978";
         p1.RG = "22.568.956-9";
         p1.endereco = "Avenida das Galaxias Direita, 01";
         p1.matricula = 90020;
         p1.telCelular = "(18) 99845-6952";
         p1.telFixo = "(18) 3314-6598";
         p1.dataContrato = "01/02/2024";
         
         System.out.println("---------------------------\n |Dados pessoais do aluno|\n---------------------------");
         System.out.println(a1.retornaDadosAluno());
         
         System.out.println("-------------------------------\n |Dados pessoais do professor|\n-------------------------------");
         System.out.println(p1.retornaDadosProfessor());
     }
 }