package kata2;
import java.util.HashMap;
import java.util.Map;
public class Kata2 {
    public static void main(String[] args) {
        int data [] = {8, 5, 4, 2, 16, 3, 27, 5, 7, 7, 9, 1, 4, 8, 2, 6};
        HashMap<Integer, Integer> histogram = new HashMap<Integer, Integer>();
        for (int key : data) {
            histogram.put(key, histogram.containsKey(key) ? histogram.get(key) + 1 : 1);
        }
       for(Integer key : histogram.keySet()){

            System.out.println(key + "==>" + histogram.get(key));
        }
    }    
        }
        
        
       
    

