import java.util.ArrayList;
import java.util.List;

public class LanguageList {
    private final List<String> languages = new ArrayList<>();

    public boolean isEmpty() {
    	
    	if (languages.isEmpty()) {
			return true;
		} else
    	
        return false;
    }

   public void addLanguage(String language) {
        
    	languages.add(language);
    }

     public void removeLanguage(String language) {
         languages.remove(language);
    }

    public String firstLanguage() {
        return languages.getFirst();
    	
    }

    public int count() {
        
    	int count=0;
    	
    	for (String language : languages) {
			count++;
		}
    	return count;
    }

    public boolean containsLanguage(String language) {

		if (languages.contains(language)) {
			return true;
		} else
			return false;

	}

   public boolean isExciting() {
		
		if (languages.contains("Java") || languages.contains("Kotlin")) {
			return true;
		} else
			return false;
	}
}
