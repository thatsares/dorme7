/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

/**
 *
 * @author Gabriel
 */
public class Vendedor {
    
    //atributos
    private String vendedor_nome = "";
    private String vendedor_cnpj = "";
    private String vendedor_senha = "";
    private String vendedor_sexo = "";
    private String vendedor_endereco = "";
    private String vendedor_cidade = "";
    private String vendedor_estado = "";
    private String vendedor_idade = "";




    //GET e SET
    public String getNome() {
        return vendedor_nome;
    }

    public void setNome(String nome) {
        this.vendedor_nome = nome;
    }

    public String getCnpj() {
        return vendedor_cnpj;
    }

    public void setCnpj(String cpf) {
        this.vendedor_cnpj = cpf;
    }

    public String getSenha() {
        return vendedor_senha;
    }
    
    public void setSenha(String senha) {
        this.vendedor_senha = senha;
    }
    
    public String getSexo() {
        return vendedor_sexo;
    }

    public void setSexo(String sexo) {
        this.vendedor_sexo = sexo;
    }

    public String getEndereco() {
        return vendedor_endereco;
    }

    public void setEndereco(String endereco) {
        this.vendedor_endereco = endereco;
    }

    public String getCidade() {
        return vendedor_cidade;
    }

    public void setCidade(String cidade) {
        this.vendedor_cidade = cidade;
    }

    public String getEstado() {
        return vendedor_estado;
    }

    public void setEstado(String estado) {
        this.vendedor_estado = estado;
    }
    
    public String getIdade() {
        return vendedor_idade;
    }

    public void setIdade(String idade) {
        this.vendedor_idade = idade;
    }
    

    
    
    public void limpaCliente(){
    vendedor_nome = "";
    vendedor_cnpj = "";
    vendedor_senha = "";
    vendedor_sexo = "";
    vendedor_endereco = "";
    vendedor_cidade = "";
    vendedor_estado = "";
    vendedor_idade = "";

    }   
    
}
