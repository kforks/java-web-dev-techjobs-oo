package org.launchcode.techjobs_oo;

import java.util.Objects;

public class PositionType extends JobField {

    public PositionType() {
        super();
    }

    public PositionType(String value) {
        super(value);
    }


    @Override
    public boolean equals(Object obj) {  // Two objects are equal if they have the same id.
        if (this == obj) return true;
        if (!(obj instanceof PositionType)) return false;
        PositionType position = (PositionType) obj;
        return getId() == position.getId();
    }

}
