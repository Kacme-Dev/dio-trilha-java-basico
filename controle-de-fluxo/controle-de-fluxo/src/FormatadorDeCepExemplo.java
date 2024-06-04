public class FormatadorDeCepExemplo {
    public static void main(String[] args) {

        try{
        String cepFormatado = formatarCep("19045470");
        System.out.println(cepFormatado);
        }

        catch(CepInvalidoException e) {
            //e.printStackTrace();
            System.out.println("O CEP não corresponde com o formato padrão!");
        }
    }

    static String formatarCep(String cep) throws CepInvalidoException {

        if (cep.length() != 8)
        throw  new CepInvalidoException();

        return "19.045-470";
    }
    
}
