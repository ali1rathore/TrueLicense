/*
 * Copyright (C) 2005-2015 Schlichtherle IT Services.
 * All rights reserved. Use is subject to license terms.
 */
package de.schlichtherle.license;

import java.io.IOException;
import java.io.InputStream;

/**
 * Configures access parameters for a {@link java.security.KeyStore} which
 * holds the private and public keys to sign and verify a
 * {@link de.schlichtherle.xml.GenericCertificate} by the {@link LicenseNotary}.
 * All methods in this class should return constant references when called
 * multiple times because the return values might get cached.
 * <p>
 * <b>Note:</b> To protect your application against reverse engineering
 * and thus reduce the risk to compromise the privacy of your passwords,
 * it is highly recommended to obfuscate all JAR files which contain class
 * files that implement this interface with a tool like e.g.
 * <a href="http://proguard.sourceforge.net/">ProGuard</a>.
 *
 * @author Christian Schlichtherle
 */
public interface KeyStoreParam {

    /**
     * Returns an input stream for reading the keystore.
     * 
     * @return An input stream for reading the keystore
     * - {@code null} is never returned.
     * @throws IOException If the key store cannot get opened.
     */
    InputStream getStream() throws IOException;

    /**
     * Returns the alias for the key entry in the key store.
     * 
     * @return The alias for the key entry in the key store
     * - {@code null} is never returned.
     */
    String getAlias();

    /**
     * Returns the password for the keystore.
     * <p>
     * Note that the {@link Policy} class provides additional constraints
     * for the returned password.
     *
     * @return The password for the keystore
     * - {@code null} is never returned.
     * @see Policy#checkPwd(String)
     */
    String getStorePwd();

    /**
     * Returns the password for the private key in the keystore.
     * This password is <em>only</em> required to sign a
     * {@code GenericCertificate} and must be {@code null} in your
     * client application (the one which just needs to install or verify
     * license certificates rather than creating them).
     * The {@link LicenseNotary} class may check that there is no private
     * key in the Java key store if this password is {@code null}
     * <em>and</em> vice versa and throw an exception if you don't
     * adhere to this contract.
     * <p>
     * Note that the {@link Policy} class provides additional constraints
     * for the returned password.
     *
     * @return The password for the private key in the keystore.
     * @see Policy#checkPwd(String)
     */
    String getKeyPwd();
}
