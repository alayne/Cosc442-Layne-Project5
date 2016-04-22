package project5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JamesBond {

	
	
	public Boolean bondRegex(String input) {
		
		Pattern p = Pattern.compile("(\\d*)(\\)*)[\\(](0{2})[7](\\d*)(\\(*)[\\)]");
		Matcher m = p.matcher(input);
		return m.matches();
		
	}
	
	
}
