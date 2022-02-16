/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cadastrofuncionarios_maven_victor;

import java.util.ArrayList;

/**
 *
 * @author VEMF
 */
public class Listar {
    
    public ArrayList<FuncionarioPublico>ListFuncionarioPublico = new ArrayList();
    public ArrayList<FuncionarioPrivado>ListFuncionarioPrivado = new ArrayList();
    
    //metodo de cadastrar funcionario
    public void cadastrarFuncionarioPublico(FuncionarioPublico fpu){
        ListFuncionarioPublico.add(fpu);
    }
    //metodo de cadastrar funcionario privado
    public void cadastrarFuncionarioPrivado(FuncionarioPrivado fp){
        ListFuncionarioPrivado.add(fp);
    }
    
    //metodo que retorna o total de funcionario
    public int totalFuncionarioPublico(){
        return ListFuncionarioPublico.size();
    }
    //metodo que retorna o total de funcionario privado
    public int totalFuncionarioPrivado(){
        return ListFuncionarioPrivado.size();
    }
}
