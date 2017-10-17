package loja.AquisicaoMercadoria;


public class A_vista implements ComoPagar {
    
    @Override
    public String getPagamento(){
        return "Pagamento realizado à Vista!";
    }  
}
