public class ClienteEspecial extends Pessoa{

    private String DocumentoDeIdentificacao;

    public ClienteEspecial(String nome, String telefone, String endereco, String DocumentoDeIdentificacao) {
        super(nome, telefone, endereco);
        this.DocumentoDeIdentificacao = DocumentoDeIdentificacao;

    }
    @Override
    public boolean Produto(int x){
       return true;
        }

    public String getDocumentoDeIdentificacao() {
        return DocumentoDeIdentificacao;
    }

    public void setDocumentoDeIdentificacao(String documentoDeIdentificacao) {
        DocumentoDeIdentificacao = documentoDeIdentificacao;
    }
}
