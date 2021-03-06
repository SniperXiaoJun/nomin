package org.nomin.entity;

import java.text.MessageFormat;

/**
 * Just represents a business entity.
 * @author Dmitry Dobrynin
 *         Created 13.04.2010 11:06:29
 */
public class LinearManager extends Employee {
    private String characteristics;

    public LinearManager() {}

    public LinearManager(String name, String last, String properties, Details details, String characteristics) {
        super(name, last, properties, details);
        this.characteristics = characteristics;
    }

    public String getCharacteristics() { return characteristics; }

    public void setCharacteristics(String characteristics) { this.characteristics = characteristics; }

    public String toString() {
        return MessageFormat.format("LinearManager [ name = {0} last = {1} details = {2} characteristics = {3}", getName(), getLast(), getDetails(), characteristics);
    }
}
