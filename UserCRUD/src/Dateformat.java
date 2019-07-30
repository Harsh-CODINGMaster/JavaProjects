import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Dateformat {

	public static String dateFormat(Date date ) {
		 date = new Date();
		//Locale locale =new Locale("hi", "IN");
//		DateFormat df = DateFormat.
//				getDateInstance(DateFormat.FULL, locale);
		String pattern = "MM-dd-yyyy";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		return simpleDateFormat.format(date);
		//System.out.println("Date is "+date);
//		return df.format(date);
	}
}
