package Validation_Email;


import java.util.regex.Pattern;
import java.util.*;

class Email
{
	public static boolean isValid(String emailId)
	{
		String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
							"[a-zA-Z0-9_+&*-]+)*@" +
							"(?:[a-zA-Z0-9-]+\\.)+[a-z" +
							"A-Z]{2,7}$";
							
		Pattern pat = Pattern.compile(emailRegex);
		if (emailId == null)
			return false;
		return pat.matcher(emailId).matches();
	}
}

class Email_validation{
	
	public static void main(String[] args)
	{
		ArrayList<String> emailId = new ArrayList<>();
			
		emailId.add("ajinkyadimothe592@gmail.com");
		emailId.add("query.learn@compony.in");
		emailId.add("LIC.org.ltd");
		emailId.add("prasaddeshmukh712@gmail.com");
		
			
		for(String i : emailId){
			if (Email.isValid(i))
				System.out.println(i + " : is valid Email addresss.");
			else
				System.out.println(i + " : is not valid email address.");
		}
	}
}
