package loja.Clientes;


public class Cliente
{
    private String nome;
    private String cidade;
    private String telefone;

    public String getNome()
    {
        return nome;
    }

    public String getCidade()
    {
        return cidade;
    }
    
    public String getTelefone(){
        return telefone;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public void setCidade(String cidade)
    {
        this.cidade = cidade;
    }

    public void setTelefone(String telefone)
    {
        this.telefone = telefone;
    }
}
