package generic.ex1;

public class RawTypeMain {

    public static void main(String[] args) {
        GenericBox integerBox = new GenericBox();
        //GenericBox<Object> integerBox = new GenericBox<>(); 권장? - 강의 들어보자
        integerBox.set(10);
        Integer result = (Integer) integerBox.get();
        System.out.println("result = " + result);

        /*
        과거 <>가 존재하지 않았기 때문에 그 과거의 하위 호환을 위해서 로 타입을 지원하게 된다.
         */
    }
}
