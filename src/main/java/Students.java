import org.apache.commons.math3.stat.Frequency;

public class Students {
	
	public long givenNameFrequency(Frequency frequency, String name){
		return frequency.getCount(name);
	}
	
}