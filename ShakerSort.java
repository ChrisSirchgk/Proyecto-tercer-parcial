import java.util.Arrays;

public class ShakerSort {

    public static void shakerSort(int[] arreglo) {

        int inicio = 0;
        int fin = arreglo.length - 1;
        boolean intercambio = true;

        while (inicio < fin && intercambio) {

            intercambio = false;

            // Recorrido de izquierda a derecha
            for (int i = inicio; i < fin; i++) {

                if (arreglo[i] > arreglo[i + 1]) {

                    int temporal = arreglo[i];
                    arreglo[i] = arreglo[i + 1];
                    arreglo[i + 1] = temporal;

                    intercambio = true;
                }
            }

            fin--;

            // Recorrido de derecha a izquierda
            for (int i = fin; i > inicio; i--) {

                if (arreglo[i - 1] > arreglo[i]) {

                    int temporal = arreglo[i - 1];
                    arreglo[i - 1] = arreglo[i];
                    arreglo[i] = temporal;

                    intercambio = true;
                }
            }

            inicio++;
        }
    }

    public static void main(String[] args) {

        int[] arreglo = {7, 3, 9, 2, 6, 1};

        System.out.println("Antes:");
        System.out.println(Arrays.toString(arreglo));

        shakerSort(arreglo);

        System.out.println("Después:");
        System.out.println(Arrays.toString(arreglo));
    }
}