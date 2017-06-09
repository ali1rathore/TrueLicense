/*
 * Copyright (C) 2005-2015 Schlichtherle IT Services.
 * All rights reserved. Use is subject to license terms.
 */
package de.schlichtherle.license;

import java.util.prefs.Preferences;

/**
 * Configures basic parameters required by the {@link LicenseManager}.
 *
 * @author Christian Schlichtherle
 */
public interface LicenseParam {

    /**
     * Returns the license manager's subject as a descriptive string
     *         - {@code null} is never returned.
     *
     * @return A string which must compare equal to the "subject" property
     *         of the {@link LicenseContent} JavaBean.
     *         Note that this is public information which may be displayed
     *         to the user in a wizard or some other form.
     */
    String getSubject();

    /**
     * Returns the preferences node where the encoded licence is stored
     * or should get stored.
     * This method may return {@code null} if the license manager is neither
     * used to {@link LicenseManager#install(java.io.File)} a license nor to
     * {@link LicenseManager#verify()} an installed license.
     * <p>
     * Note that the preferences node should be globally unique;
     * otherwise, another application could overwrite your license key!
     * Thus, it is recommended to follow Sun's guideline of creating globally
     * unique package names by prefixing them with your globally unique
     * Internet domain.
     * You should then put the main class of your application in this package
     * and return its user preferences node. This is because across platforms
     * you will normally only have write access to the user preferences.
     * 
     * @return The nullable preferences node for persisting the license key.
     */
    Preferences getPreferences();

    /**
     * Returns the keystore configuration parameters for the license manager
     *         - {@code null} is never returned.
     */
    KeyStoreParam getKeyStoreParam();

    /**
     * Returns the cipher configuration parameters for the license manager
     *         - {@code null} is never returned.
     */
    CipherParam getCipherParam();    
}
