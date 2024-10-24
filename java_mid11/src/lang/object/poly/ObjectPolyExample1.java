package lang.object.poly;

public class ObjectPolyExample1 {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();

        Object o = dog;

        action(dog);
        action(car);
    }

    public static void action(Object obj){
        // obj.sound(); 오브젝트에는 존재하지 않음.
        // obj.move();

        // 각 객체에 맞는 클래스가 있기에 다운캐스팅 후 실행하자
        if (obj instanceof Dog dog) {
            dog.sound();
        } else if (obj instanceof  Car car) {
            car.move();
        }
    }
}
