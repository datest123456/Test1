package shop;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class PriceCalculatorTest {
	@Test
	void sumsLines() {
		assertEquals(30, new PriceCalculator().sum(List.of(10L, 20L)));
	}
}
