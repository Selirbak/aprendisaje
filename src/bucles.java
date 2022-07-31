public class bucles {


    public void metodoFor(int numero1, int numero2) {
        System.out.println(" ******* SE INICIA CICLO FOR *******");
        int resultado = 0;
        operaciones operaciones = new operaciones();
        for (int i = 0; i < numero2; i++) {
            resultado = operaciones.suma(numero1, resultado);
            System.out.println(" el valor de la vuelta " + i + " es: " + resultado);
        }

        System.out.println("el resultado de la suma de numero " + numero1 + " por numero de veces de numero " + numero2 + " es " + resultado);

    }

    public void metodoWhile(int numero1, int numero2) {
        System.out.println(" ******* SE INICIA CICLO WHILE *******");
        int resultado = 0;
        int i = 0;
        operaciones operaciones = new operaciones();
        while (i < numero2) {
            resultado = operaciones.suma(numero1, resultado);
            System.out.println(" el valor de la vuelta " + i + " es: " + resultado);
            i = i + 1;
        }
        System.out.println("el resultado de la suma de numero " + numero1 + " por numero de veces de numero " + numero2 + " es " + resultado);

    }

    public void methodoDoWhile(int numero1 , int numero2){
        System.out.println(" ******* SE INICIA CICLO DO- WHILE *******");
        int i = 0;
        int resultado = 0;
        operaciones operaciones = new operaciones();
        do {
            resultado = operaciones.suma(numero1, resultado);

            System.out.println("el valor de la vuelta " + i + " es " + resultado);
            i = i + 1;
        } while (i < numero2);
        System.out.println("el resultado de la suma de numero " + numero1 + " por numero de veces de numero " + numero2 + " es " + resultado);
    }

}
