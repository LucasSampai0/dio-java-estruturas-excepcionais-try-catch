public class FormatadorCepExemplo {
    public static void main(String[] args) {
       //bloco que consulta o tamanho de uma String "cep"
       //respeitando o método formatarCep, onde se o tamanho
       //da string for diferente de 8 ele lançara uma exceção personalizada
        try {
            String cepFormatado = formatarCep("3765064");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("O cep não corresponde com as regras de negocio");
        }
    }
    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
        throw new CepInvalidoException();

        //simulando um cep formatado
        return "23.765-064";
    }
}
