package poly.ex.pay1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PayMain2 {

    public static void main(String[] args) throws IOException {

        PayService payService = new PayService();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.println("결제 수단을 입력하세요");
            String payOption = br.readLine();
            if (payOption.equals("exit")) {
                System.out.println("결제를 종료합니다.");
                return;
            }
            System.out.println("결제 금액을 입력하세요");
            int amount = Integer.parseInt(br.readLine());

            payService.processPay(payOption, amount);
        }
    }
}
