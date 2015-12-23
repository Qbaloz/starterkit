import java.io.FileReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

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
		String filePath = getClass().getResource("10000factorial.txt").getPath();
		Scanner in = new Scanner(new FileReader(filePath));
		String bigNumber = "";
		if (in.hasNext()) {
			bigNumber = in.nextLine();
		}
		in.close();
		Assume.assumeFalse(bigNumber == "");
		int factorialBase = 10000;
		// when
		BigInteger result = MathematicalOperations.factorial(factorialBase);
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
	
	@Test
	public void shouldHandlePositiveEvenNumber(){
		//given
		int inputNumber = 4;
		//when
		boolean result = MathematicalOperations.isEven(inputNumber);
		//then
		Assert.assertTrue(result);
	}
	
	@Test
	public void shouldHandlePositiveOddNumber(){
		//given
		int inputNumber = 3;
		//when
		boolean result = MathematicalOperations.isEven(inputNumber);
		//then
		Assert.assertFalse(result);
	}
	
	@Test
	public void shouldHandleZero(){
		//given
		int inputNumber = 0;
		//when
		boolean result = MathematicalOperations.isEven(inputNumber);
		//then
		Assert.assertTrue(result);
	}
	
	@Test
	public void shouldHandleNegativeEvenNumber(){
		//given
		int inputNumber = -4;
		//when
		boolean result = MathematicalOperations.isEven(inputNumber);
		//then
		Assert.assertTrue(result);
	}
	
	@Test
	public void shouldHandleNegativeOddNumber(){
		//given
		int inputNumber = -3;
		//when
		boolean result = MathematicalOperations.isEven(inputNumber);
		//then
		Assert.assertFalse(result);
	}
	
	public void shouldHandleMultiplyTwoNumbers() {
		//given
		int firstNumber = 9;
		int secondNumber = 5;
		//when
		int result = MathematicalOperations.multiplyTwoNumbers(firstNumber, secondNumber);
		//then
<<<<<<< HEAD
		Assert.assertEquals(45, result);
	}
	
	@Test
	public void shouldHandleEuclidean(){
		//given
		int firstNumber = 6;
		int secondNumber = 12;
		//when
		int result = MathematicalOperations.euclidean(firstNumber, secondNumber);
		//then
		Assert.assertEquals(6, result);
=======
		Assert.assertEquals(45, result);
>>>>>>> 70865846b896b58198f49c1fa80241e62122eaf8
	}
}
