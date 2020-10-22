import java.util.Scanner;

class FiguraMenu{

    public static void main(String[] args){
        /*
        Vamos a realizar un programa el cual
        imprima un menu para calcular perimetro y area 
        de las siguientes figuras geometricas
        cuadrado, triangulo circulo
        lo que quiero de tarea *w* wiiiiii
        1.- Quiero que el menu se repita hasta que yo escriba S o s de salir
        2.- completar el calculo para el perimetro
        3.- Comprobar que todos los numeros sean reales positivos
        4.- Vamos a agregar 3 figuras mas *w*
            Rectangulo, Rombo, Hexagono wiiiiii
        */

        //variables  y objetos
        Scanner entrada = new Scanner(System.in);
        int opcion;
        int altura;
        int base;
        double resultado;


        //la creacion del menu

        System.out.println("Bienvenido al programa de calculo de areas y perimetros");
        System.out.println("Elija una de las siguientes opciones:");
        System.out.println("1.- Calcular area de un cuadrado");
        System.out.println("2.- Calcular area de un triangulo");
        System.out.println("3.- Calcular area de un circulo");
        System.out.println("4.- Calcular el area de un Rectangulo");
        System.out.println("5.- Calcular el area de un Rombo");
        System.out.println("6.- Calcular el area de un Hexagono");
        System.out.println("7.- Calcular el perimetro de un Cuadrado");
        System.out.println("8.- Calcular el perimetro de un Triangulo");
        System.out.println("9.- Calcular el perimetro de un Circulo");
        System.out.println("10.- Calcular el perimetro de un Rectangulo");
        System.out.println("11.- Calcular el perimetro de un Rombo");
        System.out.println("12.- Calcular el perimetro de un Hexagono");
        System.out.println("Gracias uwu");
        System.out.println(".- Salir");

        opcion = entrada.nextInt();

        //saber que opcion para que calculo
        switch(opcion){
            case 1:
                System.out.println("Ingresa el valor de un lado");
                base = entrada.nextInt();
                resultado = base*base;
                System.out.println("El area es de: "+resultado);
                //cerrar los casos
                break;

            case 2:
                System.out.println("Ingresa el valor de la base");
                base = entrada.nextInt();
                System.out.println("Ingresa el valor de la altura");
                altura = entrada.nextInt();
                resultado = (base*altura)/2;
                System.out.println("El area es de: "+resultado);
                break;

            case 3:
                System.out.println("Ingresa el valor del radio");
                base = entrada.nextInt();
                resultado = 3.1416*(base*base);
                System.out.println("El area es de: "+resultado);
                break;
            case 4: 
                System.out.println("ingresa el valor del lado");
                base = entrada.nextInt();
                System.out.println("ingresa el valor de la altura");
                altura = entrada.nextInt();
                resultado = (base*altura);
                System.out.println("el area es de: "+resultado);
                break;
            case 5: 
                System.out.println("ingresa el valor de la diagonal mayor");
                base = entrada.nextInt();
                System.out.println("ingrese el valor de la diagonal menor");
                altura = entrada.nextInt();  
                resultado = (base*altura)/2;
                System.out.println("el area es de: "+resultado);
                break;
            case 6:
                System.out.println("ingresa el valor del perimetro");
                base = entrada.nextInt();
                System.out.println("ingresa el valor del apotema");
                altura = entrada.nextInt();
                resultado = (base*altura)/2;
                System.out.println("el area es de: "+resultado);
            case 7:
                System.out.println("ingresa el valor de un lado");
                base = entrada.nextInt();
                resultado = base*4;
                System.out.println("el perimetro es de: "+resultado);
                break;
            case 8:
                System.out.println("ingresa el valor de un lado");
                base = entrada.nextInt();
                resultado = base*3;
                System.out.println("el perimetro es de: "+resultado);
                break;
            case 9: 
                System.out.println("ingresa el valor de su radio");
                base = entrada.nextInt();
                resultado = (2*3.1416)*base;
                System.out.println("el perimetro es de: "+resultado);
                break;
            case 10:
                System.out.println("ingresa el valor del uno de sus lados");
                base = entrada.nextInt();
                System.out.println("ingresa el valor de la altura");
                altura = entrada.nextInt();
                resultado = (2*base)+(2*altura);
                System.out.println("el perimetro es de: "+resultado);
                break;
            case 11:
                System.out.println("ingresa el valor del uno de sus lados");
                base = entrada.nextInt();
                resultado = base*5;
                System.out.println("el perimetro es de: "+resultado);
                break;
            case 12:
                System.out.println("ingresa el valor del uno de sus lados");
                base = entrada.nextInt();
                resultado = base*6;
                System.out.println("el perimetro es de: "+resultado);
                break;
            default:
                System.out.println("Gracias por usarme owo");
        
            
        }
    }
}