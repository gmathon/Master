public class reversestring {
    public static void main(String[] args) {

        String str = "java ja java jaaaa";


        //check the length of the intial string
        int len = str.length();

        // create character array "arr" and split up the string into a total array size "len"
        char arr[] = str.toCharArray();

        // have two pointers from each direction of array, i starting from 0 and j starting at len - 1
        //
        for (int i = 0, j = len - 1; i <= j; i++, j--) {
            if (arr[i] == ' ') i++;
            if (arr[j] == ' ') j--;

            char tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;

        }
        System.out.println(arr);
    }

}