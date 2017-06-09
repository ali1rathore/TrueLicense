/*
 * Copyright (C) 2005-2015 Schlichtherle IT Services.
 * All rights reserved. Use is subject to license terms.
 */
package de.schlichtherle.license;

import java.beans.BeanDescriptor;
import java.beans.EventSetDescriptor;
import java.beans.IntrospectionException;
import java.beans.MethodDescriptor;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;
import java.beans.XMLDecoder;

/**
 * The BeanInfo class for {@link LicenseContent}.
 * <p>
 * This class solely exists as a workaround for an issue with
 * {@link XMLDecoder} in some JSE implementations:
 * With these implementations, {@code XMLDecoder}  apparently seems to use
 * the locale sensitive {@link String#toUpperCase()} method to convert
 * property names found in the XML representation to the getter/setter method
 * names for the JavaBean, which may result in incorrect method names.
 * In particular, this is known to happen for the conversion of the English
 * lowercase character {@code 'i'} and the Turkish locale.
 * <p>
 * The workaround is to provide the property descriptors explicitly rather
 * than to rely on Introspection.
 * <p>
 * This issue has been reported for ...
 *
 * @author Christian Schlichtherle
 * @version $Id$
 * @since The TrueLicense Library Collection 1.30
 */
public class LicenseContentBeanInfo extends SimpleBeanInfo {
    
    // Bean descriptor information will be obtained from introspection.//GEN-FIRST:BeanDescriptor
    private static BeanDescriptor beanDescriptor = null;
    private static BeanDescriptor getBdescriptor(){
//GEN-HEADEREND:BeanDescriptor
        
        // Here you can add code for customizing the BeanDescriptor.
        
         return beanDescriptor;     }//GEN-LAST:BeanDescriptor
    
    
    // Property identifiers//GEN-FIRST:Properties
    private static final int PROPERTY_consumerAmount = 0;
    private static final int PROPERTY_consumerType = 1;
    private static final int PROPERTY_extra = 2;
    private static final int PROPERTY_holder = 3;
    private static final int PROPERTY_info = 4;
    private static final int PROPERTY_issued = 5;
    private static final int PROPERTY_issuer = 6;
    private static final int PROPERTY_notAfter = 7;
    private static final int PROPERTY_notBefore = 8;
    private static final int PROPERTY_subject = 9;

    // Property array 
    /*lazy PropertyDescriptor*/
    private static PropertyDescriptor[] getPdescriptor(){
        PropertyDescriptor[] properties = new PropertyDescriptor[10];
    
        try {
            properties[PROPERTY_consumerAmount] = new PropertyDescriptor ( "consumerAmount", de.schlichtherle.license.LicenseContent.class, "getConsumerAmount", "setConsumerAmount" ); // NOI18N
            properties[PROPERTY_consumerType] = new PropertyDescriptor ( "consumerType", de.schlichtherle.license.LicenseContent.class, "getConsumerType", "setConsumerType" ); // NOI18N
            properties[PROPERTY_extra] = new PropertyDescriptor ( "extra", de.schlichtherle.license.LicenseContent.class, "getExtra", "setExtra" ); // NOI18N
            properties[PROPERTY_holder] = new PropertyDescriptor ( "holder", de.schlichtherle.license.LicenseContent.class, "getHolder", "setHolder" ); // NOI18N
            properties[PROPERTY_info] = new PropertyDescriptor ( "info", de.schlichtherle.license.LicenseContent.class, "getInfo", "setInfo" ); // NOI18N
            properties[PROPERTY_issued] = new PropertyDescriptor ( "issued", de.schlichtherle.license.LicenseContent.class, "getIssued", "setIssued" ); // NOI18N
            properties[PROPERTY_issuer] = new PropertyDescriptor ( "issuer", de.schlichtherle.license.LicenseContent.class, "getIssuer", "setIssuer" ); // NOI18N
            properties[PROPERTY_notAfter] = new PropertyDescriptor ( "notAfter", de.schlichtherle.license.LicenseContent.class, "getNotAfter", "setNotAfter" ); // NOI18N
            properties[PROPERTY_notBefore] = new PropertyDescriptor ( "notBefore", de.schlichtherle.license.LicenseContent.class, "getNotBefore", "setNotBefore" ); // NOI18N
            properties[PROPERTY_subject] = new PropertyDescriptor ( "subject", de.schlichtherle.license.LicenseContent.class, "getSubject", "setSubject" ); // NOI18N
        }
        catch(IntrospectionException e) {
            e.printStackTrace();
        }//GEN-HEADEREND:Properties
        
        // Here you can add code for customizing the properties array.
        
        return properties;     }//GEN-LAST:Properties
    
