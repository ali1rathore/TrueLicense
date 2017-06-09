/*
 * Copyright (C) 2005-2015 Schlichtherle IT Services.
 * All rights reserved. Use is subject to license terms.
 */
package de.schlichtherle.license;

import de.schlichtherle.util.ObfuscatedString;

/**
 * @author Christian Schlichtherle
 * @version $Id$
 */
public class IllegalPasswordException extends IllegalArgumentException {
    private static final long serialVersionUID = 1L;

    public String getLocalizedMessage() {
        return Resources.getString(new ObfuscatedString(new long[] {
            0xAB863F4C6B6EB259L, 0x40C8776423443909L, 0xF1BA739EBF91FAF8L,
            0xE8AFA8114E385C8CL
        }).toString()); /* => "exc.policy.IllegalPwd" */
    }
}
