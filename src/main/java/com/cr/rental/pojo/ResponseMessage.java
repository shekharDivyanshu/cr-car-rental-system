/**
 * 
 */
package com.cr.rental.pojo;

/**
 * @author dshekhar
 *
 */
public class ResponseMessage {
	
	private boolean isError;
	private String errorMessage;
	private Object data;
	
	public boolean isError() {
		return isError;
	}
	public void setError(boolean isError) {
		this.isError = isError;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ResponseMessage [isError=");
		builder.append(isError);
		builder.append(", errorMessage=");
		builder.append(errorMessage);
		builder.append(", data=");
		builder.append(data);
		builder.append("]");
		return builder.toString();
	}
	
}
