
package loja.Clientes;

public class C_Builder
{
    private Cliente cliente;

    public C_Builder novoCliente()
    {
        cliente = new Cliente();

        return this;
    }

    public C_Builder seuNome(String nome)
    {
        cliente.setNome(nome);

        return this;
    }

    public C_Builder moraNaCidade(String cidade)
    {
        cliente.setCidade(cidade);

        return this;
    }
    
    public C_Builder seuTelefone (String telefone)
    {
        cliente.setTelefone(telefone);
        
        return this;
    }

    public Cliente builder()
    {
        return this.cliente;
    }
}