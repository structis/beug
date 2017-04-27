/**
 * 
 */
package com.structis.beug.part1.exceptions;

/**
 * @author Z.DRISSI
 * 
 */
public class NegativeNumberException extends RuntimeException {

    /** serialVersionUID */
    private static final long serialVersionUID = 6858715727984561552L;

    public NegativeNumberException(final String message) {
        super(message);
    }

}
