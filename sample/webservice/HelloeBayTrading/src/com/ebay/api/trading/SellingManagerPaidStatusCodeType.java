// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.api.trading;

/**
 * Mark paid status type
 * 
 */
public enum SellingManagerPaidStatusCodeType {

    /**
     * 
   * The status of the order is "paid."
   * 
     */
    PAID("Paid"),
  

    /**
     * 
   * The status of the order is "partially paid."
   * 
     */
    PARTIALLY_PAID("PartiallyPaid"),
  

    /**
     * 
   * The status of the order is "unpaid."
   * 
     */
    UNPAID("Unpaid"),
  

    /**
     * 
   * The status of the order is "pending."
   * 
     */
    PENDING("Pending"),
  

    /**
     * 
   * The status of the order is "refunded."
   * 
     */
    REFUNDED("Refunded"),
  

    /**
     * 
   * (out) Reserved for internal or future use.
   * 
     */
    CUSTOM_CODE("CustomCode");
  
  
    private final String value;
  
    SellingManagerPaidStatusCodeType(String v) {
        value = v;
    }
    
    public String value() {
        return value;
    }
    
    public static SellingManagerPaidStatusCodeType fromValue(String v) {
        if (v != null) {
            for (SellingManagerPaidStatusCodeType c: SellingManagerPaidStatusCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}