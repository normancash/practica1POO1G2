package model;

public class Pizza extends Producto {

    private Integer id;
    private String ingrediente;
    private int cantidadSlide;
    private TAMANO_PIZZA tamanoPizza;

    private TIPO_BORDE tipoBorde;

    public Pizza(double precio) {
        super(precio);
    }

    public Pizza(double precio, Integer id, String ingrediente
            , int cantidadSlide
            , TAMANO_PIZZA tamanoPizza, TIPO_BORDE tipoBorde) {
        super(precio);
        this.id = id;
        this.ingrediente = ingrediente;
        this.cantidadSlide = cantidadSlide;
        this.tamanoPizza = tamanoPizza;
        this.tipoBorde = tipoBorde;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "id=" + id +
                ", ingrediente='" + ingrediente + '\'' +
                ", cantidadSlide=" + cantidadSlide +
                ", tamanoPizza=" + tamanoPizza +
                ", tipoBorde=" + tipoBorde +
                ", precio=" + precio +
                '}';
    }
}
