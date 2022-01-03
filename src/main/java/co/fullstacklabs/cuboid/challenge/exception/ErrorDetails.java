package co.fullstacklabs.cuboid.challenge.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ErrorDetails {
	
	private String message;
    private String details;
	

    ErrorDetails(String message, String details) {
		this.message = message;
		this.details = details;
	}
    
    
	public String getMessage() {
		return message;
	}
	public String getDetails() {
		return details;
	}

}
