package com.kishan.hibernate.dto;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CollectionOfElements;

@Entity
@Table (name="USER_DETAILS") 
public class UserDetails 
{
	@Id
	private int userId;
	private String userName;
	private Date joinedDate;
	/*@AttributeOverrides ({
	@AttributeOverride (name="street",column= @Column(name="HOME_STREET_NAME")),
	@AttributeOverride (name="city",column= @Column(name="HOME_CITY_NAME")),
	@AttributeOverride (name="state",column= @Column(name="HOME_STATE_NAME")),
	@AttributeOverride (name="pincode",column= @Column(name="HOME_PINCODE"))
	})
	private Address homeAddress;
	private Address officeAddress;*/
	@CollectionOfElements
	private Set<Address> listOfAddress = new HashSet<Address>();
	
	public Set<Address> getListOfAddress() {
		return listOfAddress;
	}

	public void setListOfAddress(Set<Address> listOfAddress) {
		this.listOfAddress = listOfAddress;
	}

	public int getUserId() {
		return userId;
	}
	
	public Date getJoinedDate() {
		return joinedDate;
	}
	public void setJoinedDate(Date joinedDate) {
		this.joinedDate = joinedDate;
	}
	
	
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
}
