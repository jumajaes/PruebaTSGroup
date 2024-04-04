public class App3 {

    // Dado un listado de números positivos encuentre el número mayor, número
    //menor y promedio de valores del listado

    public static void main(String[] args) throws Exception {
        int array[] =   {4, 7, 5, 9, 11};
        int men = array[0];
        int may = array[0];
        int promedio = 0;

        for(int i = 0; i <= array.length -1; i++){
           
            if (men>array[i]) {
                men = array[i];        
            }

            if (may<array[i]) {
                may = array[i];        
            }

            
            promedio = promedio + array[i];

        }
        
        promedio = promedio / (array.length); // si el promedio no da un resultado entero se retornara el valor entero mas cercano al resultado.
        
        System.out.println("El numero mayor es: " + may + " // El numero menor es: " + men + " // El promedio del arreglo es: " + promedio);
    }
}