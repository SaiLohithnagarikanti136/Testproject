package mazenet7;
import java.util.*;
import java.lang.*;
public class hashsort{
 
    
    public static HashMap<String, Integer> sortByValue(HashMap<String, Integer> hm)
    {
        
        List<Map.Entry<String, Integer> > list =
               new LinkedList<Map.Entry<String, Integer> >(hm.entrySet());
 
        
        Collections.sort(list, new Comparator<Map.Entry<String, Integer> >() {
            public int compare(Map.Entry<String, Integer> o1,
                               Map.Entry<String, Integer> o2)
            {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });
         
        
        HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }
 
    
    public static void main(String[] args)
    {
 
        HashMap<String, Integer> hashmapnew = new HashMap<String, Integer>();
 
     
        hashmapnew.put("lohith", 23);
        hashmapnew.put("aditya", 22);
        hashmapnew.put("varun", 25);
        hashmapnew.put("charan", 28);
        hashmapnew.put("harish", 27);
        Map<String, Integer> hm1 = sortByValue(hashmapnew);
 
 
        for (Map.Entry<String, Integer> en : hm1.entrySet()) {
            System.out.println("Key = " + en.getKey() +
                          ", Value = " + en.getValue());
        }
    }
}
