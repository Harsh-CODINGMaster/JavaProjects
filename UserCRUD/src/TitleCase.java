
public class TitleCase {

	 public static String titleCase(String str) {
			String fullName ="";
			if(str!=null && str.trim().length()>0) {
				String strArr [] = str.split(" ");
				for(String st : strArr) {
					fullName += String.valueOf(st.charAt(0)).toUpperCase()
					+ st.substring(1).toLowerCase()+" ";
				}
			}
			return fullName;
		}
	
	
}
