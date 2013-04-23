// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * Returns items from the Buying section of the user's My eBay
 * account, including items that the user is watching, bidding on, has
 * won, has not won, and has made Best Offers on.
 * 
 */
@RootElement(name = "GetMyeBayBuyingRequest", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetMyeBayBuyingRequestType extends AbstractRequestType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "WatchList")
	@Order(value=0)
	public ItemListCustomizationType watchList;	
	
	@Element(name = "BidList")
	@Order(value=1)
	public ItemListCustomizationType bidList;	
	
	@Element(name = "BestOfferList")
	@Order(value=2)
	public ItemListCustomizationType bestOfferList;	
	
	@Element(name = "WonList")
	@Order(value=3)
	public ItemListCustomizationType wonList;	
	
	@Element(name = "LostList")
	@Order(value=4)
	public ItemListCustomizationType lostList;	
	
	@Element(name = "FavoriteSearches")
	@Order(value=5)
	public MyeBaySelectionType favoriteSearches;	
	
	@Element(name = "FavoriteSellers")
	@Order(value=6)
	public MyeBaySelectionType favoriteSellers;	
	
	@Element(name = "SecondChanceOffer")
	@Order(value=7)
	public MyeBaySelectionType secondChanceOffer;	
	
	@Element(name = "BidAssistantList")
	@Order(value=8)
	public BidAssistantListType bidAssistantList;	
	
	@Element(name = "DeletedFromWonList")
	@Order(value=9)
	public ItemListCustomizationType deletedFromWonList;	
	
	@Element(name = "DeletedFromLostList")
	@Order(value=10)
	public ItemListCustomizationType deletedFromLostList;	
	
	@Element(name = "BuyingSummary")
	@Order(value=11)
	public ItemListCustomizationType buyingSummary;	
	
	@Element(name = "UserDefinedLists")
	@Order(value=12)
	public MyeBaySelectionType userDefinedLists;	
	
	@Element(name = "HideVariations")
	@Order(value=13)
	public Boolean hideVariations;	
	
    
}