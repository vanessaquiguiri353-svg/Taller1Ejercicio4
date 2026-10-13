/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio4;

/**
 *
 * @author HP
 */
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuántos empleados desea ingresar? ");
        int n = sc.nextInt();

        Empleado[] empleados = new Empleado[n];

        // Ingreso de datos y cálculo
        for (int i = 0; i < n; i++) {
            System.out.println("\nEmpleado #" + (i + 1));
            empleados[i] = new Empleado();
            empleados[i].ingresarDatos();
            empleados[i].calcularSalarioTotal();
        }

        // Mostrar resultados
        System.out.println("\n===== DATOS DE LOS EMPLEADOS =====");
        for (int i = 0; i < n; i++) {
            empleados[i].mostrarDatos();
        }
    }
}
