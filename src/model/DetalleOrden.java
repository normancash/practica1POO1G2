package model;

public class DetalleOrden {

    private Integer id;
    private Pizza pizza;
    private Extra extra;
    private int cantidad;
    private double subTotal;

    private double precio;

    public DetalleOrden(Integer id, Pizza pizza, Extra extra
            , int cantidad, double subTotal) {
        this.id = id;
        this.pizza = pizza;
        this.extra = extra;
        this.cantidad = cantidad;
        this.subTotal = subTotal;
        if (pizza != null) this.precio = pizza.precio * cantidad;
        if (extra != null) this.precio = extra.precio * cantidad;
    }

    public DetalleOrden() {
    }

    @Override
    public String toString() {
        return "DetalleOrden{" +
                "id=" + id +
                ", pizza=" + pizza +
                ", extra=" + extra +
                ", cantidad=" + cantidad +
                ", subTotal=" + subTotal +
                ", precio=" + precio +
                '}';
    }
}
