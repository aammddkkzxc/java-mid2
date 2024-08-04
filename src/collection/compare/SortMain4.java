package collection.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortMain4 {
    public static void main(String[] args) {
        List<MyUser> users = new ArrayList<MyUser>();
        users.add(new MyUser("A", 40));
        users.add(new MyUser("B", 30));
        users.add(new MyUser("C", 20));
        users.sort(null);
        //Collections.sort(users);
        System.out.println(users);

        users.sort(new IdComparator());
        //Collections.sort(users, new IdComparator());
        System.out.println(users);
    }
}
