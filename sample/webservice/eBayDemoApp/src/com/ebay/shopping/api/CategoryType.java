// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.shopping.api;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Contains details about a category.
 * 
 */
public class CategoryType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "CategoryID")
	@Order(value=0)
	public String categoryID;	
	
	@Element(name = "CategoryLevel")
	@Order(value=1)
	public Integer categoryLevel;	
	
	@Element(name = "CategoryName")
	@Order(value=2)
	public String categoryName;	
	
	@Element(name = "CategoryParentID")
	@Order(value=3)
	public String categoryParentID;	
	
	@Element(name = "CategoryParentName")
	@Order(value=4)
	public String categoryParentName;	
	
	@Element(name = "ItemCount")
	@Order(value=5)
	public Integer itemCount;	
	
	@Element(name = "CategoryNamePath")
	@Order(value=6)
	public String categoryNamePath;	
	
	@Element(name = "CategoryIDPath")
	@Order(value=7)
	public String categoryIDPath;	
	
	@Element(name = "LeafCategory")
	@Order(value=8)
	public Boolean leafCategory;	
	
	@AnyElement
	@Order(value=9)
	public List<Object> any;	
	
    
}