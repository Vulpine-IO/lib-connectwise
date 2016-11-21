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
 */

package io.vulpine.connectwise.api.endpoints.company;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import io.vulpine.connectwise.api.common.ResponseData;
import io.vulpine.connectwise.type.company.SimpleFoundCompany;

import java.util.List;

@JacksonXmlRootElement( localName = "FindCompaniesResponse" )
public class FindCompanyResponse extends ResponseData < List < SimpleFoundCompany > >
{
  @JsonCreator
  public FindCompanyResponse(
    @JacksonXmlProperty( localName = "FindCompaniesResult" ) final List < SimpleFoundCompany > results
  )
  {
    super(results);
  }
}
