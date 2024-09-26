// 240926 람다표현식

interface MyFunction {
    void print(String str);
}

public class Pc_Lambda {
    public static void main(String[] args) {
        MyFunction myfunc = (str) -> System.out.println(str);
        myfunc.print("Hello World");
    }
}
