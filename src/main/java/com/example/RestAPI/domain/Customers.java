package com.example.RestAPI.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Customers 
{
    private int id;
    private String fName;
    private String lName;
    private String emailAddress;
    private String phoneNumber;
    private String shippingAddress;
    private Address address;
    private Order[] order;
    
    //#region Getter / Setter 
    
    public int getid() {
		return id;
	}
	public void setid(int id) {
		this.id = id;
	}

    public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}

    public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}

    public String getemailAddress() {
		return emailAddress;
	}
	public void setemailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

    public String getphoneNumber() {
		return phoneNumber;
	}
	public void setphoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

    public String getshippingAddress() {
		return shippingAddress;
	}
	public void setshippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }

    public Order[] getOrder() {
        return order;
    }
    public void setOrder(Order[] order) {
        this.order = order;
    }
    
    //#endregion
    
    
}

