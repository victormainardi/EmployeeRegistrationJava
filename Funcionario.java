/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cadastrofuncionarios_maven_victor;

/**
 *
 * @author VEMF
 */
public class Funcionario {
    private String nome;
    private String sobrenome;
    private short code; //antigo nascimento, irrelevante, deixar code pra pesquisar por code
    private String cpf;
    public String setor;
    //construtores
    public Funcionario(String nome, String sobrenome, short code, String cpf, String setor){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.code = code;
        this.cpf = cpf;
        this.setor = setor;
    }
    
    //gets
    public String getNome(){
        return nome;
    }
    public String getSobrenome(){
        return sobrenome;
    }
    public short getCode(){
        return code;
    }
    public String getCpf(){
        return cpf;
    }
    public String getSetor(){
        return setor;
    }

    
    //sets
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }
    public void setCode(short code){
        this.code = code;
    }
    private void setCpf(String cpf){
        this.cpf = cpf;
    }
    public void setSetor(String setor){
        this.setor = setor;
    }
}
