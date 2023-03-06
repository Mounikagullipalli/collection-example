import java.util.ArrayList;
import java.util.List;

public class ExList {
    public static void main(String[] args) {
        ExList e = new ExList();
        List<String> f = e.getAllNames();
        System.out.println(f);

    }

    public List<String> getAllNames() {
        List<String> l = new ArrayList<>();
        l.add("mouni");
        l.add("jyo");
        l.add("mouni");
        l.add("santhu");
        l.add("haritha");
        l.add("eswar");
        l.add("divya");
        l.add("null");
        return l;
    }
}


