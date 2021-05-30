/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nice;

/**
 *
 * @author eduar
 */
public abstract class Funcionario{

  private int id;
  private String nome;
  private String departamento;
  private boolean trabalhando;

  public Funcionario(int id, String nome, String departamento, boolean trabalhando){
    this.id = id;
    this.nome = nome;
    this.departamento = departamento;
    this.trabalhando = trabalhando;
  }

  public abstract void realizarObrigacoes();
}