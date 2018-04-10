public class Duplicateelements {
    public static void main(String[] args) {

        //elements in string
        String input = "Java J2EE Java JSP J2EE";

        //turn string into char array
        char[] ch = input.toCharArray();
        int chlen = ch.length;
        int i = 0, j = 0, counter = 0;


        for (i = 0; i < chlen; ++i) {
            counter = 0;
            for (j = 0; j < chlen; ++j) {

                //if j is smaller then i then we should stop process
                if (j < i && ch[i] == ch[j]) {
                    break;
                }
                if (ch[j] == ch[i]) {
                    counter++;
                }

                //once j finishes transversal we need to output answer
                if (j == chlen - 1) {

                    System.out.println("char is " + ch[i] + " = " + counter);
                } //end of j loop
            }//end of i loop
        }


        //notes for instructor
        //notes the output will include char is = 4, in java blank space in string is treated as character
        //the design question did not explain if we need to account for it



    }
}

