/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cadastrofuncionarios_maven_victor;

/**
 *
 * @author VEMF
 */

//tratamento
public class FuncionarioNaoEncontrado extends Exception{
    
    public FuncionarioNaoEncontrado(String erro){
        super(erro);
    }
}
