import modelos.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        Endereco endereco = new Endereco("Rua olha lá", "Bairro do colega", "Complemento do colega");

        Vendedor vendedor = new Vendedor();
        vendedor.setNome("Fulano");
        vendedor.setDocumento("222.222.222.20");
        vendedor.setValorSalario(2000);
        vendedor.setEndereco(endereco);
        vendedor.calculaBonificacao(15);
        System.out.println(vendedor);

        System.out.println("---------");

        OperadorDeCaixa operadorCaixa = new OperadorDeCaixa("Cicrano", "111.111.111.10", 1500, endereco);
        System.out.println(operadorCaixa);

        System.out.println("---------");

        Gerente gerente = new Gerente();
        gerente.setNome("O tal");
        gerente.setDocumento("555.555.555.50");
        gerente.setEndereco(endereco);
        gerente.setHorasTrabalhadas(160);
        gerente.setValorHora(100);
        gerente.calculaRemuneracao();
        gerente.calculaBonificacao(5);

        System.out.println(gerente);

    }
}
