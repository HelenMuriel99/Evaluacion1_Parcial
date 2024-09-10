package Ejercicio_2;

public class Vehiculo {
    private  String marca;
    private String modelo;
    private double precio;

    public Vehiculo(String marca, String modelo, double precio){
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public double getPrecio() {
        if (precio >= 2500 && precio <= 4000){
            System.out.println("Vehiculo seleccionado. Cumple con el rango buscado");
        } else {
            System.out.println("Vehiculo no selecionado. No cumple con el rango buscado");
        }
        return precio;
    }

    public  void  mostrarDetalles(){
        System.out.println("Marca: " +marca);
        System.out.println("Modelo: " +modelo);
        System.out.println("Precio: " +precio);
    }
}
