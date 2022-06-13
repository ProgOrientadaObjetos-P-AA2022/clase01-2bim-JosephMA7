
package paquete1;

public class Vehiculo {
  private String matricula;
  private String tipo ;
  private String valor;
  
  public void establecerMatricula(String c){
      matricula = c;
  }
  public void establecerTipo(String c){
      tipo = c;
  }
  public void establecerValor(String c){
      valor = c;
  }
  public String obtenerMatricula(){
      return matricula;
  }
  public String obtenerTipo(){
      return tipo;
  }
}
