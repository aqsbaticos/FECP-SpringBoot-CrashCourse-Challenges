package myfirstapi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<ErrorResponse> MethodArgumentNotValidException(MethodArgumentNotValidException ex, WebRequest request) {
		Map<String, String> errors = new HashMap<>();
		ex.getBindingResult().getAllErrors().forEach((error) -> {
			String fieldName = ((FieldError) error).getField(); // Get the name of the field that failed validation
			String errorMessage = error.getDefaultMessage(); // Get the validation message
			errors.put(fieldName, errorMessage);
		});

		ErrorResponse errorResponse = new ErrorResponse(
				HttpStatus.BAD_REQUEST.value(),
				HttpStatus.BAD_REQUEST.getReasonPhrase(),
				"Validation failed for one or more fields.",
				errors // Pass the map of field errors as details
		);

		return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(NoSuchElementException.class)
	public ResponseEntity<ErrorResponse> handleNoSuchElementException(NoSuchElementException ex, WebRequest request) {
		ErrorResponse errorResponse = new ErrorResponse(
				HttpStatus.NOT_FOUND.value(),
				HttpStatus.NOT_FOUND.getReasonPhrase(),
				"Resource not found.",
				ex.getMessage() != null ? ex.getMessage() : "The requested resource could not be found." // Use exception message as details
		);
		return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
	}

}
