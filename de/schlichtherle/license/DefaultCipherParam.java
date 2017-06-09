/*
 * Copyright (C) 2005-2015 Schlichtherle IT Services.
 * All rights reserved. Use is subject to license terms.
 */
package de.schlichtherle.license;

/**
 * This is a convenience class implementing the {@link CipherParam} interface.
 *
 * @author Christian Schlichtherle
 * @version $Id$
 */
public class DefaultCipherParam implements CipherParam {
    
    private final String keyPwd;
    
    /**
     * Creates a new instance of DefaultCipherParam using the given password
     * to be returned by {@link #getKeyPwd()}.
     */
    public DefaultCipherParam(String keyPwd) {
        this.keyPwd = keyPwd;
    }

    public String getKeyPwd() {
        return keyPwd;
    }
}
