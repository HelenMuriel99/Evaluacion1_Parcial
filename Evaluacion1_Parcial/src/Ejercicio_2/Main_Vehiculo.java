package Ejercicio_2;

public class Main_Vehiculo {
    public static void main(String[] args) {
        Vehiculo vehiculo_1 = new Vehiculo("Dodge", "RAM-3500", 2500);
        Vehiculo vehiculo_2 = new Vehiculo("Toyota", "Hilux-2012", 4001);
        Vehiculo vehiculo_3 = new Vehiculo("Dodge", "Raptor-2500", 3000);

        vehiculo_1.mostrarDetalles();
        vehiculo_1.getPrecio();
        System.out.println();

        vehiculo_2.mostrarDetalles();
        vehiculo_2.getPrecio();
        System.out.println();

        vehiculo_3.mostrarDetalles();
        vehiculo_3.getPrecio();
    }
}
