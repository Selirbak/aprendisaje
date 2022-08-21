public class Bucles {

    private int resultado = 0;
    private Operaciones operaciones = new Operaciones();

    public void metodoFor(int numero1, int numero2) {
        System.out.println(" ******* SE INICIA CICLO FOR *******");
        for (int i = 0; i < numero2; i++) {
            resultado = operaciones.suma(numero1, resultado);
            System.out.println(Constantes.MSGE_VLOR_VUELTA + i + " es: " + resultado);
        }
        System.out.println(Constantes.MSGE_VLOR_SUMA + numero1 + Constantes.MSGE_NRO_VUELTAS + numero2 + " es " + resultado);
    }

    public void metodoWhile(int numero1, int numero2) {
        System.out.println(" ******* SE INICIA CICLO WHILE *******");
        int i = 0;
        while (i < numero2) {
            resultado = operaciones.suma(numero1, resultado);
            System.out.println(Constantes.MSGE_VLOR_VUELTA + i + " es: " + resultado);
            i = i + 1;
        }
        System.out.println(Constantes.MSGE_VLOR_SUMA + numero1 + Constantes.MSGE_NRO_VUELTAS + numero2 + " es " + resultado);
    }

    public void methodoDoWhile(int numero1, int numero2) {
        System.out.println(" ******* SE INICIA CICLO DO- WHILE *******");
        int i = 0;
        do {
            resultado = operaciones.suma(numero1, resultado);
            System.out.println(Constantes.MSGE_VLOR_VUELTA + i + " es " + resultado);
            i = i + 1;
        } while (i < numero2);
        System.out.println(Constantes.MSGE_VLOR_SUMA + numero1 + Constantes.MSGE_NRO_VUELTAS + numero2 + " es " + resultado);
    }

}

