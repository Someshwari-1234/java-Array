import java.util.Objects;

class Test {
    String name;
    int id;

    Test(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Test)) return false;
        Test t = (Test) o;
        return id == t.id && name.equals(t.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id); // generates a good hash
    }
}

public class Person {
    public static void main(String[] args) {
        Test p1 = new Test("Alice", 1);
        Test p2 = new Test("Alice", 1);

        System.out.println(p1.equals(p2)); // true
        System.out.println(p1.hashCode() == p2.hashCode()); // true

        HashSet<Test> set = new HashSet<>();
        set.add(p1);
        set.add(p2);
        System.out.println(set.size()); //  correct
    }
}
