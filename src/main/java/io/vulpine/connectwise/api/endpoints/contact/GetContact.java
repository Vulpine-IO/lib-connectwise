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
package io.vulpine.connectwise.api.endpoints.contact;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import io.vulpine.connectwise.api.common.Credentials;
import io.vulpine.connectwise.api.common.request.SimpleGetRequest;
import io.vulpine.connectwise.api.def.SubApiInterface;
import io.vulpine.connectwise.api.endpoints.Endpoint;

public class GetContact extends SimpleGetRequest < io.vulpine.connectwise.type.contact.Contact >
{
  public GetContact( Credentials credentials, XmlMapper xmlMapper, SubApiInterface api, int id )
  {
    super(credentials, xmlMapper, api, Endpoint.CONTACT, id, GetContactResponse.class);
  }

  @Override
  public String getRootName()
  {
    return "GetContact";
  }
}
