public class App {

    //Dado un conjunto de enteros no negativos y un valor llamado sum, cree una
    //rutina la cual determine si dentro del conjunto existe un subconjunto de números
    //cuya suma sea igual al valor dado en sum
    
    public static void main(String[] args) throws Exception {

        int array[] =   {3, 34, 4, 12, 5, 2};
        int sum = 9;
        int j = 0;

        for (int i = 0; i <= array.length - 1; i++) {
            System.out.println(i);
            j = i + 1;

            if (i != array.length - 1) {
                while (j <= array.length - 1) {

                    if ((array[i] + array[j]) == sum) {
                        System.out.println(
                                "True // el subconjunto (" + array[i] + ", " + array[j] + ") es igual a sum= " + sum);
                        i = array.length - 1;
                        j = array.length - 1;

                    }
                    j++;
                }
            }

        }

    }
}
