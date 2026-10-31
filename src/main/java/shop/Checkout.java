package shop;

import java.util.List;

/** kge:implements REQ-CHECKOUT */
public class Checkout {
	private final PriceCalculator prices = new PriceCalculator();
	private final DiscountPolicy discounts = new DiscountPolicy();

	public long total(List<Long> lines, String code) {
		return Math.max(0, prices.sum(lines) - discounts.amount(code));
	}
}
