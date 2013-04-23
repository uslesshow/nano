// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * Describes vendor information.
 */
public class SellingManagerVendorDetailsType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "VendorName")
	@Order(value=0)
	public String vendorName;	
	
	@Element(name = "VendorContactInfo")
	@Order(value=1)
	public String vendorContactInfo;	
	
	@AnyElement
	@Order(value=2)
	public List<Object> any;	
	
    
}