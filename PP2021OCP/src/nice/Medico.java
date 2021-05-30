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
public class Medico extends Funcionario{

  public Medico(int id, String nome, String departamento, boolean trabalhando){
    super(id, nome, departamento, trabalhando);
    System.out.println("- Ações do(a) médico(a):");
  }

  private void diagnosticarPaciente(){
    System.out.println("Diagnosticando paciente.");
  }

  private void preescreverRemedios(){
    System.out.println("Preescrevendo remédios.");
  }

  @Override
  public void realizarObrigacoes(){
    diagnosticarPaciente();
    preescreverRemedios();
  }
}