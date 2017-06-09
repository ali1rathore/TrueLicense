/*
 * Copyright (C) 2005-2015 Schlichtherle IT Services.
 * All rights reserved. Use is subject to license terms.
 */
package de.schlichtherle.license;

import de.schlichtherle.util.ObfuscatedString;

/**
 * Thrown if and only if a license is to be verified using
 * {@link LicenseManager#verify()} and no license is installed.
 *
 * @author Christian Schlichtherle
 * @version $Id$
 */
public class NoLicenseInstalledException extends java.lang.Exception {
    private static final long serialVersionUID = 1L;

    private static final String EXC_NO_LICENSE_INSTALLED = new ObfuscatedString(new long[] {
        0x4E3A1D690A6899DEL, 0xF4EB1546CB69D2C6L, 0x2A6262DBA2AC86DBL,
        0xC3C9B45280715D5L}).toString(); /* => "exc.noLicenseInstalled" */

    /**
     * Constructs an instance of {@code NoLicenseInstalled} for the
     * given licensing subject.
     *
     * @param subject The licensing subject as specified in
     *        {@link LicenseParam#getSubject()}
     *        - may <em>not</em> be {@code null}.
     */
    public NoLicenseInstalledException(String subject) {
        super(subject);
    }

    public String getLocalizedMessage() {
        return Resources.getString(EXC_NO_LICENSE_INSTALLED, super.getMessage());
    }
}
