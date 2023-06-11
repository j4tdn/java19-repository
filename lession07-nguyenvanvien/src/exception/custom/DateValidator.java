package exception.custom;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DateValidator {
	public DateValidator() {
		
	}
	public boolean isValidDate(String date) throws ThrowsException {
	    try {
	    	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	        LocalDate.parse(date, formatter);
	        return true;
	    } catch (DateTimeParseException e) {
	        throw new ThrowsException("\nInvalid Date (dd/MM/yyyy)!");
	    }
	}
	
	public boolean isValidTime(String time) throws ThrowsException {
	    try {
	    	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
	        LocalTime.parse(time, formatter);
	        return true;
	    } catch (DateTimeParseException e) {
	        throw new ThrowsException("\nInvalid Time (HH:mm:ss)!");
	    }
	}
}
