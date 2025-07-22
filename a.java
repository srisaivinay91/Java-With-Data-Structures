class x {
    x() {
        System.out.println("Hello x");
    }
}

class b extends x {
    b() {
        System.out.println("Hello b");
    }
}

class c extends b {
    c() {
        super();
        System.out.println("Hello c");
    }
}

public class a{
    public static void main(String[] args) {
        c cat = new c();
    }
}

