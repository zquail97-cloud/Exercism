import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

class AppointmentScheduler {

	public LocalDateTime schedule(String appointmentDateDescription) {

		DateTimeFormatter parser = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
		LocalDateTime date = LocalDateTime.parse(appointmentDateDescription, parser);

		return date;
	}

	public boolean hasPassed(LocalDateTime appointmentDate) {
		
		
		if (appointmentDate.isBefore(LocalDateTime.now())) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
				
		LocalDateTime start = LocalDateTime.of(appointmentDate.toLocalDate(), LocalTime.of(11, 59, 59));
		LocalDateTime end = LocalDateTime.of(appointmentDate.toLocalDate(), LocalTime.of(18, 0));
		
		if (appointmentDate.isAfter(start) && appointmentDate.isBefore(end)) {
			return true;
		} else {
			return false;
		}
	}

	public String getDescription(LocalDateTime appointmentDate) {
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy, 'at' h:mm a.");
		
		String message = "You have an appointment on "+appointmentDate.format(formatter);
		
		return message;
	}

    public LocalDate getAnniversaryDate() {
        
    	LocalDate anniversaryDate = LocalDate.of(LocalDate.now().getYear(),9,15);
    	
    	return anniversaryDate;
    }
}
