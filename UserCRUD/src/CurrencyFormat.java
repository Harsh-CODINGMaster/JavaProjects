import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyFormat {
	public static String currencyFormat(long g ){
		Locale locale =new Locale("hi", "IN");
		NumberFormat nf = NumberFormat.getCurrencyInstance(locale);
		return nf.format(g);
	}
}
