/*
 * Copyright (C) 2005-2015 Schlichtherle IT Services.
 * All rights reserved. Use is subject to license terms.
 */
package de.schlichtherle.license;

import java.rmi.Remote;

/**
 * Provides remote license verification services.
 *
 * @author Christian Schlichtherle
 */
public interface LicenseVerifier extends Remote {

    /**
     * Decrypts, decompresses, decodes and verifies the given license key,
     * validates its license content and returns it.
     *
     * @param key The license key
     *        - may <em>not</em> be {@code null}.
     *
     * @return A clone of the verified and validated content of the license key
     *         - {@code null} is never returned.
     *
     * @throws Exception An instance of a subclass of this class for various
     *         reasons.
     *         Note that you should always use
     *         {@link Throwable#getLocalizedMessage()} to get a (possibly
     *         localized) meaningful detail message.
     */
    LicenseContent verify(byte[] key) throws Exception;
}
