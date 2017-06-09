/*
 * Copyright (C) 2005-2015 Schlichtherle IT Services.
 * All rights reserved. Use is subject to license terms.
 */
package de.schlichtherle.license.ftp;

import de.schlichtherle.util.ObfuscatedString;
import java.text.MessageFormat;
import java.util.ResourceBundle;

/**
 * Looks up the resources for this package in a Resource Bundle.
 * Provided for comfort.
 *
 * @author Christian Schlichtherle
 * @version $Id$
 */
class Resources {

    private static final String CLASS_NAME = new ObfuscatedString(new long[] {
        0xED417927B5A22343L, 0xFCFE487B94539114L, 0xEB7159A762B47D70L,
        0xDDCF2474803823EAL, 0xAC1F276714EE71F1L, 0xE08BE958E3A83F4DL
    }).toString(); /* => "de.schlichtherle.license.ftp.Resources" */

    private static final ResourceBundle resources
            = ResourceBundle.getBundle(CLASS_NAME);

    /**
     * Looks up a string resource identified by {@code key} in
     * {@code resources}.
     */
    public static String getString(String key) {
        return resources.getString(key);
    }

    /**
     * Looks up a string resource identified by {@code key} in
     * {@code resources} and formats it as a message using
     * {@code MessageFormat.format} with the given {@code arguments}.
     */
    public static String getString(String key, Object[] arguments) {
        return MessageFormat.format(getString(key), arguments);
    }

    /**
     * Looks up a string resource identified by {@code key} in
     * {@code resources} and formats it as a message using
     * {@code MessageFormat.format} with the given singular {@code argument}.
     */
    public static String getString(String key, Object argument) {
        return MessageFormat.format(getString(key), new Object[] { argument });
    }
    
    /** You cannot instantiate this class. */
    protected Resources() { }
}