    // Event set information will be obtained from introspection.//GEN-FIRST:Events
    private static EventSetDescriptor[] eventSets = null;
    private static EventSetDescriptor[] getEdescriptor(){//GEN-HEADEREND:Events
        
        // Here you can add code for customizing the event sets array.
        
        return eventSets;     }//GEN-LAST:Events
    
    // Method information will be obtained from introspection.//GEN-FIRST:Methods
    private static MethodDescriptor[] methods = null;
    private static MethodDescriptor[] getMdescriptor(){//GEN-HEADEREND:Methods
        
        // Here you can add code for customizing the methods array.
        
        return methods;     }//GEN-LAST:Methods
    
    
    private static final int defaultPropertyIndex = -1;//GEN-BEGIN:Idx
    private static final int defaultEventIndex = -1;//GEN-END:Idx
    
    
//GEN-FIRST:Superclass
    
    // Here you can add code for customizing the Superclass BeanInfo.
    
//GEN-LAST:Superclass
    
    /**
     * Gets the bean's {@code BeanDescriptor}s.
     *
     * @return BeanDescriptor describing the editable
     * properties of this bean.  May return null if the
     * information should be obtained by automatic analysis.
     */
    public BeanDescriptor getBeanDescriptor() {
        return getBdescriptor();
    }
    
    /**
     * Gets the bean's {@code PropertyDescriptor}s.
     *
     * @return An array of PropertyDescriptors describing the editable
     * properties supported by this bean.  May return null if the
     * information should be obtained by automatic analysis.
     * <p>
     * If a property is indexed, then its entry in the result array will
     * belong to the IndexedPropertyDescriptor subclass of PropertyDescriptor.
     * A client of getPropertyDescriptors can use "instanceof" to check
     * if a given PropertyDescriptor is an IndexedPropertyDescriptor.
     */
    public PropertyDescriptor[] getPropertyDescriptors() {
        return getPdescriptor();
    }
    
    /**
     * Gets the bean's {@code EventSetDescriptor}s.
     *
     * @return  An array of EventSetDescriptors describing the kinds of
     * events fired by this bean.  May return null if the information
     * should be obtained by automatic analysis.
     */
    public EventSetDescriptor[] getEventSetDescriptors() {
        return getEdescriptor();
    }
    
    /**
     * Gets the bean's {@code MethodDescriptor}s.
     *
     * @return  An array of MethodDescriptors describing the methods
     * implemented by this bean.  May return null if the information
     * should be obtained by automatic analysis.
     */
    public MethodDescriptor[] getMethodDescriptors() {
        return getMdescriptor();
    }
    
    /**
     * A bean may have a "default" property that is the property that will
     * mostly commonly be initially chosen for update by human's who are
     * customizing the bean.
     * @return  Index of default property in the PropertyDescriptor array
     * 		returned by getPropertyDescriptors.
     * <P>	Returns -1 if there is no default property.
     */
    public int getDefaultPropertyIndex() {
        return defaultPropertyIndex;
    }
    
    /**
     * A bean may have a "default" event that is the event that will
     * mostly commonly be used by human's when using the bean.
     * @return Index of default event in the EventSetDescriptor array
     *		returned by getEventSetDescriptors.
     * <P>	Returns -1 if there is no default event.
     */
    public int getDefaultEventIndex() {
        return defaultEventIndex;
    }
}

