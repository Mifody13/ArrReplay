import java.util.Arrays;
import java.util.Scanner;

public class arrReplace {
    public static void main(String[] args) throws Exception {
        System.out.println("Количество элементов массива");
        Scanner userInput = new Scanner(System.in);
        int arrLength = userInput.nextInt();
        System.out.println("С какого элемента поменять");
        Scanner userInput2 = new Scanner(System.in);
        int arrPlace = userInput2.nextInt();
        int[] array = new int[arrLength];
        for (int fill = 0; fill < array.length; fill++) {
            array[fill] = fill;
        }
        System.out.println(Arrays.toString(arrReplace(array, arrPlace)));
    }

    public static int[] arrReplace(int[] arr, int arrPlace) throws Exception {
        if (arrPlace > arr.length) {
            throw new Exception("Введено число больше длинны массива");
        } else if (arrPlace < 0) {
            throw new Exception("Введено число меньше 0!!");
        }
        int sourceLength = (arrPlace - 1) / 2;
        System.out.println(sourceLength);
        int change = 0;

        for (int i = 0; i < sourceLength; i++) {
            change = arr[arrPlace - 1 - i];
            arr[arrPlace - 1 - i] = arr[i];
            arr[i] = change;
        }
        sourceLength = ((arr.length - arrPlace) / 2) + arrPlace;

        for (int j = arrPlace; j < sourceLength; j++) {
            change = arr[arr.length - 1 - j + arrPlace];
            arr[arr.length - 1 - j + arrPlace] = arr[j];
            arr[j] = change;
        }
        for (int k = 0; k < ((arr.length / 2)); k++) {
            change = arr[arr.length - 1 - k];
            arr[arr.length - 1 - k] = arr[k];
            arr[k] = change;

        }
        return arr;
    }
}

