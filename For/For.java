import java.util.*;

class For{
    
    public static void main(String[] args) {

        Scanner entrada=new Scanner(System.in);
        int num;
        System.out.println("Ingrese un valor para el contador");

        num=entrada.nextInt();
        System.out.println("Ejemplo de for");

        for(int i=0; i<=num; i++){
            System.out.println();
            System.out.print("-- "+i+" -- ");
            System.out.println();
            for(int j=0; j<=5; j++){
                System.out.print(" // "+j+(" // "));
                //System.out.println();
                for(int k=0; k<=2; k++){
                  // System.out.print(" ** "+k+" ** ");
                }
            }
        }
    }
}