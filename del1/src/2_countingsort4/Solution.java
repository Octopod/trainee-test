import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static Map createMap(){
        Map<Integer, ArrayList<String>> mapOfInput = new HashMap<>(100);

        for (int i = 0; i < 100; i++) {
            mapOfInput.put(i, new ArrayList<String>());
        }

        Scanner in = new Scanner(System.in);
        int nrOfPairs = in.nextInt();
        for (int i=0; i<nrOfPairs; i++){
            int x = in.nextInt();
            String s = in.next();

            ArrayList<String> list = mapOfInput.get(x);
            list.add(s);
        }
        in.close();
        return mapOfInput;
    }

    public static void main(String[] args) {
        Map map = createMap();


    }
}
