public class Professor extends Pessoa {
    
    int matricula;
    String dataContrato;
    float salario;  
    
    @Override // Reescreve o método retornaDadosProfessor para ficar iguial ao da classe principal
    //public String retornaDadosProfessor() {
    public String retornaDados(){
        
        String dados;
        
        dados = super.retornaDados();
        
        dados += "\tNumero da Matricula: " + matricula + "\n";
        dados += "\tData de Inscricao: " + dataContrato + "\n";
        dados += "\tSalario: " + salario + "\n";        
 
        return dados;
    }    
}