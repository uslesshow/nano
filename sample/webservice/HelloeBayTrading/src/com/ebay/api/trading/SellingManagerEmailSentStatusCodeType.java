// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.api.trading;

/**
 * 
 * Specifies the Selling Manager email status
 * 
 */
public enum SellingManagerEmailSentStatusCodeType {

    /**
     * 
   * Email sent successfully.
   * 
     */
    SUCCESSFUL("Successful"),
  

    /**
     * 
   * Sending of email failed.
   * 
     */
    FAILED("Failed"),
  

    /**
     * 
   * Email is not yet sent and is in Queue.
   * 
     */
    PENDING("Pending"),
  

    /**
     * 
   * (out) Reserved for internal or future use.
   * 
     */
    CUSTOM_CODE("CustomCode");
  
  
    private final String value;
  
    SellingManagerEmailSentStatusCodeType(String v) {
        value = v;
    }
    
    public String value() {
        return value;
    }
    
    public static SellingManagerEmailSentStatusCodeType fromValue(String v) {
        if (v != null) {
            for (SellingManagerEmailSentStatusCodeType c: SellingManagerEmailSentStatusCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}