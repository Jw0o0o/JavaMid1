package exception.ex2;

import java.util.Scanner;

public class MainV2 {

    public static void main(String[] args) throws NetworkClientExceptionV2 {
        // 2_1에서는 오류를 던지기만 해서 예외 발생 시 오류가 발생
        //NetworkServiceV2_1 networkService = new NetworkServiceV2_1();
        // 2_2에서는 오류를 잡아서 리턴을 해주지만 정상흐름과 예외 처리가 공존하고 있고, 연결 해제를 하지 않아 또 다시 자원낭비가 발생
        //NetworkServiceV2_2 networkService = new NetworkServiceV2_2();
        // 2_3에서는 정상흐름과 예외 처리를 분리해주었다. 아직도 연결 해제를 하지 않아 아직도 자원낭비가 발생하고 있다.
        //NetworkServiceV2_3 networkService = new NetworkServiceV2_3();
        // 2_4 에서는 disconnect를 밖으로 빼줫R
        //NetworkServiceV2_4 networkService = new NetworkServiceV2_4();
        // 2_5 에서 결국 try catch finally 도입!!!
        NetworkServiceV2_5 networkService = new NetworkServiceV2_5();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("전송할 문자 : ");
            String input = scanner.nextLine();
            if (input.trim().equals("exit")) {
                break;
            }
            networkService.sendMessage(input);
            System.out.println();
        }
        System.out.println("프로그램을 정상 종료합니다.");
    }
}
