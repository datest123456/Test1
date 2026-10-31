package shop;

public class DiscountPolicy {
	public long amount(String code) {
		return "WELCOME10".equals(code) ? 10 : 0;
	}
}
