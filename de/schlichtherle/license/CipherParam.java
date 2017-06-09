/*
 * Copyright (C) 2005-2015 Schlichtherle IT Services.
 * All rights reserved. Use is subject to license terms.
 */
package de.schlichtherle.license;

/**
 * Configures parameters for the PKCS-5 algorithm used to encrypt/decrypt a
 * compressed, signed {@link de.schlichtherle.xml.GenericCertificate}.
 * This interface is used by the {@link LicenseManager} to perform the
 * encryption/decyrption of license keys.
 * <p>
 * <b>Note:</b> To protect your application against reverse engineering
 * and thus reduce the risk to compromise the privacy of your passwords,
 * it is highly recommended to obfuscate all JAR files which contain class
 * files that implement this interface with a tool like
 * <a href="http://proguard.sourceforge.net/">ProGuard</a>.
 *
 * @author Christian Schlichtherle
 */
public interface CipherParam {

    /**
     * Returns the password used to generate a secret key for the
     * encryption/decryption of license keys.
     * - {@code null} is never returned.
     * <p>
     * Note that the {@link Policy} class provides additional constraints
     * for the returned password.
     *
     * @return The password used to generate a secret key for the
     *         encryption/decryption of license keys.
     * @see Policy#checkPwd(String)
     */
    String getKeyPwd();
}
