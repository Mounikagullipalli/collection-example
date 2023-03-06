import java.util.HashSet;
import java.util.Set;

public class ExSet {
    public static void main(String[] args) {
        ExSet t = new ExSet();
        Set<String> g = t.getUniqueNames();
        System.out.println(g);
    }
    public Set<String> getUniqueNames(){
        Set<String> s = new HashSet<>();
        s.add("mouni");
        s.add("jyo");
        s.add("santhu");
        s.add("haritha");
        s.add("divya");
        s.add("sudha");
        s.add("divya");
        s.add("null");
        return s;
    }
}
