package org.tact.base;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
	public static boolean regex(String cs){
        Pattern p = Pattern.compile("^[a-zA-Z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher m = p.matcher(cs);
        return(m.find() && m.group().equals(cs));
    }
	
}
