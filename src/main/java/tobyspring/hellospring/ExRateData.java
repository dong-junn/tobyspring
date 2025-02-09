package tobyspring.hellospring;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.math.BigDecimal;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true) // 해당 클래스에 없는 사항이 json에 있어도 무시해줌.
// 즉 아래 매개변수에 있는 내용만 objectMapper를 통해 mapping함
public record ExRateData(String result, Map<String, BigDecimal> rates) {
}
