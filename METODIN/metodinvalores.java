import java.util.Scanner;

public class metodinvalores{
    
   

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        

        metodinvalores mayormenor = new metodinvalores();

        System.out.println("uwu");
        mayormenor.cargarValores();
        System.out.println("Deseas repetir?");
        
        System.out.println("TAT");
    } 

    public void cargarValores() {
        //metodo vacio por eso se pone void, es vacio porque
        //no estamos enviando o recibiendo ningun parametro
        Scanner entrada = new Scanner(System.in);
        int val1, val2, val3;
        int mayor, menor;
        System.out.println("Ingresa el primer numero a comparar");
        val1=entrada.nextInt();
        System.out.println("Ingresa el segundo numero a comparar");
        val2=entrada.nextInt();
        System.out.println("Ingresa el tercer numero a comparar");
        val3=entrada.nextInt();

        mayor= CalcularMayor(val1, val2, val3);

        menor= CalcularMenor(val1, val2, val3);

        System.out.println("El mayor es: "+mayor);
        System.out.println("El menor es: "+menor);
    }

    public int CalcularMayor(int v1, int v2, int v3){
        int m;
        if(v1>v1 && v1>v3){
            m=v1;
        }else{
            if(v2>v3){
            m=v2;
            }else{ 
                m=v3;
        } 
        }return m;
        

    }
    public int CalcularMenor(int v1, int v2, int v3){
        int m;
        if(v1<v2 && v1<v3){
            m=v1;
        }else{
            if(v2<v3){
            m=v2;
            }else{ 
                m=v3;
        } 
        } return m;

    }
    
    

   
}