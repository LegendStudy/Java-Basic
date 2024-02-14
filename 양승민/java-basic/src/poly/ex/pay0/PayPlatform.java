package poly.ex.pay0;

public abstract class PayPlatform {
    public static Pay findPlatform(String option) {
        if (option.equals("kakao")) {
            return new KakaoPay();
        }
        if (option.equals("naver")) {
            return new NaverPay();
        }
        return new DefaultPay();
    }
}
