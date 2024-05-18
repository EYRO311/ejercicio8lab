package eje_lab_8;

import java.io.IOException;

public class PruebaLecturaNumeros {

    public static void main(String[] args) {
        LecturaNumeros ln = new LecturaNumeros();
        
        try {
            // Leer 2 enteros
            int num1 = ln.readInt("Introduce el primer número entero: ");
            int num2 = ln.readInt("Introduce el segundo número entero: ");
            
            // Leer 1 Integer
            System.out.print("Introduce el tercer número (Integer): ");
            Integer num3 = ln.readInteger();
            
            // Leer 1 double
            double num4 = ln.readDouble("Introduce el cuarto número (double): ");
            
            // Leer 1 Double
            Double num5 = ln.readDouble("Introduce el quinto número (Double): ");
            
            // Desplegar los números leídos
            System.out.println("Primer número entero: " + num1);
            System.out.println("Segundo número entero: " + num2);
            System.out.println("Tercer número (Integer): " + num3);
            System.out.println("Cuarto número (double): " + num4);
            System.out.println("Quinto número (Double): " + num5);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
