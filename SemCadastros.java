/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cadastrofuncionarios_maven_victor;

/**
 *
 * @author VEMF
 */
public class SemCadastros extends Exception{
    public SemCadastros(String erro){ /*Construtor que exibe uma mensagem quando banco de dados está vazio */
        super(erro);                             /*Na hora de lançar o throw é´passado a mensagem indicativa*/
    }    
}
