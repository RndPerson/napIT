import java.util.Arrays;
import java.util.Collections;

public class sort {

    public static void main (String [] args) {

        Integer arr[] = new Integer[10];
        Integer[] even = new Integer[5];
        Integer [] odd = new Integer[5];
        for(int i = 0; i <  arr.length; i++) {
            arr[i] =  (int)(Math.random() * 100);
            System.out.print(arr[i] + "  ");
        }

        int z = 0;
        int j = 0;
        for(int i = 0; i <  arr.length; i++) {
            if (arr[i] % 2==0)
            {even[z] = arr [i];
            z +=1;
            }
            else {
                odd[j] = arr[i];
                j += 1;
            }
        }

        System.out.print("\nSorted: \n");
//Сортируем массив
        Arrays.sort(even);
        Arrays.sort(odd, Collections.reverseOrder());
//Выводим отсортированный массив на консоль.
        for(int i = 0; i <  arr.length; i++) {
            System.out.print(even[i] + "  ");
        }
        for(int i = 0; i <  arr.length; i++) {
            System.out.print(odd[i] + "  ");
        }
    }
}
