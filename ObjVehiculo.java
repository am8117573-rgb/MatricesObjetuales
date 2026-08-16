public class ObjVehiculo {
    private String marca;
    private String tipo;
    private int cilindraje;
    private int pagoAnterior;
    private int pagoActual;
    private int numCelda;
    public ObjVehiculo(String marca, String tipo, int cilindraje, int pagoAnterior, int pagoActual, int numCelda) {
        this.marca = marca;
        this.tipo = tipo;
        this.cilindraje = cilindraje;
        this.pagoAnterior = pagoAnterior;
        this.pagoActual = pagoActual;
        this.numCelda = numCelda;
    }
    public ObjVehiculo() {
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public int getCilindraje() {
        return cilindraje;
    }
    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }
    public int getPagoAnterior() {
        return pagoAnterior;
    }
    public void setPagoAnterior(int pagoAnterior) {
        this.pagoAnterior = pagoAnterior;
    }
    public int getPagoActual() {
        return pagoActual;
    }
    public void setPagoActual(int pagoActual) {
        this.pagoActual = pagoActual;
    }
    public int getNumCelda() {
        return numCelda;
    }
    public void setNumCelda(int numCelda) {
        this.numCelda = numCelda;
    }
    

}
