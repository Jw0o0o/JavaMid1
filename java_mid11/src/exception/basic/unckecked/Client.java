package exception.basic.unckecked;

public class Client {
    //언체크는 여기서 throws를 명시 안해주더라도 괜찮다는게 제일 큰 차이임
    public void call() {
        throw new MyUncheckedException("ex");
    }
}
