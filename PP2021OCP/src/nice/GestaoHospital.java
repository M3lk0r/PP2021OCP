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
public class GestaoHospital{
  public void solicitar(Funcionario funcionario){
    funcionario.realizarObrigacoes();
  }
}
//não precisa saber mais os detalhes do que os médicos e enfermeiros fazem.
//ao decorrer do tempo, quando for adicionar mais cargos, essa classe aumentaria e viraria uma bagunça. por isso foi separado cada método em sua determinada classe e isso permite ser mais abstrato.