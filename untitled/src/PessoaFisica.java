public class PessoaFisica extends Pessoa {

    private String cpf;
    private boolean produto;

    public PessoaFisica(String nome, String telefone, String endereco, String cpf) {
        super(nome, telefone, endereco);
        this.cpf = cpf;
    }

    @Override
    public boolean Produto(int x){
        if (produto){
            boolean b = x <= 3;
            return true;
        }

        return false;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
