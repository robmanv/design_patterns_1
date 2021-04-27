public class TesteDeImpostosComplexos {
    public static void main(String[] args) {
        // CALCULO DE IMPOSTO COMPOSTO

        //DECORATOR: VISA JUNTAR OS COMPORTAMENTOS SEPARADOS (DECORAMOS O RESULTADO DO ICSM DENTRO DO ISS DENTRO DO ....)

        Imposto iss = new ImpostoMuitoAlto(new ISS(new ICMS()));

        Orcamento orcamento = new Orcamento(500);

        double valor = iss.calcula(orcamento);

        System.out.println(valor);
    }
}