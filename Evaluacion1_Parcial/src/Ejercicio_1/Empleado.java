package Ejercicio_1;

public class Empleado {
    private String nombre;
    private int edad;
    private  double salario;

    public Empleado(String nombre, int edad, double salario){
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public double aplicarAumento(){
        if (salario <= 3000){
            double salarioActual = salario + ((salario/100)*10);
            System.out.println("Tu salario actual mas tu aumento es de: " +salarioActual);
        } else if (salario> 3000) {
            System.out.println("No resivira ningun aumento");
        }
        return salario;
    }

    public void mostrarDatos(){
        System.out.println("Nombre: " +nombre);
        System.out.println("Edad: " +edad);
        System.out.println("Salario: "+salario);
    }
}
