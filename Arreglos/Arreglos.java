import java.util.*;

class Arreglos{

    public static void main(String[] args){

        Scanner entrada01 = new Scanner(System.in);
        Scanner entradaAB = new Scanner(System.in);


        /*
      

        Leer una matriz A de 3X3 y una matriz B de 3X3 y sumarla en la matriz S.
        */

        
        //Varaibles de estructura
        boolean finalizarProgramaPrincipal = false;
        boolean finalizarProgramaSecundario = false;
        boolean delimitacionDeRespuesta = false;
        String decisionFinal = "";
        int opcionDePrograma = 0;

        
        //variables 1
        int longitudArreglo = 0;
        int contador = 1;
        int P = 0;
        int N = 0;
        int P2 = 0;
        int N2 = 0;

        //variables 2
        int longitudArreglo2 = 0;
        int sumaDePares = 0;
        int promedio = 0;

        //variables 3
        boolean finalizarProgramaTerciario = false;
        boolean delimitacionDeRespuesta2 = false; 
        int longitudArreglo3 = 0;

        int opcionDeProgramaSecundario = 0;
        int burbuja = 0;
        String decision = "";

        int sumaCalificaciones = 0;
        double promedioCalificaciones = 0;
        int contadorCalifSupePro = 0;
        int contadorCalifInfePro = 0; 
        int calificacionesReprobadas = 0;
        int calificacionesAprobadas = 0;

        //variables 4
        int contador2 = 0;
        int SumaMatrizC =0;
        int longitudArreglo4 = 0;
        
       

                

     do{
            finalizarProgramaSecundario = false; 
            delimitacionDeRespuesta = false;
            opcionDePrograma = 0;
            decisionFinal = "";

            System.out.println("------------------------");
            System.out.println("|" + "Programas de Arreglos" + "|");
            System.out.println("------------------------");
            System.out.println("");
            System.out.println("Que programa desea ejecutar?");
            System.out.println("1.- Contador de numeros Positivos y Negativos");
            System.out.println("2.- Promedio de numeros Pares ");
            System.out.println("3.- Calificaciones");
            System.out.println("4.- Suma de Dos matrices");
            System.out.println("Para terminar el programa, introduzca la letra 'S' o 's'");
            System.out.println("");
            opcionDePrograma = entrada01.nextInt();
            System.out.println("");


            /*métodos

                public void contadorPositivosNegativos(){

                    variables
                    int longitudArreglo = 0;
                    int contador = 0;
                    int P = 0;
                    int N = 0;
                    

                    System.out.println("Cuantos Numeros desea Analizar (Contar Positivos y Negativos)?");
                    longitudArreglo = entrada01.nextInt();

                    int arregloContadorPoNe[] = new int[longitudArreglo];
                    int arregloPositivos[] = new int[longitudArreglo];
                    int arregloNegativos[] = new int[longitudArreglo];


                    for (int i = 0; i < longitudArreglo; i++){ 

                        System.out.println("Por favor, ingrese el digito " + contador);
                        arregloContadorPoNe[i] = entrada01.nextInt();

                        if (arregloContadorPoNe[i] < 0){
                            arregloPositivos[P] = arregloContadorPoNe[i];
                            P++;
                        }

                        else{
                            arregloNegativos[N] = arregloContadorPoNe[i];
                            N++;
                        }

                    }
                    
                   


              }



            Arreglos llamadaMetodo = new Arreglos(); NO ENTIENDO CUANDO OCUPAR VOID, INT, ETC. (CUANDO SI O NO EL METODO RETORNA UNA PARAMETRO)... :(   */


            switch (opcionDePrograma){
                case 1:
                    do{

                        //llamadaMetodo.contadorPositivosNegativos(); 


                         finalizarProgramaSecundario = false; 
                         delimitacionDeRespuesta = false;
                         opcionDePrograma = 0;
                         decisionFinal = "";

                         longitudArreglo = 0;
                         contador = 1;
                         P = 0;
                         N = 0;
                         P2 = 0;
                         N2 = 0;
                         



                        System.out.println("Cuantos Numeros desea Analizar (Contar Positivos y Negativos)?");
                        longitudArreglo = entrada01.nextInt();
                        System.out.println("");

                        int arregloContadorPoNe[] = new int[longitudArreglo];
                        int arregloPositivos[] = new int[longitudArreglo];
                        int arregloNegativos[] = new int[longitudArreglo];


                        for (int i = 0; i < longitudArreglo; i++){ 


                            
                            System.out.println("Por favor, ingrese el digito " + contador);
                            arregloContadorPoNe[i] = entrada01.nextInt();
                            System.out.println("");

                            while (arregloContadorPoNe[i] == 0){
                                System.out.println("Debe ingresar un digito diferente a cero, ya que este, es una cantidad nula (sin valor positivo o negativo)");
                                arregloContadorPoNe[i] = entrada01.nextInt();
                            }

                            if (arregloContadorPoNe[i] > 0){
                                arregloPositivos[P] = arregloContadorPoNe[i];
                                P++;
                            }

                            else{
                                arregloNegativos[N] = arregloContadorPoNe[i];
                                N++;
                            }

                            contador++;
                        }

                        
                        
                        

                       

                        System.out.println("El total de numeros positivos ingresados son: " + P);
                        System.out.println("Los numeros positivos ingresados son: ");
                        
                        for (int i = 0; i < P; i++){
                            System.out.println(arregloPositivos[P2]);
                            P2++;
                        }

                        
                        System.out.println("");


                        System.out.println("El total de numeros negativos ingresados son: " + N);
                        System.out.println("Los numeros negativos ingresados son: ");

                        for (int i = 0; i < N; i++){
                            System.out.println(arregloNegativos[N2]);
                            N2++;
                        }
        
                        System.out.println("");

                            System.out.println("Desea repetir el programa? Presione R para Repetirlo; M para regresar al Menu; o S para salir");
                                decisionFinal = entradaAB.nextLine();
                                System.out.println("");
                                do{
                                    if (decisionFinal.equalsIgnoreCase("S")){
                                        finalizarProgramaPrincipal = true;
                                        finalizarProgramaSecundario = true;
                                        delimitacionDeRespuesta = true;
                                    }
                                    else{
                                            if (decisionFinal.equalsIgnoreCase("M")){
                                                finalizarProgramaSecundario = true;
                                                delimitacionDeRespuesta = true;
                                            }
                                            else{  
                                                    if (decisionFinal.equalsIgnoreCase("R")){
                                                        delimitacionDeRespuesta = true;
                                                    
                                                    }
                                                    else{
                                                            System.out.println("El caracter introducido no corresponde a ningun proceso. Por favor, ingreselo nuevamente");
                                                            decisionFinal = entradaAB.nextLine();
                                                            System.out.println("");
                                                        }
                                                }
                                        }      
                                }while(delimitacionDeRespuesta == false);


                    }while(finalizarProgramaSecundario == false);
                    break;

                case 2:
                    do{
                         finalizarProgramaSecundario = false; 
                         delimitacionDeRespuesta = false;
                         opcionDePrograma = 0;
                         decisionFinal = "";

                         longitudArreglo2 = 0;
                         sumaDePares = 0;
                         promedio = 0;


                        System.out.println("Cuantos Numeros desea Analizar (promedio de la suma de los numeros en posiciones pares)?");
                        longitudArreglo2 = entrada01.nextInt();
                        System.out.println("");

                        int arregloContadorProPares[] = new int[longitudArreglo2];


                            for (int i = 0; i < longitudArreglo2; i++){ 
    
                                System.out.println("Por favor, ingrese el digito " + contador);
                                arregloContadorProPares[i] = entrada01.nextInt();
                           

                                if (i == 0 || i % 2 == 0){
                                    sumaDePares += arregloContadorProPares[i];
                                    System. out.println("Este valor esta dentro de posicion par");
                                    System.out.println("");
                                    System.out.println("");
                                    System.out.println("");
                                }
                                    else{
                                        System. out.println("Este valor No esta dentro de posicion par");
                                        System.out.println("");
                                        System.out.println("");
                                        System.out.println("");
                                    }

                                


                                contador++;



                            }

                            promedio = sumaDePares / longitudArreglo2;


                            System.out.println("La suma de los valores dentro de las posiciones pares, de los " + longitudArreglo2 + " digitos introducidos es:  " + sumaDePares);
                            System.out.println("El promedio de la suma de los valores en las posiciones pares, es: " + promedio);
                            System.out.println("");


                        

                            System.out.println("Desea repetir el programa? Presione R para Repetirlo; M para regresar al Menu; o S para salir");
                                decisionFinal = entradaAB.nextLine();
                                System.out.println("");
                                do{
                                    if (decisionFinal.equalsIgnoreCase("S")){
                                        finalizarProgramaPrincipal = true;
                                        finalizarProgramaSecundario = true;
                                        delimitacionDeRespuesta = true;
                                    }
                                    else{
                                            if (decisionFinal.equalsIgnoreCase("M")){
                                                finalizarProgramaSecundario = true;
                                                delimitacionDeRespuesta = true;
                                            }
                                            else{  
                                                    if (decisionFinal.equalsIgnoreCase("R")){
                                                        delimitacionDeRespuesta = true;
                                                    
                                                    }
                                                    else{
                                                            System.out.println("El caracter introducido no corresponde a ningun proceso. Por favor, ingreselo nuevamente");
                                                            decisionFinal = entradaAB.nextLine();
                                                            System.out.println("");
                                                        }
                                                }
                                        }      
                                }while(delimitacionDeRespuesta == false);
    
    
                        
                    }while(finalizarProgramaSecundario == false);
                    break;

                case 3:

                    do{
                        
                        finalizarProgramaSecundario = false; 
                        delimitacionDeRespuesta = false;
                        opcionDePrograma = 0;
                        decision = "";

                        longitudArreglo3 = 0;
                        opcionDeProgramaSecundario = 0;
                        burbuja = 0;
            
                        /*Realice un programa que permita leer 10 calificaciones de una asignatura y 
                        los guarde en un array para que muestre: Imprimir todas las calificaciones. 
                        Promedio de las calificaciones. La calificación más alta y la más baja. 
                        El número de calificaciones superiores al promedio. La cantidad de alumnos aprobados y reprobados*/

                        System.out.println("Cuantas calificaciones desea introducir?");
                        longitudArreglo3 = entrada01.nextInt();
                        System.out.println("");

                        int arregloCalificaciones[] = new int[longitudArreglo3];

                            for (int i = 0; i < longitudArreglo3; i++){ 
    
                                System.out.println("Por favor, ingrese la calificacion " + contador);
                                arregloCalificaciones[i] = entrada01.nextInt();
                                System.out.println("");
                                contador++;
                           
                            }

                            do{
                                opcionDeProgramaSecundario = 0;
                                delimitacionDeRespuesta2 = false;
                                finalizarProgramaTerciario = false;

                                decision = "";
                                longitudArreglo3 = 0;
                                burbuja = 0;

                                sumaCalificaciones = 0;
                                promedioCalificaciones = 0;
                                contadorCalifSupePro = 0;
                                contadorCalifInfePro = 0;
                                calificacionesAprobadas = 0;
                                calificacionesReprobadas = 0;


                                System.out.println("");
                                System.out.println("Que desea hacer con las calificaciones introducidas?");
                                System.out.println("1.- Ver todas las calificaciones");
                                System.out.println("2.- Calcular Promedio de calificaciones");
                                System.out.println("3.- Ver la calificacian mas alta, y la mas baja");
                                System.out.println("4.- Ver el numero de calificaciones superiores al promedio");
                                System.out.println("5.- Ver la cantidad de alumnos reprobados y aprobados");
                                System.out.println("Para hacer Todas las acciones, introduce el digito 10");
                                System.out.println("");
                                opcionDeProgramaSecundario = entrada01.nextInt();
                                System.out.println("");

                                    switch(opcionDeProgramaSecundario){
                                        case 1:
                                            System.out.println("Las " + longitudArreglo3 + " calificaciones ingresadas son: ");
                                
                                            for (int i = 0; i < longitudArreglo3; i++){
                                                System.out.println(arregloCalificaciones[i]);
                                            }

                                            System.out.println("");

                                            break;

                                        case 2: 
                                            for(int i = 0; i < longitudArreglo3; i++ ){
                                                sumaCalificaciones += arregloCalificaciones[i];
                                            }

                                            promedioCalificaciones = sumaCalificaciones / longitudArreglo3;

                                            System.out.println("El promedio de las " + longitudArreglo3 + " calificaciones, es: " + promedioCalificaciones);
                                            System.out.println("");

                                            break;
                                    
                           

                                        case 3:

                                            System.out.println("Las calificaciones introducidas, ordenadas descendentemente (de mayor a menor) son: ");
                                                
                                            for (int j = 0; j < longitudArreglo3; j++){
                                                for (int i = 0; i < longitudArreglo3 - 1; i++){
                                                    if (arregloCalificaciones[i] < arregloCalificaciones [i + 1]){
                                                        burbuja = arregloCalificaciones[i];
                                                        arregloCalificaciones [i] = arregloCalificaciones[i + 1];
                                                        arregloCalificaciones [i + 1] = burbuja;
                                                    }
                                                }
                                            }

                                            for (int i = 0; i < longitudArreglo3; i++){
                                                System.out.println(arregloCalificaciones[i]);
                                            }

                                            System.out.println("");
                                            
                                            System.out.println("La calificacion mas alta es: " + arregloCalificaciones[0]);
                                            System.out.println("La calificacion mas baja es: " + arregloCalificaciones[longitudArreglo3 - 1]);
                                            System.out.println("");

                                            break;

                                        case 4:
                                            
                                        for (int i = 0; i < longitudArreglo3; i++){

                                            if(arregloCalificaciones[i] >= promedioCalificaciones){
                                                contadorCalifSupePro += 1;
                                            }
                                            else{
                                                contadorCalifInfePro += 1;
                                            }

                                        }

                                            System.out.println("El total de calificaciones Iguales o Superiores al Promedio (" + promedioCalificaciones + ") es: " + contadorCalifSupePro); 
                                            System.out.println("El total de calificaciones Inferiores al Promedio (" + promedioCalificaciones + ") es: " + contadorCalifInfePro);
                                            System.out.println("");

                                            break;

                                        case 5:
                                                    
                                            for (int i = 0; i < longitudArreglo3; i++){

                                                if(arregloCalificaciones[i] >= 6){
                                                    calificacionesAprobadas += 1;
                                                }
                                                else{
                                                    calificacionesReprobadas += 1;
                                                }

                                            }

                                                System.out.println("El total de calificaciones aprobatorias es: " + calificacionesAprobadas); 
                                                System.out.println("El total de calificaciones reprobatorias es: " + calificacionesReprobadas);
                                                System.out.println("");


                                            break;

                                        case 10: 
                                            //METODO 1
                                            System.out.println("Las " + longitudArreglo3 + " calificaciones ingresadas son: ");
                                
                                            for (int i = 0; i < longitudArreglo3; i++){
                                                System.out.println(arregloCalificaciones[i]);
                                            }
                                            System.out.println("");





                                            System.out.println("");
                                            System.out.println("");





                                            //METODO 2
                                            for(int i = 0; i < longitudArreglo3; i++ ){
                                                sumaCalificaciones += arregloCalificaciones[i];
                                            }

                                            promedioCalificaciones = sumaCalificaciones / longitudArreglo3;

                                            System.out.println("El promedio de las " + longitudArreglo3 + " calificaciones, es: " + promedioCalificaciones);
                                            System.out.println("");
                                    




                                            System.out.println("");
                                            System.out.println("");




                                            //METODO 3                                        
                                            System.out.println("Las calificaciones introducidas, ordenadas descendentemente (de mayor a menor) son: ");
                                                
                                            for (int j = 0; j < longitudArreglo3; j++){
                                                for (int i = 0; i < longitudArreglo3 - 1; i++){
                                                    if (arregloCalificaciones[i] < arregloCalificaciones [i + 1]){
                                                        burbuja = arregloCalificaciones[i];
                                                        arregloCalificaciones [i] = arregloCalificaciones[i + 1];
                                                        arregloCalificaciones [i + 1] = burbuja;
                                                    }
                                                }
                                            }

                                            for (int i = 0; i < longitudArreglo3; i++){
                                                System.out.println(arregloCalificaciones[i]);
                                            }
                                            System.out.println("");
                                            
                                            System.out.println("La calificacion mas alta es: " + arregloCalificaciones[0]);
                                            System.out.println("La calificacion mas baja es: " + arregloCalificaciones[longitudArreglo3 - 1]);
                                            System.out.println("");




                                            System.out.println("");
                                            System.out.println("");




                                            //METODO 4
                                            for (int i = 0; i < longitudArreglo3; i++){

                                                if(arregloCalificaciones[i] >= promedioCalificaciones){
                                                    contadorCalifSupePro += 1;
                                                }
                                                else{
                                                    contadorCalifInfePro += 1;
                                                }
    
                                            }
    
                                                System.out.println("El total de calificaciones Iguales o Superiores al Promedio (" + promedioCalificaciones + ") es: " + contadorCalifSupePro); 
                                                System.out.println("El total de calificaciones Inferiores al Promedio (" + promedioCalificaciones + ") es: " + contadorCalifInfePro);
                                                System.out.println("");



                                                System.out.println("");
                                                System.out.println("");




                                            //METODO 5
                                            for (int i = 0; i < longitudArreglo3; i++){

                                                if(arregloCalificaciones[i] >= 6){
                                                    calificacionesAprobadas += 1;
                                                }
                                                else{
                                                    calificacionesReprobadas += 1;
                                                }

                                            }

                                                System.out.println("El total de calificaciones aprobatorias es: " + calificacionesAprobadas); 
                                                System.out.println("El total de calificaciones reprobatorias es: " + calificacionesReprobadas);
                                                System.out.println("");


                                                System.out.println("");
                                                System.out.println("");

                                            break;

                                    }

                            
                                    System.out.println("Desea consultar algo mas de las calificaciones previamente introducidas? Por favor, ingrese SI o NO");
                                    decision = entradaAB.nextLine();
                                    System.out.println("");
                                    do{
                                        if (decision.equalsIgnoreCase("SI")){
                                            delimitacionDeRespuesta2 = true;
                                        }
                                        else{
                                                if (decision.equalsIgnoreCase("NO")){
                                                    finalizarProgramaTerciario = true;
                                                    delimitacionDeRespuesta2 = true;
                                                }    
                                                else{
                                                    System.out.println("El caracter introducido no corresponde a ningun proceso. Por favor, ingrese SI (para visualizar otro dato de las calificaciones) o NO (para repetir programa, regresar al menu o salir)");
                                                    decision = entradaAB.nextLine();
                                                    System.out.println("");
                                                            
                                                }
                                            }      
                                    }while(delimitacionDeRespuesta2 == false);
                       
                            }while(finalizarProgramaTerciario == false);



                            System.out.println("Desea repetir el programa? Presione R para Repetirlo; M para regresar al Menu; o S para salir");
                                decisionFinal = entradaAB.nextLine();
                                System.out.println("");
                                do{
                                    if (decisionFinal.equalsIgnoreCase("S")){
                                        finalizarProgramaPrincipal = true;
                                        finalizarProgramaSecundario = true;
                                        delimitacionDeRespuesta = true;
                                    }
                                    else{
                                            if (decisionFinal.equalsIgnoreCase("M")){
                                                finalizarProgramaSecundario = true;
                                                delimitacionDeRespuesta = true;
                                            }
                                            else{  
                                                    if (decisionFinal.equalsIgnoreCase("R")){
                                                        delimitacionDeRespuesta = true;
                                                    
                                                    }
                                                    else{
                                                            System.out.println("El caracter introducido no corresponde a ningun proceso. Por favor, ingreselo nuevamente");
                                                            decisionFinal = entradaAB.nextLine();
                                                            System.out.println("");
                                                        }
                                                }
                                        }      
                                }while(delimitacionDeRespuesta == false);


                
                    }while(finalizarProgramaSecundario == false);
                    break;

                case 4: 
                    do{
                            finalizarProgramaSecundario = false; 
                            delimitacionDeRespuesta = false;
                            opcionDePrograma = 0;
                            decisionFinal = "";
                            
                            contador2 = 1;

                            System.out.println("Cuantos valores desea almacenar en la matriz o arreglo A y B?");
                            longitudArreglo4 = entrada01.nextInt();
                            System.out.println("");  

                            int arregloMatrizA[] = new int[longitudArreglo4];
                            int arregloMatrizB[] = new int[longitudArreglo4];
                            int arregloMatrizC[] = new int[longitudArreglo4];


                                for (int i = 0; i < longitudArreglo4; i++){ 
        
                                    System.out.println("Por favor, ingrese el valor " + contador2 + " de la matriz A");
                                    arregloMatrizA[i] = entrada01.nextInt();
                                    System.out.println("");    

                                    contador2++;
                                }   

                            System.out.println("");    
                            System.out.println("");    
                            contador2 = 1;

                                for (int i = 0; i < longitudArreglo4; i++){ 
        
                                    System.out.println("Por favor, ingrese el valor " + contador2 + " de la matriz B");
                                    arregloMatrizB[i] = entrada01.nextInt();
                                    System.out.println("");    

                                    contador2++;
                                }   



                            for (int i = 0; i < longitudArreglo4; i++){
                                arregloMatrizC[i] = arregloMatrizA[i] + arregloMatrizB[i];
                            }

                            System.out.println("Los valores resultantes de la suma de la matriz A y B, son: ");
                                
                                for (int i = 0; i < longitudArreglo4; i++){
                                    System.out.println(arregloMatrizC[i]);
                                    SumaMatrizC += arregloMatrizC[i];
                                }

                            System.out.println("");  

                            System.out.println("La suma total de los valores en la Matriz C, son: " + SumaMatrizC);  
                            System.out.println("");  
                        

                            System.out.println("Desea repetir el programa? Presione R para Repetirlo; M para regresar al Menu; o S para salir");
                                decisionFinal = entradaAB.nextLine();
                                System.out.println("");
                                do{
                                    if (decisionFinal.equalsIgnoreCase("S")){
                                        finalizarProgramaPrincipal = true;
                                        finalizarProgramaSecundario = true;
                                        delimitacionDeRespuesta = true;
                                    }
                                    else{
                                            if (decisionFinal.equalsIgnoreCase("M")){
                                                finalizarProgramaSecundario = true;
                                                delimitacionDeRespuesta = true;
                                            }
                                            else{  
                                                    if (decisionFinal.equalsIgnoreCase("R")){
                                                        delimitacionDeRespuesta = true;
                                                    
                                                    }
                                                    else{
                                                            System.out.println("El caracter introducido no corresponde a ningun proceso. Por favor, ingreselo nuevamente");
                                                            decisionFinal = entradaAB.nextLine();
                                                            System.out.println("");
                                                        }
                                                }
                                        }      
                                }while(delimitacionDeRespuesta == false);


                        
                    }while(finalizarProgramaSecundario == false);
                    break;
            }



















        }while (finalizarProgramaPrincipal == false);    
    }
}

    