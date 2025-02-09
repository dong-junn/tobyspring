package tobyspring.hellospring;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class PaymentService {

    public Payment prepare(Long orderId, String currency, BigDecimal foreignCurrencyAmount) {
        /**
         * [앞으로 구현해야 할 작업]
         * 1. 환율 가져오기
         * 2. 금액 계산
         * 3. 유효시간 계산
         */
        return new Payment(orderId, currency, foreignCurrencyAmount, BigDecimal.ZERO, BigDecimal.ZERO,
                LocalDateTime.now());
    }

    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();
        Payment payment = paymentService.prepare(100L, "USD", BigDecimal.valueOf(50.7));
        System.out.println(payment);
    }
}
