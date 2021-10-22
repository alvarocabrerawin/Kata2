package kata2;
import java.util.HashMap;
import java.util.Map;
public class Kata2 {
    public static void main(String[] args) {
        Integer data [] = {8, 5, 4, 2, 16, 3, 27, 5, 7, 7, 9, 1, 4, 8, 2, 6};
        Histogram histo = new Histogram(data);
        Map<Integer,Integer> histogr = histo.getHistogram();
        
        for (Map.Entry<Integer,Integer> entry : histogr.entrySet()) {
            System.out.println(entry.getKey() + " ==> " + histogr.get(entry.getKey()));
        }
    }
    
}
        
        
       
    

