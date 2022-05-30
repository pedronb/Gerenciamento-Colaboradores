package modelos;
public class Gerente extends FuncionarioPJ implements CalculaBonificacao{

    private double valorBonificacao;

    @Override
    public void calculaBonificacao(double porcentagemBonificacao) {
        this.valorBonificacao = (super.getValorRemuneracao() * (porcentagemBonificacao/100)) + 100;       
    }

    @Override
    public String toString() {
        return "Gerente [documento=" + super.getDocumento() + ", endereco=" + super.getEndereco() + ", horasTrabalhadas="
                + super.getHorasTrabalhadas() + ", nome=" + super.getNome() + ", valorHora=" + super.getValorHora() + ", valorRemuneracao="
                + super.getValorRemuneracao() + ", valorBonificacao= " + this.valorBonificacao + ']';
    }


} 
