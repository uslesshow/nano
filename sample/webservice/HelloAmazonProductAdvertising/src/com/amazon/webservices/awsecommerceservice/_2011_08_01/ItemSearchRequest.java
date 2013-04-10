// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.amazon.webservices.awsecommerceservice._2011_08_01;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.math.BigInteger;
import java.util.List;

public class ItemSearchRequest implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "Actor")
	@Order(value=0)
	public String actor;	
	
	@Element(name = "Artist")
	@Order(value=1)
	public String artist;	
	
	@Element(name = "Availability")
	@Order(value=2)
	public String availability;	
	
	@Element(name = "AudienceRating")
	@Order(value=3)
	public List<String> audienceRating;	
	
	@Element(name = "Author")
	@Order(value=4)
	public String author;	
	
	@Element(name = "Brand")
	@Order(value=5)
	public String brand;	
	
	@Element(name = "BrowseNode")
	@Order(value=6)
	public String browseNode;	
	
	@Element(name = "Composer")
	@Order(value=7)
	public String composer;	
	
	@Element(name = "Condition")
	@Order(value=8)
	public String condition;	
	
	@Element(name = "Conductor")
	@Order(value=9)
	public String conductor;	
	
	@Element(name = "Director")
	@Order(value=10)
	public String director;	
	
	@Element(name = "ItemPage")
	@Order(value=11)
	public BigInteger itemPage;	
	
	@Element(name = "Keywords")
	@Order(value=12)
	public String keywords;	
	
	@Element(name = "Manufacturer")
	@Order(value=13)
	public String manufacturer;	
	
	@Element(name = "MaximumPrice")
	@Order(value=14)
	public BigInteger maximumPrice;	
	
	@Element(name = "MerchantId")
	@Order(value=15)
	public String merchantId;	
	
	@Element(name = "MinimumPrice")
	@Order(value=16)
	public BigInteger minimumPrice;	
	
	@Element(name = "MinPercentageOff")
	@Order(value=17)
	public BigInteger minPercentageOff;	
	
	@Element(name = "MusicLabel")
	@Order(value=18)
	public String musicLabel;	
	
	@Element(name = "Orchestra")
	@Order(value=19)
	public String orchestra;	
	
	@Element(name = "Power")
	@Order(value=20)
	public String power;	
	
	@Element(name = "Publisher")
	@Order(value=21)
	public String publisher;	
	
	@Element(name = "RelatedItemPage")
	@Order(value=22)
	public String relatedItemPage;	
	
	@Element(name = "RelationshipType")
	@Order(value=23)
	public List<String> relationshipType;	
	
	@Element(name = "ResponseGroup")
	@Order(value=24)
	public List<String> responseGroup;	
	
	@Element(name = "SearchIndex")
	@Order(value=25)
	public String searchIndex;	
	
	@Element(name = "Sort")
	@Order(value=26)
	public String sort;	
	
	@Element(name = "Title")
	@Order(value=27)
	public String title;	
	
	@Element(name = "ReleaseDate")
	@Order(value=28)
	public String releaseDate;	
	
	@Element(name = "IncludeReviewsSummary")
	@Order(value=29)
	public String includeReviewsSummary;	
	
	@Element(name = "TruncateReviewsAt")
	@Order(value=30)
	public BigInteger truncateReviewsAt;	
	
    
}