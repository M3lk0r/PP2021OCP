/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2021ocp.nope;

/**
 *
 * @author eduar
 */
public class Medico extends Funcionario{

  public Medico(int id, String nome, String departamento, boolean trabalhando){
    super(id, nome, departamento, trabalhando);
    System.out.println("* Ações do(a) médico(a):");
  }
}