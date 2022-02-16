/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cadastrofuncionarios_maven_victor;

/**
 *
 * @author VEMF
 */
public class FuncionarioPrivado extends Funcionario {   
    private String concedente;
    private String tempoContrato;
    private String area;
      
    public FuncionarioPrivado(String nome, String sobrenome, short code, String cpf, String setor, String concedente, String tempoContrato, String area){
        super(nome, sobrenome, code, cpf, setor);
        
        this.concedente = concedente;
        this.tempoContrato = tempoContrato;
        this.area = area; //difere de setor e departamento, *****estruturar melhor isso
    }
    
    //metodos getters
    public String getConcedente(){
        return concedente;
    }
    
    public String getTempoContrato(){
        return tempoContrato;
    }
    
    public String getArea(){
        return area;
    }
    

    //metodos setters
    public void setConcedente(String concedente){
        this.concedente = concedente;
    }
    
    public void setTempoContrato(){
        this.tempoContrato = tempoContrato;
    }

    public void setArea(){
        this.area = area;
    }
    
}
