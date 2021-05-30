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
public class Main {
    
  public static void main(String[] args) {
    GestaoHospital gestao = new GestaoHospital();
    Funcionario bockhee = new Enfermeiro(1, "Bockhee", "Emergencia", true);
    gestao.solicitar(bockhee);

    Funcionario meredith = new Medico(2, "Meredith", "Cirurgia geral", true);
    gestao.solicitar(meredith);
  }
}