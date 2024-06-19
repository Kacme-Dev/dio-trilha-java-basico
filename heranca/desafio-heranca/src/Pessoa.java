
public class Pessoa {
    
     String nome, RG, cpf, endereco, telFixo, telCelular, dataNascimento;
     
    public String retornaDados(){

        String dados = "";

        dados += "Nome: " + nome + "\n";
        dados += "Endereco: " + endereco + "\n";
        dados += "Data/Nascimento: " + dataNascimento + "\n";
        dados += "RG: " + RG + "\n";
        dados += "CPF: " + cpf + "\n";
        dados += "Telefone Fixo: " + telFixo + "\n";
        dados += "Telefone Celular: " + telCelular + "\n";

        return dados;
    }    
}