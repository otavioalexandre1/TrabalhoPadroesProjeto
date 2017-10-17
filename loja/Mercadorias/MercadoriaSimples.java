package loja.Mercadorias;

public class MercadoriaSimples implements Mercadoria {
    
     private String nome;
    private Double preco;

    public MercadoriaSimples(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    
    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public double getPreco() {
        return this.preco;
    }
}
