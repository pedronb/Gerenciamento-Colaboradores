package modelos;
public class Vendedor extends FuncionarioCLT implements CalculaBonificacao{

    private double valorBonificacao;

    public Vendedor() {
        super();
    }

    public Vendedor(String nome, String documento, double valorSalario, Endereco endereco, double valorBonificacao) {
        super(nome, documento, valorSalario, endereco);
        this.valorBonificacao = valorBonificacao;
    }

    public double getValorBonificacao() {
        return valorBonificacao;
    }

    public void setValorBonificacao(double valorBonificacao) {
        this.valorBonificacao = valorBonificacao;
    }

    @Override
    public String toString() {
        return "Vendedor{" + "nome= " + nome + ", documento= " + documento + ", valorSalario= " + valorSalario + ", endereco= " + endereco + ", valorBonificacao= " + valorBonificacao + '}';
    }

    @Override
    public void calculaBonificacao(double porcentagemBonificacao) {
        this.valorBonificacao = (this.valorSalario * (porcentagemBonificacao/100));
        
    }
   
    
}
