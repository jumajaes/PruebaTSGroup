public class App2 {

    //Dato un arreglo de enteros, encuentre la longitud del mayor subarreglo el cual
    //contiene números que pueden ser organizados en una secuencia.

    public static void main(String[] args) throws Exception {
        int array[] = { 1, 56, 58, 57, 90, 92, 94, 93, 91, 45 };
        int cuenta = 1;
        int mayor = 1;
        int aux;

        for (int i = 0; i <= array.length - 1; i++) {
            aux = array[i];
            for (int j = 0; j <= array.length - 1; j++) {
                if (array[j] == aux + 1) {
                    cuenta++;
                    aux = array[j];
                    j = 0;
                }
            }
            if (cuenta > mayor) {
                mayor = cuenta;
            }

            cuenta = 1;
        }

        System.out.println("longitud mas larga es: " + mayor);

    }
}