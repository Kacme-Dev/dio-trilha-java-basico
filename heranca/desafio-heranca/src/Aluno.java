
public class Aluno extends Pessoa{
    
    int registroAcademico;
    float notaVestibular;
    String curso, dataIngresso;
    
    public String retornaDadosAluno() {
        
        String dados;
        
        dados = super.retornaDados();
        
        dados += "\tRegistro Academico: " + registroAcademico + "\n";
        dados += "\tNota no Vestibular: " + notaVestibular + "\n";
        dados += "\tCurso: " + curso + "\n";
        dados += "\tData de ingresso: " + dataIngresso + "\n";
 
        return dados;
    }    
}