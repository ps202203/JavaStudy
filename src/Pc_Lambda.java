// 240926 람다표현식

interface MyFunction {
    void print(String str);
}

public class Pc_Lambda {
    public static void main(String[] args) {
        MyFunction myfunc = System.out::println;
        MyFunction myfunc2 = (str) -> System.out.println(str);

        myfunc.print("Hello World");
        myfunc2.print("Hello World2");
    }
}
