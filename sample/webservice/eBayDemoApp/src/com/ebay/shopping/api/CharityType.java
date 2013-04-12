// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.shopping.api;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Identifies a Giving Works listing and benefiting nonprofit charity organization.
 * Currently supported through the US and eBay Motors sites only. The Ad Format and
 * Mature Audiences categories are not supported.
 * Not applicable for US eBay Motors, international, Real Estate, and Tickets.
 * 
 */
public class CharityType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "CharityID")
	@Order(value=0)
	public String charityID;	
	
	@Element(name = "CharityName")
	@Order(value=1)
	public String charityName;	
	
	@Element(name = "CharityNumber")
	@Order(value=2)
	public Integer charityNumber;	
	
	@Element(name = "DonationPercent")
	@Order(value=3)
	public Float donationPercent;	
	
	@Element(name = "Mission")
	@Order(value=4)
	public String mission;	
	
	@Element(name = "LogoURL")
	@Order(value=5)
	public String logoURL;	
	
	@Element(name = "CharityListing")
	@Order(value=6)
	public Boolean charityListing;	
	
	@Element(name = "Status")
	@Order(value=7)
	public CharityStatusCodeType status;	
	
	@AnyElement
	@Order(value=8)
	public List<Object> any;	
	
    
}