public class ProdutoDigital extends Produto {

    private int tamanhoArquivo;

    public ProdutoDigital(String nome, double preco, int quantidade, int tamanhoArquivo) {
        super(nome, preco, quantidade);
        this.tamanhoArquivo = tamanhoArquivo;
    }

    @Override
    public double calcularTotal(double valor){

       valor= getPreco();
        return valor;
    }
}
