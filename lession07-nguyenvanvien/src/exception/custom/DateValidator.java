package exception.custom;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Calendar;
import java.util.Date;

public class DateValidator {
	DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
	public DateValidator() {
		
	}
	public boolean isValidDate(String date) throws ThrowsException {
	    try {
	    	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	        LocalDate.parse(date, formatter);
	        return true;
	    } catch (DateTimeParseException e) {
	        throw new ThrowsException("Invalid Date !");
	    }
	}
}
