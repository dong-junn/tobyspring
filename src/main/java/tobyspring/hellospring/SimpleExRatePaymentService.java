package tobyspring.hellospring;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

public class SimpleExRatePaymentService extends PaymentService{

    @Override
    BigDecimal getExRate(String currency) throws IOException {
        if (currency.equals("USD")) return BigDecimal.valueOf(1000);

        throw new IllegalArgumentException("지원되지 않는 통화입니다");
    }
}
