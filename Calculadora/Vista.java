//clase vista menu
public class Vista {

    public void escribirNumero(){
        System.out.println("Escriba un entero: ");
        
    }

    public void escribirSalidaS(Numero resultado1){
        System.out.println("la suma es: " + resultado1.getNumero());
    }   

    public void escribirSalidaR(Numero resultado1){
        System.out.println("la resta es: " + resultado1.getNumero());
    }

    public void escribirSalidaM(Numero resultado1){
    System.out.println("la multiplicación es: " + resultado1.getNumero());
    }

    public void mostrarMenu(){
        System.out.println("\n--- Menu de Suma ---");
        System.out.println("1. Realizar una suma");
        System.out.println("2: Realizar una resta");
        System.out.println("3. realizar una multiplicación");
        System.out.println("4. Salir");
        System.out.print("Seleccione una opcion: ");
    }
    
    public void salirPrograma(){
        System.out.println("Saliendo del programa...");
    }

    public void mostrarDefault(){
        System.out.println("Opcion no valida. Por Favor, intente de nuevo. Solo de 1 a 4");
    }
}


