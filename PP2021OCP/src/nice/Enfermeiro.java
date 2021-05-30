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
public class Enfermeiro extends Funcionario{

  public Enfermeiro(int id, String nome, String departamento, boolean trabalhando){
    super(id, nome, departamento, trabalhando);
    System.out.println("- Ações do(a) enfermeiro(a):");
  }

  private void checarSinaisVitais(){
    System.out.println("Checando sinais vitais.");
  }

  private void tirarSangue(){
    System.out.println("Tirando sangue.");
  }

  private void limparAreaPaciente(){
    System.out.println("Limpando área do paciente.");
  }

  @Override
  public void realizarObrigacoes(){
    checarSinaisVitais();
    tirarSangue();
    limparAreaPaciente();
  }
}