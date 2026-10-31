package shop;

import java.util.List;

/** kge:implements REQ-CHECKOUT */
public class PriceCalculator {
	public long sum(List<Long> lines) {
		return lines.stream().mapToLong(Long::longValue).sum();
	}
}
