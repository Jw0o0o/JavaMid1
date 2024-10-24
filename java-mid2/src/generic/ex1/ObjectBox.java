package generic.ex1;

/*
    Object는 모든 타입의 부모이기 떄문에 다형적 참조를 사용한다면 이 문제를 간단히 해결할 수 있을 것 같다.
     */

public class ObjectBox {

    private Object value;

    public void set(Object object) {
        this.value = object;
    }

    public Object get() {
        return value;
    }
}
