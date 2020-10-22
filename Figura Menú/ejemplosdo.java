import java.util.Scanner;
class ejemplosdo {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        boolean Salir=false;
        int opcion;
        int altura, base;
        double resultado;
        while (!Salir){

         System.out.println("Bienvenidos a calculo de areas y perimetros");
         System.out.println("1.- Calcular el area de un Cuadrado");
         System.out.println("2.- Calcular el area de un Triangulo");
         System.out.println("3.- Calcular el area de un Circulo");
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
         System.out.println("13.- Salir");
         opcion = entrada.nextInt();
          
         
                switch (opcion) {
                 case 1: 
                 System.out.println("ingresa el valor de los lados");
                    base = entrada.nextInt();
                 resultado = base*base;
                    System.out.println("el area es de: "+resultado);
                     break;
                 case 2:
                    System.out.println("ingresa el valor del lado");
                 base = entrada.nextInt();
                 System.out.println("ingresa el valor de la altura");
                 altura = entrada.nextInt();
                 resultado = base*altura;
                    System.out.println("el area es de: "+resultado);
                    break;
                 case 3: 
                    System.out.println("ingresa el valor del radio");
                    base = entrada.nextInt();
                 resultado = (base*base)*3.1416;
                    System.out.println("el area es de: "+resultado);
                    break;
                 case 4: 
                    System.out.println("ingresa el valor del lado");
                    base = entrada.nextInt();
                 System.out.println("ingresa el valor de la altura");
                    altura = entrada.nextInt();
                    resultado = base*altura;
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
                    break;
                    /*tarea
                    1.- menu se repite hasta que escriba S
                    2.- completar el calculo para el perimetro
                     3.- comprobar que los numeros sean reales y positivos
                    4.- Agregar 3 figuras mas uwu
                     Rectangulo, Rombo, hexagono.
                    */
        
                }
            
        }
    }
}