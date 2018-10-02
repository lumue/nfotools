package io.github.lumue.nfotools;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import java.io.Serializable;

/**
 * Created by lm on 06.12.15.
 */
@XmlAccessorType(XmlAccessType.FIELD)
class Fileinfo implements Serializable {

    @XmlElement
    private String streamdetails="";

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Fileinfo that = (Fileinfo) o;

        return streamdetails != null ? streamdetails.equals(that.streamdetails) : that.streamdetails == null;

    }

    @Override
    public int hashCode() {
        return streamdetails != null ? streamdetails.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Fileinfo{" +
                "streamdetails='" + streamdetails + '\'' +
                '}';
    }
}
