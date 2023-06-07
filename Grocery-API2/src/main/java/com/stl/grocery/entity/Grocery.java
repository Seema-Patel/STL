/**
 * 
 */
package com.stl.grocery.entity;

import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * @author seema.patel
 *
 */
@Entity
@Table(name="grocery_details")
public class Grocery {
	@Id
	private String memberNumber;
	private Date date;
	private String itemDescription;
	private String username;
	private Date creationDate;
	public Grocery(String memberNumber, Date date, String itemDescription, String username, Date creationDate) {
		this.memberNumber = memberNumber;
		this.date = date;
		this.itemDescription = itemDescription;
		this.username = username;
		this.creationDate = creationDate;
	}
	public Grocery() {
		
	}
	public String getMemberNumber() {
		return memberNumber;
	}
	public void setMemberNumber(String memberNumber) {
		this.memberNumber = memberNumber;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getItemDescription() {
		return itemDescription;
	}
	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Date getCurrentDate() {
		return creationDate;
	}
	public void setCurrentDate(Date currentDate) {
		this.creationDate = currentDate;
	}
	@Override
	public String toString() {
		return "Grocery [memberNumber=" + memberNumber + ", date=" + date + ", itemDescription=" + itemDescription
				+ ", username=" + username + ", currentDate=" + creationDate + "]";
	}

	

}
