/*
 * Copyright (C) 2005-2015 Schlichtherle IT Services.
 * All rights reserved. Use is subject to license terms.
 */
package de.schlichtherle.license;

/**
 * An instance of this class is thrown to indicate that the license notary
 * could not access the private or public key in a key store due to
 * insufficient or incorrect parameters in the corresponding
 * {@code KeyStoreParam} instance.
 *
 * @author Christian Schlichtherle
 * @version $Id$
 */
public class LicenseNotaryException
extends java.security.GeneralSecurityException {
    private static final long serialVersionUID = 1L;

    /** The alias of the entry in the key store. */
    private String alias;
    
    /**
     * Constructs an instance of {@code LicenseNotaryException}
     * with the given {@code resourceKey} to lookup the localized detail
     * message with and parameterize it with the given {@code alias}.
     *
     * @param resourceKey The key to use to lookup the localized detail
     *        message when {@link #getLocalizedMessage()} is called
     *        - may <em>not</em> be {@code null}.
     * @param alias The alias of the entry in the key store
     *        - may be {@code null}.
     */
    public LicenseNotaryException(String resourceKey, String alias) {
        super(resourceKey);
        this.alias = alias;
    }

    public String getLocalizedMessage() {
        return Resources.getString(super.getMessage(), alias);
    }
}
