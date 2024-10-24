package lang.object;

public class ObjectMain {

    public static void main(String[] args) {
        Child child = new Child();
        child.childMethod();
        child.parentMethod();

        // toString()은 object의 클래스 메서드이기 때문에 사용이 가능하다.
        String string = child.toString();
        System.out.println(string);
    }
}
