package exception.basic.unckecked;

public class UncheckedThrowMain {
    public static void main(String[] args) {
        //컴파일러가 throws 선언을 확인하지 않기에 언체크 예외 라고 부른다
        // 물론 throws를 선언해도 된다.
        Service service  = new Service();
        service.callThrow();
        System.out.println("정상 종료");
    }
}
