import static org.junit.Assert.*;
import org.junit.Test;

public class StringCalculator {

	@Test()
	public void firstTest() {
		int result = StringCalculatorTest.add(null);
		assertEquals(0, result);
	}
	@Test()
	public void secondTest() {
		int result = StringCalculatorTest.add("");
		assertEquals(1, result);
	}
}
