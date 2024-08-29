package exception.ex3;

import java.util.Set;

public class javatest {

    public static void main(String[] args){

        Set<Integer> printHello = Set.of(2, 3, 7);

        for(int i = 1; i <= 10; i++) {
            if (i == 4) {
                continue;
            }else if(printHello.contains(i)){
                System.out.println("Hello World!");
            }else{
                System.out.println(i);
            }
        }

    }
}

/*
import java.util.Set;

public class javatest {

    public static void main(String[] args) {
        Set<Integer> printHelloWorld = Set.of(2, 3, 7);
        for (int i = 1; i <= 10; i++) {
            if (i == 4) {
                continue;
            } else if (printHelloWorld.contains(i)) {
                System.out.println("Hello World!");
            } else {
                System.out.println(i);
            }
        }
    }
}
 */