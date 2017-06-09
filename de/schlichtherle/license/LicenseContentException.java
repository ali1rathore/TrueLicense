/*
 * Copyright (C) 2005-2015 Schlichtherle IT Services.
 * All rights reserved. Use is subject to license terms.
 */
package de.schlichtherle.license;

/**
 * Indicates that validating a license certificate fails.
 *
 * @author Christian Schlichtherle
 * @version $Id$
 */
public class LicenseContentException extends java.lang.Exception {
    private static final long serialVersionUID = 1L;
    
    /**
     * Constructs an instance of {@code LicenseContentException}
     * with the given {@code resourceKey} to lookup the localized detail
     * message with.
     *
     * @param resourceKey The key to use to lookup the localized detail
     *        message when {@link #getLocalizedMessage()} is called
     *        - may <em>not</em> be {@code null}.
     */
    public LicenseContentException(String resourceKey) {
        super(resourceKey);
    }

    public String getLocalizedMessage() {
        return Resources.getString(super.getMessage());
    }
}
