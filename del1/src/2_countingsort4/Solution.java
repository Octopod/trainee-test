import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static Map createMap(){
        Map<Integer, ArrayList<String>> mapOfInput = new HashMap<>(100);

        Scanner in = new Scanner(System.in);
        int nrOfPairs = in.nextInt();
        for (int i=0; i<nrOfPairs; i++){
            int x = in.nextInt();
            String s = in.next();

            ArrayList<String> list = mapOfInput.get(x);
            if (list == null){
                mapOfInput.put(x, new ArrayList<>());
                list = mapOfInput.get(x);
            }
            if (i<(nrOfPairs/2)){
                list.add("-");
            }else
                list.add(s);
        }
        in.close();
        return mapOfInput;
    }

    public static void main(String[] args) {
        Map map = createMap();
        Iterator entries = map.entrySet().iterator();
        StringBuilder resultString = new StringBuilder();
        while (entries.hasNext()) {
            Map.Entry entry = (Map.Entry) entries.next();
            ArrayList<String> value = (ArrayList<String>)entry.getValue();
            for (String listEntry: value) {
                resultString.append(listEntry + " ");
            }
        }
        String end = resultString.toString().trim();
        System.out.println(end);
    }
}
