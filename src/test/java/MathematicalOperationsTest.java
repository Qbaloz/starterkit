import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

import org.junit.Assert;
import org.junit.Assume;
import org.junit.Test;

/**
 * Created by ldrygala on 2015-11-20.
 */
public class MathematicalOperationsTest {
	@Test
	public void shouldHandleAddingTwoNumbers() {
		// given
		int numberOne = 3;
		int numberTwo = 5;
		// when
		int result = MathematicalOperations.addTwoNumbers(numberOne, numberTwo);
		// then
		Assert.assertEquals(8, result);
	}

	@Test
	public void shouldReturnFactorialOfZero() {
		// given
		int factorialBase = 0;
		// when
		BigInteger result = MathematicalOperations.factorial(factorialBase);
		// then
		BigInteger expectedResult = BigInteger.valueOf(1);
		Assert.assertEquals(expectedResult, result);
	}

	@Test
	public void shouldReturnFactorialOfTen() {
		// given
		int factorialBase = 10;
		// when
		BigInteger result = MathematicalOperations.factorial(factorialBase);
		// then
		BigInteger expectedResult = BigInteger.valueOf(3628800);
		Assert.assertEquals(expectedResult, result);
	}

	@Test
	public void shouldReturnFactorialOfTwenty() throws Exception {
		// given
		int factorialBase = 20;
		// when
		BigInteger result = MathematicalOperations.factorial(factorialBase);
		DecimalFormat df = new DecimalFormat();
		df.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.GERMANY));
		df.setParseBigDecimal(true);
		BigDecimal decimalResult = (BigDecimal) df.parse("2.432.902.008.176.640.000");
		// then
		BigInteger expectedResult = decimalResult.toBigInteger();
		Assert.assertEquals(expectedResult, result);
	}

	@Test
	public void shouldReturnFactorialOfTenThousands() throws Exception {
		// given
		// source http://www.nitrxgen.net/factorialdb/
		Assume.assumeNotNull(getClass().getResource("10000factorial.txt"));
		int factorialBase = 10000;
		// when
		BigInteger result = MathematicalOperations.factorial(factorialBase);
		Path testFile = Paths.get(getClass().getResource("10000factorial.txt").toURI());
		String bigNumber = Files.lines(testFile).findFirst().orElse("");
		// then
		BigInteger expectedResult = new BigInteger(bigNumber);
		Assert.assertEquals(expectedResult, result);
	}

	@Test(expected = IllegalArgumentException.class)
	public void shouldThrowExceptionWhenNegativeIntegerGiven() {
		// given
		int factorialBase = -15;
		// when
		BigInteger result = MathematicalOperations.factorial(factorialBase);
		// then
		Assert.assertEquals(0, result);
	}
}
