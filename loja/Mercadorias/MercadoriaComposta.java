
package loja.Mercadorias;


public class MercadoriaComposta implements Mercadoria {
    
    private Mercadoria mercadoria1;
    private Mercadoria mercadoria2;

   public MercadoriaComposta(Mercadoria mercadoria1, Mercadoria mercadoria2) {
        this.mercadoria1 = mercadoria1;
        this.mercadoria2 = mercadoria2;
    }
    
    @Override
    public String getNome() {
        return mercadoria1.getNome()+" junto com "+mercadoria2.getNome();
    }

    @Override
    public double getPreco() {
        return mercadoria2.getPreco()+mercadoria1.getPreco();
    }
}
