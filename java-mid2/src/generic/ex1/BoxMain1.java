package generic.ex1;

public class BoxMain1 {

    public static void main(String[] args) {
        IntegerBox integerBox = new IntegerBox();
        integerBox.set(10);
        Integer integer = integerBox.get();
        System.out.println("integer = " + integer);

        StringBox stringBox = new StringBox();
        stringBox.set("hello");
        String str = stringBox.get();
        System.out.println("str = " + str);
        /*
            Integer형 박스 String형 박스만 만들면 두개만 만들면 되지만
            bool타입 double타입 등 여러 타입이 생기면 xxBox클래스를 만들어야 한다.
            이 문제를 해결하기 위해 나온게 제네릭!
         */
    }
}
