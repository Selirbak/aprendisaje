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
        int resultado = 0;

        //CICLO FOR
        System.out.println(" ******* SE INICIA CICLO FOR *******");
        for (int i = 0; i < numero2; i++) {
            resultado = operaciones.suma(numero1, resultado);
            System.out.println(" el valor de la vuelta " + i + " es: " + resultado);
        }
        System.out.println("el resultado de la suma de numero " + numero1 + " por numero de veces de numero " + numero2 + " es " + resultado);

        //CICLO WHILE
        System.out.println(" ******* SE INICIA CICLO WHILE *******");
        resultado = 0;
        int i = 0;
        while (i < numero2 )  {
            resultado = operaciones.suma(numero1, resultado);
            System.out.println(" el valor de la vuelta " + i+ " es: " + resultado);
            i = i+1;
        }



        //CICLO DO - WHILE
        System.out.println(" ******* SE INICIA CICLO DO - WHILE *******");


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

