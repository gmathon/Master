public class reversestring {
    public static void main(String[] args) {


//        comment and uncomment test cases

//      String in = "I Am Not String";
//      String in = "JAVA JSP ANDROID";
        String in = "1 22 333 4444 55555";


        //check the length of the intial string
        int l = in.length();

        // create character array "arr" and split up the string into a total array size "l"
        char ans[] = in.toCharArray();

        // have two pointers from each direction of array, i starting from 0 and j starting at L- 1
        // the points will move towards reach other until they overlap and loop will end
        for (int i = 0, j = l - 1; i <= j; i++, j--) {
            //i and j will check if it contains a space and if it does, it will move to next position
            if (ans[i] == ' ') i++;
            if (ans[j] == ' ') j--;

            char end = ans[i];
            ans[i] = ans[j];
            ans[j] = end;

        }
        System.out.println(ans);
    }

}