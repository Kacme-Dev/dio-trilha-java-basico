
public class Professor extends Pessoa {
    
    int matricula;
    String dataContrato;
    float salario;  
    
    public String retornaDadosProfessor(){
        
        String dados;
        
        dados = super.retornaDados();
        
        dados += "\tNumero da Matricula: " + matricula + "\n";
        dados += "\tData de Inscricao: " + dataContrato + "\n";
        dados += "\tSalario: " + salario + "\n";        
 
        return dados;
    }
}