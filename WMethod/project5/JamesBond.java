package project5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JamesBond {

	
	
	public Boolean bondRegex(String input) {
		
		
		Pattern p = Pattern.compile(".*[\\(].*(0{2})[7].*[\\)]");
		Matcher m = p.matcher(input);
		return m.matches();
		
	}
	
	
}
