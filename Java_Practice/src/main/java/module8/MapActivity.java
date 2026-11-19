package module8;

import java.util.HashMap;
import java.util.Map;

public class MapActivity {

    static void main(String[] args) {

        Map<String, String> map = new HashMap<>();

        map.put("1", "John");
        map.put("2", "Harry");
        map.put("3", "Daniel");
        map.put("4", "Mike");

        MapActivity obj = new MapActivity();
        obj.print(map);
    }

    void print(Map<String, String> map) {

        for (String id : map.keySet()) {
            System.out.println(id + " : " + map.get(id));
        }
    }
}
