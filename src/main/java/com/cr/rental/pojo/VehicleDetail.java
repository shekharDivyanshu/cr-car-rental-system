/**
 * 
 */
package com.cr.rental.pojo;

/**
 * @author dshekhar
 *
 */
public class VehicleDetail {
	
	private String type;
	private String subType;
	private int availableQty;
	
	public VehicleDetail(String type, String subType, int availableQty) {
		this.type = type;
		this.subType = subType;
		this.availableQty = availableQty;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getSubType() {
		return subType;
	}
	public void setSubType(String subType) {
		this.subType = subType;
	}
	public int getAvailableQty() {
		return availableQty;
	}
	public void setAvailableQty(int availableQty) {
		this.availableQty = availableQty;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("VehicleDetail [type=");
		builder.append(type);
		builder.append(", subType=");
		builder.append(subType);
		builder.append(", availableQty=");
		builder.append(availableQty);
		builder.append("]");
		return builder.toString();
	}
	
}
