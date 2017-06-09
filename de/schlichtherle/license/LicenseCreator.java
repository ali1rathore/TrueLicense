/*
 * Copyright (C) 2005-2015 Schlichtherle IT Services.
 * All rights reserved. Use is subject to license terms.
 */
package de.schlichtherle.license;

import java.rmi.Remote;

/**
 * Provides remote license creation services.
 *
 * @author Christian Schlichtherle
 */
public interface LicenseCreator extends Remote {

    /**
     * Initializes and validates the license content, creates a new signed
     * license certificate for it and compresses, encrypts and returns it
     * as a license key.
     * <p>
     * As a side effect, the given license {@code content} may be initialized
     * with some reasonable defaults unless the respective properties have
     * already been set.
     *
     * @param content The license content
     *        - may <em>not</em> be {@code null}.
     *
     * @return The license key
     *         - {@code null} is never returned.
     *
     * @throws Exception An instance of a subclass of this class for various
     *         reasons.
     *         Note that you should always use
     *         {@link Throwable#getLocalizedMessage()} to get a (possibly
     *         localized) meaningful detail message.
     */
    byte[] create(LicenseContent content) throws Exception;
}
