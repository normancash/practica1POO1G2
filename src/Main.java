import model.*;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        //SUCURSAL
        Sucursal suc = new Sucursal(1,"Matagalpa","Matagalpa");
        Sucursal suc1 = new Sucursal(2,"Managua","Managua");
        //PIZZA
        Pizza pizza = new Pizza(300,1,"Hawiana"
                ,12, TAMANO_PIZZA.GRANDE, TIPO_BORDE.QUESO);
        DetalleOrden detalleOrden=new DetalleOrden(1,pizza,null
                ,1,0.00);
        Cliente cliente = new Cliente(1,"Norman"
                ,"Cash","Managua");
        Orden orden = new Orden(1,cliente,suc1,new Date(),detalleOrden);
        System.out.println(orden);
    }
}