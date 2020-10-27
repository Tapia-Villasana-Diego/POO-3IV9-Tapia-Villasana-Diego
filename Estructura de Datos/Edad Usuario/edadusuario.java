import java.util.Scanner;
class edadusuario{
    public static void main(String[] args) {
    
    Scanner entrada= new Scanner(System.in);

    int edad;
    int abono;
    double descuento;
    boolean Socio = true;

    System.out.println("Ingrese el precio del abono");
    abono=entrada.nextLine();
    System.out.println("Ingresa tu edad");
    edad=entrada.nextLine();


        System.out.println("Su precio final es de");
        descuento = abono-(abono*.4);

    }
}