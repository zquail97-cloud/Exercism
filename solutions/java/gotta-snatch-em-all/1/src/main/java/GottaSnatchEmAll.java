import java.util.List;
import java.util.Set;
import java.util.HashSet;
class GottaSnatchEmAll {

    static Set<String> newCollection(List<String> cards) {
		
    	Set<String> newCollection = new HashSet<>(cards);
		return newCollection;
        
    }

   static boolean addCard(String card, Set<String> collection) {
       
    	if (!collection.contains(card)) {
			return collection.add(card);
		} else {
			return false;
		}
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {

		// Check if I have something unique to them
		Set<String> myUniqueCards = new HashSet<>(myCollection);
		myUniqueCards.removeAll(theirCollection);
		
		//Check if they have something unique to me
		Set<String> theirUniqueCards = new HashSet<>(theirCollection);
		theirUniqueCards.removeAll(myCollection);

		//Return true only if both sets have something unique and aren't empty
		return !myUniqueCards.isEmpty() && !theirUniqueCards.isEmpty();
	}

    static Set<String> commonCards(List<Set<String>> collections) {
		
		Set<String> allCommons = new HashSet<>(collections.get(0));
		
		if (collections.isEmpty()) {
			return new HashSet<>();
		}
		
		for (int i =1; i<collections.size(); i++) {
			Set<String> currentSet = collections.get(i);
			
			allCommons.retainAll(currentSet);
		}
		return allCommons;
	}

    static Set<String> allCards(List<Set<String>> collections) {
		
		Set<String> everyCard = new HashSet<>();
		
		for (Set<String> card : collections) {
			everyCard.addAll(card);
		}
		return everyCard;
	}
}
