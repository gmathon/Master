import java.util.Arrays;

public class arraysum {

    public static void main(String[] args) {
        int array[] = new int[]{3, 20, 10, 4, 1, 2, 39, 40, 12, 15, 16, 80, 15, 19, 22, -10};

        //sorting array
        Arrays.sort(array);
        int len = array.length;
        int i;
        int j;
        int s;
        int sum = 30;

        // 2 pointers on sorted array i starting from left and j starting from right until i<j
        for (i = 0, j = len - 1; i < j; ) {

            //add number at index i and j
            s = array[i] + array[j];
            
            //if numbers equal the number required then print out
            if (s == sum) {
                System.out.println(array[i] + " plus " + array[j] + " = " + sum);

                //post increment i and post decrement
                i++;
                j--;
            } else if (s < sum)
                i = i + 1;
            else j = j - 1;

        }
    }
}





