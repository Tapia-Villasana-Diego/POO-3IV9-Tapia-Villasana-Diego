import java.util.Scanner;

class pokemon{
    public static void main(String[] args) {

        
        Scanner entrada=new Scanner(System.in);
        
         int opcion;
         double vida=100;
         int id;
         int batalla;
         double imp;
         double str;
         double def;
         System.out.println("3IV9 TAPIA VILLASANA DIEGO");
         do{System.out.println("Bienvenidos a la pokedex(alpha)");
         System.out.println("1.- Consultar datos de Charmander");
         System.out.println("2.- Consultar datos de Bulbasaur");
         System.out.println("3.- Consultar datos de Squirtle");
         System.out.println("4.- Batalla Pokemon");
         System.out.println("5.- Salir de la Pokedex");
         System.out.println("Selecciona uno por favor nwn");
            opcion=entrada.nextInt();
         switch (opcion) {
             case 1:
                str=15;
                def=10;
                id=4;
                System.out.println("Los datos de Charmander son: ");
                System.out.println("Su id es el N°: "+id);
                System.out.println("Su fuerza es de: "+str);
                System.out.println("Su defensa es de: "+ def);
                 break;
             case 2:
                str=12;
                def=11;
                id=1;
                System.out.println("Los datos de Bulbasaur son: ");
                System.out.println("Su id es el N°: "+id);
                System.out.println("Su fuerza es de: "+str);
                System.out.println("Su defensa es de: "+ def);

                break;
             case 3:
                id=7;
                str=10;
                def=15;
                System.out.println("Los datos de Squirtle son:");
                System.out.println("Su id es el N°: "+id);
                System.out.println("Su fuerza es de: "+str);
                System.out.println("Su defensa es de: "+ def);

                break;
            case 4:
                System.out.println("Elige un pokemon para combatir: ");
                System.out.println("1: Charmander");
                System.out.println("2: Bulbasaur");
                System.out.println("3: Squirtle");
                batalla = entrada.nextInt();
                if(batalla == 1){
                    str=15;
                    def=10;  
                    System.out.println("Tu pokemon elegido es Charmander");
                    System.out.println("Su fuerza es de: "+str);
                    System.out.println("Su defensa es de: "+ def);
                    
                    }
                if(batalla == 2){
                    str=12;
                    def=11;
                    System.out.println("Tu pokemon elegido es Bulbasaur");
                    System.out.println("Su fuerza es de: "+str);
                    System.out.println("Su defensa es de: "+ def);
                }
                if(batalla == 3){
                    id=7;
                    str=10;
                    def=15;
                    System.out.println("Tu pokemon elegido es Squirtle");
                    System.out.println("Su fuerza es de: "+str);
                    System.out.println("Su defensa es de: "+ def);
                }
                break;
         
             default:
             System.out.println("Gracias por usarme uwu");
                 break;
         }
        }while(opcion!=5);
        
    }
}