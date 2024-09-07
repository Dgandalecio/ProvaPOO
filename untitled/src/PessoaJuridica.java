public class PessoaJuridica extends Pessoa{

    private String cnpj;
    private String representante;
    private boolean produto;

    public PessoaJuridica(String nome, String telefone, String endereco, String cnpj, String representante) {
        super(nome, telefone, endereco);
        this.cnpj = cnpj;
        this.representante = representante;
    }

    @Override
    public boolean Produto(int x){
        if (produto){
            boolean b = x <= 10;
            return true;
        }

        return false;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRepresentante() {
        return representante;
    }

    public void setRepresentante(String representante) {
        this.representante = representante;
    }
}
