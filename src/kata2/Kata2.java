package kata2;
import java.util.HashMap;
import java.util.Map;
public class Kata2 {
    public static void main(String[] args) {
        String[] data = new String[] {"Rosa", "Pepe", "Juan", "Pepe", "Pepe", "Rosa"};
        Histogram histo = new Histogram(data);
        Map<String,Integer> histogr = histo.getHistogram();
        
        for (Map.Entry<String,Integer> entry : histogr.entrySet()) {
            System.out.println(entry.getKey() + " ==> " + histogr.get(entry.getKey()));
        }
    }
    
}
        
        
       
    

