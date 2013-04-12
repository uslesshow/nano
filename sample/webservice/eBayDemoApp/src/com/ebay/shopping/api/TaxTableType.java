// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.shopping.api;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Sales tax details for zero or more jurisdictions (states,
 * provinces, etc).
 * 
 */
public class TaxTableType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "TaxJurisdiction")
	@Order(value=0)
	public List<TaxJurisdictionType> taxJurisdiction;	
	
    
}