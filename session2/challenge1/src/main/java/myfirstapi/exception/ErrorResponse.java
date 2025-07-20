package myfirstapi.exception;

import java.time.Instant;
import java.util.Map;

// This POJO defines the structure of our custom error response
public class ErrorResponse {

	private String timestamp;
	private int status;
	private String error; // e.g., "Bad Request", "Not Found"
	private String message; // General error message
	private Object details; // Can be a specific error message or a map of field errors

	// Constructor for general errors (e.g., Not Found)
	public ErrorResponse(int status, String error, String message, String details) {
		this.timestamp = Instant.now().toString();
		this.status = status;
		this.error = error;
		this.message = message;
		this.details = details;
	}

	// Constructor for validation errors (with map of field errors)
	public ErrorResponse(int status, String error, String message, Map<String, String> fieldErrors) {
		this.timestamp = Instant.now().toString();
		this.status = status;
		this.error = error;
		this.message = message;
		this.details = fieldErrors; // Store field errors as a map
	}

	// --- Getters (required for JSON serialization) ---
	public String getTimestamp() {
		return timestamp;
	}

	public int getStatus() {
		return status;
	}

	public String getError() {
		return error;
	}

	public String getMessage() {
		return message;
	}

	public Object getDetails() {
		return details;
	}

	// You can add setters if needed, but for an error response, getters are usually enough.
}