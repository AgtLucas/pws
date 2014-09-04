package uk.com.megabrew.service;

import java.util.GregorianCalendar;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.WebFault;

@WebFault(targetNamespace = "http://service.megabrew.com.uk/exceptions", name="UserNotAuthorized")
public class UserNotAuthorizedException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public UserNotAuthorizedException() {
		super();
	}
	
	public UserNotAuthorizedException(String message, Throwable cause, boolean enableSuppresion, boolean writableStackTrace) {
		super(message, cause, enableSuppresion, writableStackTrace);
	}
	
	public UserNotAuthorizedException(String message, Throwable cause) {
		super(message, cause);
	}
	
	public UserNotAuthorizedException(String message) {
		super(message);
	}
	
	public UserNotAuthorizedException(Throwable cause) {
		super(cause);
	}
	
	public UserFaultInfo getFaultInfo() {
		return new UserFaultInfo(getMessage());
	}
	
	@XmlAccessorType(XmlAccessType.FIELD)
	public static class UserFaultInfo {
		
		@XmlAttribute
		private String message;
		private XMLGregorianCalendar date;
		
		public UserFaultInfo(String message) {
			this.message = message;
			
			try {
				this.date = DatatypeFactory.newInstance().newXMLGregorianCalendar(new GregorianCalendar());
				this.date.setMillisecond(DatatypeConstants.FIELD_UNDEFINED);
				this.date.setTimezone(DatatypeConstants.FIELD_UNDEFINED);
			} catch (DatatypeConfigurationException e) {
				throw new RuntimeException(e);
			}
		}
		
		public UserFaultInfo() {
			
		}
		
	}

}
