package loja;

import loja.Clientes.Cliente;
import loja.Clientes.C_Builder;
import loja.AquisicaoMercadoria.*;
import loja.Mercadorias.*;


public class Main_loja {

    
    public static void main(String[] args) {
        Mercadoria lapis = new MercadoriaSimples("Lápis", 1.90);
        Mercadoria caderno = new MercadoriaSimples("Caderno", 4.90);
        Mercadoria borracha = new MercadoriaSimples("Borracha", 0.90);
        Mercadoria kit = new MercadoriaComposta(lapis, caderno);
        
        ComoPagar A_vista = new A_vista();
        ComoPagar NoCartao = new NoCartao();
        Cliente cliente = new C_Builder().novoCliente().seuNome("Otavio").moraNaCidade("Patos de Minas").builder();
    }   
}
