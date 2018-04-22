import java.util.*;

class Solution {

    private static Map<Integer, ArrayList<String>> createMap(){
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
            if (i < (nrOfPairs / 2)) {
                list.add("-");
            } else list.add(s);
        }
        in.close();
        return mapOfInput;
    }

    public static void main(String[] args) {
        Map<Integer, ArrayList<String>> map = createMap();
        Iterator<Map.Entry<Integer, ArrayList<String>>> entries = map.entrySet().iterator();
        StringBuilder resultString = new StringBuilder();
        while (entries.hasNext()) {
            Map.Entry<Integer, ArrayList<String>> entry = entries.next();
            ArrayList<String> value = entry.getValue();
            for (String listEntry: value) {
                resultString.append(listEntry).append(" ");
            }
        }
        String end = resultString.toString().trim();
        System.out.println(end);
    }
}