package Ejercicio_1;

public class Main_Empleado {
    public static void main(String[] args) {
        Empleado empleado_1 = new Empleado("Juan", 35, 2500);
        Empleado empleado_2 = new Empleado("Teodora", 24, 3200);
        Empleado empleado_3 = new Empleado("Filomena", 40, 2900);

        System.out.println("Empleado Nº 1");
        empleado_1.mostrarDatos();
        empleado_1.aplicarAumento();
        System.out.println();

        System.out.println("Emplado Nº 2");
        empleado_2.mostrarDatos();
        empleado_2.aplicarAumento();
        System.out.println();

        System.out.println("Empleado Nº 3");
        empleado_3.mostrarDatos();
        empleado_3.aplicarAumento();
    }
}
