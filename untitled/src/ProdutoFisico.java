public class ProdutoFisico extends Produto{

    private double peso;
    private double frete;

    public ProdutoFisico(String nome, double preco, int quantidade, double peso) {
        super(nome, preco, quantidade);
        this.peso = peso;
    }

@Override
public double calcularTotal(double valor){
        if(peso < 2){
            frete = 5 + getPreco();
            return valor;

        } else if (peso >2 && peso <5) {
            frete = 5 + getPreco();
            return valor;

        }else if (peso >5){
            frete = 2.5 * peso + getPreco();

            return valor;
        }
    return 0;
}
}
