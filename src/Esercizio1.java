import java.util.Random;
import java.util.Scanner;

public class Esercizio1 {
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

    }

    public static void main(String[] args) {
        int[] array = new int[5];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10) + 1;
        }

        System.out.println("Array iniziale: ");
        printArray(array);

        Scanner myScanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Seleziona posizione (0-4): ");
                int posizione = myScanner.nextInt();
                System.out.println("Seleziona numero (col numero 0 termina il programma): ");
                int numero = myScanner.nextInt();

                if (numero == 0) {
                    System.out.println("Programma terminato");
                    break;
                }
                array[posizione] = numero;
                System.out.println("Nuovo stato dell'array: ");
                printArray(array);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Errore: posizione non valida");
            } catch (Exception e) {
                System.out.println("Errore: input non valido");
                myScanner.next();
            }

        }
        myScanner.close();
    }
}
