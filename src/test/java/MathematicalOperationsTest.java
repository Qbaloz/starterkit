import org.junit.Assert;
import org.junit.Test;


/**
 * Created by ldrygala on 2015-11-20.
 */
public class MathematicalOperationsTest {
	@Test
	public void shouldHandleSummation() {
		//given
		int numberOne = 3;
		int numberTwo = 5;
		//when
		int result = MathematicalOperations.Summation(numberOne, numberTwo);
		//then
		Assert.assertEquals(8, result);
	}
}
