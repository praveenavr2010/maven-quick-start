package clinic.programming.training;

import org.apache.commons.lang3.StringUtils;
import java.util.ArrayList;
import java.util.List;

public class Application {
    
    public Application() {
        System.out.println ("Inside Application");
    }
	
	public int countWords(String words)
	{
		String[] seperateWords = StringUtils.split(words, ' ');
		return (seperateWords == null) ? 0 : seperateWords.length;
		
	}
    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
    	System.out.println ("Starting Application");
		Application app = new Application();
		int count = app.countWords(" I Have Four Words");
		System.out.println("Word Count : " + count);
    }
}