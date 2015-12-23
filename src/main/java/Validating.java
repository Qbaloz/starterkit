import org.apache.commons.validator.routines.ShortValidator;

public class Validating {
	public boolean validVeryShort(int a){	
		ShortValidator valid =new ShortValidator();
		return valid.isInRange(a,10,20);
	}
}

