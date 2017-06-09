/*
 * Copyright (C) 2005-2015 Schlichtherle IT Services.
 * All rights reserved. Use is subject to license terms.
 */
package de.schlichtherle.license.ftp;

import de.schlichtherle.license.LicenseContent;
import de.schlichtherle.license.KeyStoreParam;

/**
 * Extends {@link de.schlichtherle.license.LicenseParam} in order to provide
 * additional parameters required to manage a free trial period (FTP).
 *
 * @author Christian Schlichtherle
 * @version $Id$
 */
public interface LicenseParam extends de.schlichtherle.license.LicenseParam {

    /**
     * Returns the keystore configuration parameters for the free trial period
     * license.
     * The {@code KeyStoreParam} instance returned by this call must not
     * {@code equal()} the one returned by {@link #getKeyStoreParam()}.
     */
    KeyStoreParam getFTPKeyStoreParam();

    /**
     * Returns the duration of the free trial period in days.
     * Must be greater than 0 and less than a year.
     */
    int getFTPDays();

    /**
     * Returns whether or not the license consumer is eligible for a
     * free trial period.
     */
    boolean isFTPEligible();

    /**
     * Returns a newly created and initialized license content suitable for a
     * free trial period license - {@code null} is never returned.
     * The subject and the expire date do not need to be initialized.
     * This will happen outside of this method.
     */
    LicenseContent createFTPLicenseContent();

    /**
     * Removes the license consumer's eligibility for another free trial period.
     * This method is called if and only if a free trial period license has
     * just been created.
     */
    void removeFTPEligibility();
    
    /**
     * This method is called whenever a free trial period license has been
     * granted.
     * Note that you should not modify the given license content
     * - it may adversely affect functionality provided in future.
     *
     * @param content A clone of the license content that has been
     *        automatically created
     *        - may not be {@code null}.
     */
    void ftpGranted(LicenseContent content);
}
