// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.marketplace.search.v1.services;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Base container for histogram information.
 * 
 */
public class CategoryHistogramContainer implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element
	@Order(value=0)
	public List<CategoryHistogram> categoryHistogram;	
	
	@Element
	@Order(value=1)
	public String delimiter;	
	
	@AnyElement
	@Order(value=2)
	public List<Object> any;	
	
    
}