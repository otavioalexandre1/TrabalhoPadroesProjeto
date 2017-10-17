package loja.AquisicaoMercadoria;


public class NoCartao implements ComoPagar {
    @Override
    public String getPagamento(){
        return "Pagamento realizado no Cartão!";
    }  
}
