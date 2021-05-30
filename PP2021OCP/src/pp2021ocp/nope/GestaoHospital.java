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
public class GestaoHospital{
  //ordenar funções para funcionarios
  public void solicitar(Funcionario funcionario){
    if (funcionario instanceof Enfermeiro){
      chegarSinaisVitais();
      tirarSangue();
      limparAreaPaciente();
    }
    else if (funcionario instanceof Medico){
      diagnosticarPaciente();
      preescreverRemedios();
    }
  }

  //Enfermeiros
  private void chegarSinaisVitais(){
    System.out.println("Checando sinais vitais.");
  }

  private void tirarSangue(){
    System.out.println("Tirando sangue.");
  }

  private void limparAreaPaciente(){
    System.out.println("Limpando área do paciente.");
  }

  //Médicos
  private void diagnosticarPaciente(){
    System.out.println("Diagnosticando paciente.");
  }

  private void preescreverRemedios(){
    System.out.println("Preescrevendo remédios.");
  }
}