package errorHandling;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;

/**
 *
 * @author florm
 */
public class InputException extends WebApplicationException {
    
    
     public static class MyStatus implements Response.StatusType {
	        final int statusCode;
	        final String reasonPhrase;

	        public MyStatus(int statusCode, String reasonPhrase) {
	            this.statusCode = statusCode;
	            this.reasonPhrase = reasonPhrase;
	        }

	        @Override
	        public int getStatusCode() {
	            return statusCode;
	        }
	        @Override
	        public Response.Status.Family getFamily() {
	            return Response.Status.Family.familyOf(statusCode);
	        }
	        @Override
	        public String getReasonPhrase() {
	            return reasonPhrase;
	        }
	    }

	    public InputException() {
	    }

	    public InputException(int status) {
	        super(status);
	    }

	    public InputException(Response response) {
	        super(response);
	    }

	    public InputException(Response.Status status) {
	        super(status);
	    }

	    public InputException(String message, Response response) {
	        super(message, response);
	    }

	    public InputException(int status, String message) {
	        super(message, Response.status(new MyStatus(status, message)). build());
	    }

	    public InputException(Response.Status status, String message) {
	        this(status.getStatusCode(), message);
	    }

	    public InputException(String message) {
	        this(400, message);
	    }
}
