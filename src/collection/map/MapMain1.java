package collection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMain1 {
    public static void main(String[] args) {
        Map<String, Integer> studentMap = new HashMap<>();
        studentMap.put("studentA", 90);
        studentMap.put("studentB", 80);
        studentMap.put("studentC", 80);
        studentMap.put("studentD", 100);
        System.out.println(studentMap);

        Integer result = studentMap.get("studentA");
        System.out.println(result);

        Set<String> keySet = studentMap.keySet();
        for (String key : keySet) {
            Integer value = studentMap.get(key);
            System.out.println(key + ":" + value);
        }

        Set<Map.Entry<String, Integer>> entrySet = studentMap.entrySet();
        for (Map.Entry<String, Integer> entry : entrySet) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        System.out.println("values 활용");
        Collection<Integer> values = studentMap.values();
        for (Integer value : values) {
            System.out.println("value = " + value);
        }
    }
}
