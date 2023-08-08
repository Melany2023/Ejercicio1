/*
En un nuevo proyecto crear una clase de nombre Cuadrilatero con los atributos largo y alto, un
constructor que permita inicializar dichos atributos, sus respectivos getter y setter y los siguientes
métodos adicionales:
 calcularPerimetro(): este método retornará el perímetro del cuadrilátero.
 calcularArea(): este método retornará la superficie del cuadrilátero.
 esUnCuadrado(): este método retornará true si este cuadrilátero es un cuadrado, caso
contrario retornará false.
Luego desde la clase principal del proyecto (la que contiene el método main) se pide:

a) Crear un objeto Cuadrilatero con largo 70 y altura 50;
Luego utilizando sus métodos:
a) Mostrar por consola su perímetro
b) Mostrar por consola su superficie.
c) Mostrar por consola si es un cuadrado o no.
d) Cambiar el estado de uno de sus atributos para que sea un cuadrado.
 */
package ejercicio.pkg1.pkg2;

/**
 *
 * @author Nicole
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cuadrilatero cuadrilatero1=new Cuadrilatero (70, 50);
        System.out.println("perimetro: "+cuadrilatero1.calcularPerimetro());
        System.out.println("area: "+cuadrilatero1.calcularArea());
        System.out.println("¿Es un cuadrado? "+cuadrilatero1.esUnCuadrado());
        cuadrilatero1.setAlto(70);
        System.out.println("¿Es un cuadrado? "+cuadrilatero1.esUnCuadrado());
        
        
    }
    
}
