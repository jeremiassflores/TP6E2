
package E2;

import java.util.Objects;


public class Producto implements Comparable<Producto>{
    
    private Integer codigo;
    private String descripcion;
    private Double precio;
    private Integer stock;
    private String rubro;

    public Producto() {
    }

    public Producto(Integer codigo, String descripcion, Double precio, Integer stock, String rubro) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
        this.rubro = rubro;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getRubro() {
        return rubro;
    }

    public void setRubro(String rubro) {
        this.rubro = rubro;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + this.codigo;
        hash = 67 * hash + Objects.hashCode(this.descripcion);
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.precio) ^ (Double.doubleToLongBits(this.precio) >>> 32));
        hash = 67 * hash + this.stock;
        hash = 67 * hash + Objects.hashCode(this.rubro);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Producto other = (Producto) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        if (Double.doubleToLongBits(this.precio) != Double.doubleToLongBits(other.precio)) {
            return false;
        }
        if (this.stock != other.stock) {
            return false;
        }
        if (!Objects.equals(this.descripcion, other.descripcion)) {
            return false;
        }
        return Objects.equals(this.rubro, other.rubro);
    }

    @Override
    public String toString() {
        return "Producto{" 
                + "codigo= " + codigo 
                + ", descripcion= " + descripcion 
                + ", precio= " + precio 
                + ", stock= "  + stock 
                + ", rubro= " + rubro + '}';
    }
    
    
    @Override
    public int compareTo(Producto otro){
        return this.descripcion.compareTo(otro.getDescripcion());
    }
}
