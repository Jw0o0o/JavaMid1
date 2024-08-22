package exception.ex1;

public class NetworkServiceV1_2 {

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV1 client = new NetworkClientV1(address);
        client.initError(data); // 추가


        String connectResult = client.connect();
        // 오류가 아니다 보단 오류다! 라는게 더 찾기 쉽겠지??
        //if (!connectResult.equals("success")) {
        if (isError(connectResult)) {
            System.out.println("[네트워크 오류 발생] 오류 코드 : " + connectResult);
            return;
        }

        String sendResult = client.send(data);
        if (isError(sendResult)) {
            System.out.println("[네트워크 오류 발생] 오류 코드 : " + sendResult);
            return;
        }

        // 이러면 오류 발생 시 disconnect가 되질 않아서 자원이 낭비
        // 자바에서는 GC가 있지만 외부 연결에 대한 자원 낭비는 막을 수 없기에 코드를 수정해야한다.
        client.disconnect();
    }

    private static boolean isError(String connectResult) {
        return !connectResult.equals("success");
    }
}
