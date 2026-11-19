package module8;

import java.util.ArrayList;
import java.util.List;

public class ListActivity {

    static void main() {

        List<String> names= new ArrayList<>();

        names.add("John");
        names.add("John");
        names.add("Harry");
        names.add("Daniel");

        print(names);
    }

    static void print(List<String> list) {

        for ( String name : list) {
            System.out.println(name);
        }

    }
}
