package io.vulpine.connectwise.type.agreement;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum ProductClass
{
  AGREEMENT("Agreement"),
  INVENTORY("Inventory"),
  NON_INVENTORY("NonInventory"),
  SERVICE("Service");

  protected final String value;

  ProductClass ( String value )
  {
    this.value = value;
  }

  @Override
  public String toString ()
  {
    return this.value;
  }

  @JsonCreator
  public static ProductClass fromString( final String value )
  {
    for ( ProductClass pro : values() ) {
      if ( pro.value.equals(value) ) {
        return pro;
      }
    }
    return null;
  }
}
