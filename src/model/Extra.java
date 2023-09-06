package model;

public class Extra extends Producto{

    private Integer id;
    private String nombre;

    public Extra(double precio, Integer id, String nombre) {
        super(precio);
        this.id = id;
        this.nombre = nombre;
    }

    public Extra(double precio) {
        super(precio);
    }

    @Override
    public String toString() {
        return "Extra{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
