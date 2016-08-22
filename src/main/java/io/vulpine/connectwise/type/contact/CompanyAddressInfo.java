package io.vulpine.connectwise.type.contact;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import io.vulpine.connectwise.type.ConnectwiseCommon;

@SuppressWarnings( "unused" )
public class CompanyAddressInfo extends ConnectwiseCommon
{
  @JacksonXmlProperty( localName = "AddressLine1" )
  protected String addressLine1;

  @JacksonXmlProperty( localName = "AddressLine2" )
  protected String addressLine2;

  @JacksonXmlProperty( localName = "City" )
  protected String city;

  @JacksonXmlProperty( localName = "State" )
  protected String state;

  @JacksonXmlProperty( localName = "Zip" )
  protected String zip;

  @JacksonXmlProperty( localName = "Country" )
  protected String country;

  public String getAddressLine1 ()
  {
    return addressLine1;
  }

  public void setAddressLine1 ( String addressLine1 )
  {
    this.addressLine1 = addressLine1;
  }

  public String getAddressLine2 ()
  {
    return addressLine2;
  }

  public void setAddressLine2 ( String addressLine2 )
  {
    this.addressLine2 = addressLine2;
  }

  public String getCity ()
  {
    return city;
  }

  public void setCity ( String city )
  {
    this.city = city;
  }

  public String getState ()
  {
    return state;
  }

  public void setState ( String state )
  {
    this.state = state;
  }

  public String getZip ()
  {
    return zip;
  }

  public void setZip ( String zip )
  {
    this.zip = zip;
  }

  public String getCountry ()
  {
    return country;
  }

  public void setCountry ( String country )
  {
    this.country = country;
  }
}
