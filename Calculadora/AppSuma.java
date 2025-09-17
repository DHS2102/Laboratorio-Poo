//AppSuma
import java.util.Scanner;

public class AppSuma{
  public static <Multiplicación> void main(String[] args) throws Exception {
    Scanner teclado = new Scanner(System.in);
    Vista vista = new Vista();
    int opcion = 0;


    do { 
      vista.mostrarMenu();
      try{
      opcion = teclado.nextInt();

      switch (opcion){
      case 1:
        vista.escribirNumero();
        int n1 = teclado.nextInt();
        vista.escribirNumero();
        int n2 = teclado.nextInt();


        Numero numero1 = new Numero(n1);
        Numero numero2 = new Numero(n2);

        Suma suma = new Suma(numero1, numero2);
        Numero resulta = suma.calcular();

        vista.escribirSalidaS(resulta);
        break;

      case 2:
        vista.escribirNumero();
        n1 = teclado.nextInt();
        vista.escribirNumero();
        n2 = teclado.nextInt();


        numero1 = new Numero(n1);
        numero2 = new Numero(n2);

        Resta resta= new Resta(numero1, numero2);
        resulta = resta.calcular();

        vista.escribirSalidaR(resulta);
        break;

      case 3:
        vista.escribirNumero();
        n1 = teclado.nextInt();
        vista.escribirNumero();
        n2 = teclado.nextInt();


        numero1 = new Numero(n1);
        numero2 = new Numero(n2);

        Multiplicacion multiplicacion= new Multiplicacion(numero1, numero2);
        resulta = multiplicacion.calcular();

        vista.escribirSalidaM(resulta); 
        break;
      case 4:

        vista.salirPrograma();

      default:
      vista.mostrarDefault();
        break;

      }
    


    } catch (java.util.InputMismatchException e){
        System.out.println("Error: la entrada NO es un numero entero. por favor, intente de nuevo");
        teclado.nextLine();
      }
  
    
    }while (opcion !=4);

  

    
    teclado.close();
}

}
