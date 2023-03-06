import java.util.HashMap;
import java.util.Map;

public class ExMap {
    public static void main(String[] args) {
        ExMap m =new ExMap();
        Map<String,String> d =m.getAllGender();
        System.out.println(d);
        Map<String,Integer> r = m.getAgeOfFriends();
        System.out.println(r);

    }

    public Map<String, String> getAllGender() {
        Map<String, String> map = new HashMap<>();
        map.put("mounika", "female");
        map.put("divya", "female");
        map.put("jyo", "female");
        map.put("santhu", "female");
        map.put("sai", "male");
        map.put("sudha", "male");
        map.put("haritha", "female");
        return map;

    }
    public Map<String,Integer> getAgeOfFriends(){
        Map<String,Integer> h = new HashMap<>();
        h.put("mouni",22);
        h.put("jyo",22);
        h.put("divya",20);
        h.put("sudha",20);
        h.put("ranjith",18);
        h.put("spandana",22);
        return h;
    }
}
