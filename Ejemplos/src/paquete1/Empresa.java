
package paquete1;

public class Empresa {
    private String nombre;
    private Edificio [] edificios;
    private double costoBienesInmuebles;
    private double costoVehiculo;
    private double costoTotalInmuebles;
    
    public void establecerNombre(String m){
        nombre = m;
    }
    
    public void establecerEdificios(Edificio[] m){
        edificios = m;
    }
    public void establecerVehiculos(Vehiculo[] m){
        vehiculos = m;
    }
    
    public void establecerCostoBienesInmuebles(){
        double suma = 0;
        for(int i=0 ;i<obtenerEdificios().length; i++){
            suma = suma + obtenerEdificios()[i].obtenerCosto();
        }
        costoBienesInmuebles = suma;
    }
    public void establecerCostoVehiculos(){
        double suma = 0;
        for(int i =0 ; i<obtenerVehiculos().length; i++){
            suma += obtenerVehiculos()[i].obtenerValor
        }
    }
    public String obtenerNombre(){
        return nombre;
    }
    
    public Edificio[] obtenerEdificios(){
        return edificios;
    }
    public double obtenerCostosBienesInmuebles(){
        return costoBienesInmuebles;
    }
    @Override
    public String toString(){
     String reporte = String.format("%s\n Lista de Edificios \n",
              obtenerNombre());
     for(int i=0 ;i<obtenerEdificios().length; i++){
            reporte = String.format("%s%d. %s (%.1f)\n", 
                    reporte,
                    i+1,
                    obtenerEdificios()[i].obtenerNombre().toUpperCase(),
                    obtenerEdificios()[i].obtenerCosto());
        }
     reporte = String.format("%s\nTotal de Inmuebles: %.1f\n",reporte,
             obtenerCostosBienesInmuebles());
      return reporte;
    }
}
