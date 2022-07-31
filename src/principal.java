import java.util.Scanner;

public class principal {

    public static void main(String[] args) {
        /*TODO ENUNCIADO
        1. ingrese un numero __2__
        2. ingrese un numero __3__
        3. resultadoSuma= 2+2+2 = 6
        */

        //DESARROLLO
        operaciones operaciones = new operaciones();
        int numero1 = ingreseUnNumero();
        int numero2 = ingreseUnNumero();


        //CICLO FOR

        bucles claseBucles = new bucles();
        claseBucles.metodoFor(numero1, numero2);

        //CICLO WHILE
        claseBucles.metodoWhile(numero1 , numero2);




        /*System.out.println(" ******* SE INICIA CICLO WHILE *******");
        resultado = 0;
        int i = 0;
        while (i < numero2) {
            resultado = operaciones.suma(numero1, resultado);
            System.out.println(" el valor de la vuelta " + i + " es: " + resultado);
            i = i + 1;
        }*/


        //CICLO DO - WHILE

        claseBucles.methodoDoWhile(numero1 , numero2);


/*


        System.out.println(" ******* SE INICIA CICLO DO - WHILE *******");
        int i = 0;
        resultado = 0;
        do {
            resultado = operaciones.suma(numero1, resultado);

            System.out.println("el valor de la vuelta " + i + " es " + resultado);
            i = i + 1;
        } while (i < numero2);
        */


    }

    public static void ejemploOperaciones() {
        try {
            operaciones operaciones = new operaciones();

            int numeroEntero1 = ingreseUnNumero();

            int numeroEntero2 = ingreseUnNumero();

            int resultadoSuma = operaciones.suma(numeroEntero1, numeroEntero2);

            System.out.println(" la suma de ambos es: " + resultadoSuma);

            int numeroEntero3 = ingreseUnNumero();

            int resultadoMultiplicacion = operaciones.multip(resultadoSuma, numeroEntero3);

            System.out.println("El Resultado de multiplicar entre ambos es: " + resultadoMultiplicacion);

            double resultadoDiv = operaciones.divis(resultadoSuma, numeroEntero3);

            System.out.println("Si dividimos este con el con el ultimo numero ingresado será: " + resultadoDiv);

        } catch (Exception exception) {
            System.out.println("numero ingresado no es correcto");
        }

    }


    public static void ejemploMascota() {
        System.out.println("cual es el nombre de tu mascota?");
        String nombreMascota;
        String color;
        String tipo;
        Scanner scanner = new Scanner(System.in);
        nombreMascota = scanner.nextLine();
        System.out.println("mandale saludos a " + nombreMascota);
        System.out.println(" dime que tipo de mascota es " + nombreMascota + "?");
        tipo = scanner.nextLine();
        System.out.println("y de que color es " + nombreMascota);
        color = scanner.nextLine();
        System.out.println("que lindo es  " + tipo + " de color " + color);
    }


    public static int ingreseUnNumero() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor ingrese un numero: ");
        return scanner.nextInt();
    }

}

