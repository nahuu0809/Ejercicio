package onready;

/**
 *
 * @author Nahu
 */
public class Vehiculo {
    
    public String marca;
    public String modelo;
    public String tipo;
    public float precio;

    public Vehiculo(String marca, String modelo, String tipo, float precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    
     // Overriding the compareTo method
   public int compareTo(Vehiculo y) {
      return (this.marca + this.modelo).compareTo(y.marca + y.modelo);
   }
   
    public boolean equal(Vehiculo veh) {
        boolean isEqual=false;
        if(veh!=null && veh instanceof Vehiculo) {
            isEqual=(this.modelo == null ? modelo == null : this.modelo.equals(modelo));
        }
        return isEqual;
    }

    boolean getStarred() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
