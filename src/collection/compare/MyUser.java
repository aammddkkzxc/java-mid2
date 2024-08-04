package collection.compare;

public class MyUser implements Comparable<MyUser> {
    private final String id;
    private final int age;

    public MyUser(String id, int age) {
        this.id = id;
        this.age = age;
    }

    @Override
    public int compareTo(MyUser o) {
        return this.age < o.age ? -1 : (this.age == o.age ? 0 : 1);
    }

    @Override
    public String toString() {
        return "MyUser{" +
                "name='" + id + '\'' +
                ", age=" + age +
                '}';
    }

    public String getId() {
        return id;
    }

    public int getAge() {
        return age;
    }
}
