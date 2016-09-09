/*
 * Copyright 2016 Elizabeth Harper
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package io.vulpine.connectwise.type.company;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement( localName = "CompanyFindResult" )
public class FoundCompany extends CompanyCommon
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

  @JacksonXmlProperty( localName = "Website" )
  protected String website;

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

  public String getWebsite ()
  {
    return website;
  }

  public void setWebsite ( String website )
  {
    this.website = website;
  }
}
