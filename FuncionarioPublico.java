/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cadastrofuncionarios_maven_victor;

/**
 *
 * @author VEMF
 */
public class FuncionarioPublico extends Funcionario{
    private String siape;
    private String anoAdmissao;
    private String departamento;
    
    public FuncionarioPublico(String nome, String sobrenome,
            short code, String cpf, String setor, String siape,
            String anoAdmissao, String departamento){
        super(nome, sobrenome, code, cpf, setor);
        
        this.siape = siape;
        this.anoAdmissao = anoAdmissao;
        this.departamento = departamento;
    }
    //get
    public String getSiape(){
        return siape;
    }
    public String getAnoAdmissao(){
        return anoAdmissao;
    }
    public String getDepartamento(){
        return departamento;
    }
    
    //set
    public void setSiape(String siape){
        this.siape = siape;
    }
    public void setAnoAdmissao(String anoAdmissao){
        this.anoAdmissao = anoAdmissao;
    }
    public void setDepartamento(String departamento){
        this.departamento = departamento;
    }   
}
