package com.tickaroo.tikxml.regressiontests.paths;

import com.tickaroo.tikxml.annotation.PropertyElement;
import com.tickaroo.tikxml.annotation.Xml;
import java.util.Objects;

/**
 * @author Hannes Dorfmann
 */
@Xml
public class Boss extends Person {
  @PropertyElement String name;

  @Override public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Boss)) return false;
    if (!super.equals(o)) return false;

    Boss boss = (Boss) o;

    return Objects.equals(name, boss.name);
  }

  @Override public int hashCode() {
    int result = super.hashCode();
    result = 31 * result + (name != null ? name.hashCode() : 0);
    return result;
  }
}
