package shop;

import java.util.List;

/** kge:implements REQ-CHECKOUT */
public class Checkout {
	private final PriceCalculator prices = new PriceCalculator();

	public long total(List<Long> lines) {
		return prices.sum(lines);
	}
}
