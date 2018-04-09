import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);


            String str = s.nextLine();
            Scanner s1 = new Scanner(str);
            List<Integer> spaces = new ArrayList<Integer>();
            int wc = 0;
            int last = 0;
            StringBuilder sb = new StringBuilder();
            while(s1.hasNext()){
                String _str = s1.next();
                if(s1.hasNext()){
                    last += _str.length() + wc;
                    wc = (wc == 0) ? wc+1 : wc;
                    spaces.add(last);
                }
                sb.append(_str);
            }
            sb.reverse();
            for(int i:spaces){
                sb.insert(i, " ");
            }
            System.out.println(sb.toString());

    }
}

