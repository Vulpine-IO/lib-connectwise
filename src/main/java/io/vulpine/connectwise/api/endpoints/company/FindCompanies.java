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

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import io.vulpine.connectwise.api.def.SubApiInterface;
import io.vulpine.connectwise.api.common.Credentials;
import io.vulpine.connectwise.api.common.request.FindRequest;
import io.vulpine.connectwise.api.endpoints.Endpoint;
import io.vulpine.connectwise.type.company.FoundCompany;

import java.io.IOException;
import java.util.List;

@JacksonXmlRootElement ( localName = "FindCompanies" )
public class FindCompanies extends FindRequest < List < FoundCompany > >
{
  public FindCompanies( Credentials credentials, XmlMapper xmlMapper, SubApiInterface api )
  {
    super(credentials, xmlMapper, api, Endpoint.COMPANY);
  }

  @Override
  public List < FoundCompany > submit () throws IOException
  {
    this.logger.trace(this.getClass());
    return submit(FindCompanyResponse.class);
  }
}
