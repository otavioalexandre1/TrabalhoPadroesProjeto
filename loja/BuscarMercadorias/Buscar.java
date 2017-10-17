package loja.BuscarMercadorias;


public abstract class Buscar {
    
    private Buscar proximo;

    public Buscar(Buscar proximo) {
        this.proximo = proximo;
    }

    public void setProximo(Buscar proximo) {
        this.proximo = proximo;
    }

    public abstract Boolean buscar();

    public void buscarEmCadeia() {
        Boolean achei = buscar();
        if (!achei) {
            proximo.buscarEmCadeia();
        }
    }

}

