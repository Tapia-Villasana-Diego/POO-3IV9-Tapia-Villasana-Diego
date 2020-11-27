//donde debemos descubrir el tipo de asociacion entre clases

import java.util.Scanner;

public class Ejercicios{

    Scanner entrada = new Scanner(System.in);

    /*programa para tener una calculadora que pueda 
    realizar conversion de unidades, creaciond e cuadritos y 
    movimiento del cuadro*/

    public void menu(){

        char op;

        System.out.println("Bienvenidos a este programa");
        System.out.println("a.- Calculadora");
        System.out.println("b.- Conversion de unidades");
        System.out.println("c.- Creacion de cadros");
        System.out.println("d.- Movimiento del cuadro");
        System.out.println("elija la opcion deseadda");

        op=entrada.next().charAt(0);

        switch (op) {
            case a:

                Calculadora();
                
                break;

            case b:

                Conversion();
            
                break;

            case c:

                CreaCuadros();

                break;

            case d:

                MoviCuadros();

                break;
        }
    }


    public void Calculadora(){

        double numero=0.00; suma= 0.00; multi= 0.00;
        char operacion, p;

        System.out.println("Seleccione la operación deseada");
        System.out.println("a.- Suma y Resta");
        System.out.println("b.- Multiplicacion");
        System.out.println("c.- Division");

        operacion= entrada.next.charAt(0);

        switch (operacion) {
            case "a":

                do{
                    System.out.println("Para parar la operacion presione 0");
                    System.out.println("ingresa el valor a sumar");
                    numero=entrada.nextDouble();

                    suma+= numero;
                }while(numero!=0);
                
                System.out.println("La suma de los numeros es de: "+suma);
                break;
        
            case "b":
                do{
                    System.out.println("Para parar la operacion presione 0");
                    System.out.println("ingresa el valor a multiplicar");
                    numero=entrada.nextDouble();    
                    if(numero>0){
                        multi*=numero;
                    }else{
                        System.out.println("solo numeros positivos");
                    }
                    
                }while(numero!=0);
            
                System.out.println("La multiplicación de los numeros es de: "+multi);
            break;


        }
    }

    public void Conversion(){

    }

    public void CreaCuadros(){

    }

    public void MoviCuadros(){

    }
}