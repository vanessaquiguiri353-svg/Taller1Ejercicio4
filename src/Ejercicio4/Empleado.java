/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class Empleado {
    //Atributos
String nombre;
double salarioBase = 460;
int horasExtras;
double salarioTotal;
    // Métodos
    public void ingresarDatos() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el nombre del empleado: ");
        nombre = sc.nextLine();
        System.out.print("Ingrese las horas extras: ");
        horasExtras = sc.nextInt();
    }

    public void calcularSalarioTotal() {
        salarioTotal = salarioBase + (horasExtras * 10);
    }

    public void mostrarDatos() {
        System.out.println("----------------------------");
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario base: $" + salarioBase);
        System.out.println("Horas extras: " + horasExtras);
        System.out.println("Salario total: $" + salarioTotal);
    }
}


