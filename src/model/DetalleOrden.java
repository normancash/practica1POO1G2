package model;

public class DetalleOrden {

    private Integer id;
    private Pizza pizza;
    private Extra extra;
    private int cantidad;
    private double subTotal;

    private double precio;

    public DetalleOrden(Integer id, Pizza pizza, Extra extra
            , int cantidad) {
        this.id = id;
        this.pizza = pizza;
        this.extra = extra;
        this.cantidad = cantidad;
        this.precio = pizza.precio;
        if (pizza != null) this.subTotal = pizza.precio * cantidad;
        if (extra != null) this.subTotal = extra.precio * cantidad;
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    public Extra getExtra() {
        return extra;
    }

    public void setExtra(Extra extra) {
        this.extra = extra;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
