
import java.util.Scanner;
import javax.sound.midi.SysexMessage;

public class Metodos {
    Scanner sc = new Scanner( System.in);
    
    public ObjVehiculo[][] llenarCeldas(ObjVehiculo[][] m){
    int numeroCelda = 1;
    {
        for (int i = 0; i < m.length; i++) { // filas
            for (int j = 0; j < m.length; j++) { //columnas
              ObjVehiculo o = new ObjVehiculo();
              System.out.println("Ingrewse la marca del vehiculo");
              o.setMarca(sc.next());//ln
              System.out.println(".Ingrese el tipo de vehiculo");
              o.setTipo(sc.next());//ln
              System.out.println("Ingrese el cilindraje del vehiculo");
              o.setCilindraje(sc.nextInt());
              if(o.getCilindraje() > 900 && o.getCilindraje() <= 1600){
                o.setPagoAnterior(: 150000);
              }else if (o.getCilindraje() > 1600 && o.getCilindraje() <= 2000) {
                o.setPagoAnterior(: 200000);
              } else {
                o.setPagoAnterior(:250000);
              }
              o.setNumCelda(numeroCelda);
              numeroCelda++;
              m[i][j] = o;
            }
        }
        return m;
     }
    }
    public ObjVehiculo[][] CalculraNuevoPago(ObjVehiculo[][] m){
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                m[i][j].setPagoActual((int) (m[i][j].getPagoAnterior() *1.23));
                
            }
        }
         return m;
    }
    public void MostrarInformacionCeldas(ObjVehiculo [][] m)
    {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                System.out.println("Marca: " + m[i][j].getMarca());
                System.out.println("Tipo Vehiculo: " + m[i][j].getTipo());
                System.out.println("cilindraje: " + m[i][j].getCilindraje());
                System.out.println("Pago Anterior: " + m[i][j].getCilindraje());
                System.err.println("Pago Actual: " + m[i][j].getPagoActual());
                System.out.println("Numero celda: " + m[i][j].getNumCelda());
            
  

                
            }
            
        }
    }
   
}
