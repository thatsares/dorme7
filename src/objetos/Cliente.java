/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;


/**
 *
 * @author Macrr
 */
public class Cliente {
    
    //atributos
    private String cliente_nome = "";
    private String cliente_cpf = "";
    private String cliente_senha = "";
    private String cliente_sexo = "";
    private String cliente_endereco = "";
    private String cliente_cidade = "";
    private String cliente_estado = "";
    private String cliente_idade = "";
    private String cliente_casa_alugada = "";



    //GET e SET
    public String getNome() {
        return cliente_nome;
    }

    public void setNome(String nome) {
        this.cliente_nome = nome;
    }

    public String getCpf() {
        return cliente_cpf;
    }

    public void setCpf(String cpf) {
        this.cliente_cpf = cpf;
    }

    public String getSenha() {
        return cliente_senha;
    }
    
    public void setSenha(String senha) {
        this.cliente_senha = senha;
    }
    
    public String getSexo() {
        return cliente_sexo;
    }

    public void setSexo(String sexo) {
        this.cliente_sexo = sexo;
    }

    public String getEndereco() {
        return cliente_endereco;
    }

    public void setEndereco(String endereco) {
        this.cliente_endereco = endereco;
    }

    public String getCidade() {
        return cliente_cidade;
    }

    public void setCidade(String cidade) {
        this.cliente_cidade = cidade;
    }

    public String getEstado() {
        return cliente_estado;
    }

    public void setEstado(String estado) {
        this.cliente_estado = estado;
    }
    
    public String getIdade() {
        return cliente_idade;
    }

    public void setIdade(String idade) {
        this.cliente_idade = idade;
    }
    
    public String getCA() {
        return cliente_casa_alugada;
    }

    public void setCA(String CA) {
        this.cliente_casa_alugada = CA;
    }
    
    
    public void limpaCliente(){
    cliente_nome = "";
    cliente_cpf = "";
    cliente_senha = "";
    cliente_sexo = "";
    cliente_endereco = "";
    cliente_cidade = "";
    cliente_estado = "";
    cliente_idade = "";
    cliente_casa_alugada = "";
    }   
    
}
