import model.*;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        //SUCURSAL
        Sucursal suc = new Sucursal(1,"Matagalpa","Matagalpa");
        Sucursal suc1 = new Sucursal(2,"Managua","Managua");
        suc1 = new Sucursal(3,"Ciudad Sandino","Ciudad Sandino");
        //PIZZA
        Pizza pizza = new Pizza(300,1,"Hawiana"
                ,12, TAMANO_PIZZA.GRANDE, TIPO_BORDE.QUESO);
        Pizza pizza1 = new Pizza(500,2,"Peperoni"
                ,12, TAMANO_PIZZA.GRANDE, TIPO_BORDE.QUESO);
        DetalleOrden detalleOrden=new DetalleOrden(1,pizza,null
                ,1);
        DetalleOrden detalleOrden1 = new DetalleOrden(2,pizza1,null
                ,1);
        DetalleOrden [] d = new DetalleOrden[2];
        d[0] = detalleOrden;
        d[1] = detalleOrden1;
        Cliente cliente = new Cliente(1,"Norman"
                ,"Cash","Managua");
        Orden orden = new Orden(1,cliente,suc1,new Date(),d);
        System.out.println(orden);
    }
}