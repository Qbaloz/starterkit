import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;

public class Shopping {

	Multiset<String> shoppingList;

	public Shopping() {
		shoppingList = HashMultiset.create();
	}

	public void addGrocery(String thingToBuy) {
		shoppingList.add(thingToBuy);
		LoggingUtil.logMessage("Added " + thingToBuy, MessageType.DEBUG);
	}
}
