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
package io.vulpine.connectwise.api.agreement;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import io.vulpine.connectwise.api.common.ApiDivision;
import io.vulpine.connectwise.api.def.SubApiInterface;
import io.vulpine.connectwise.api.agreement.addOrUpdate.*;
import io.vulpine.connectwise.api.request.Credentials;
import io.vulpine.connectwise.type.agreement.Agreement;
import io.vulpine.connectwise.type.agreement.addition.Addition;

public class AddOrUpdate extends ApiDivision
{
  public AddOrUpdate ( Credentials credentials, XmlMapper mapper, SubApiInterface api )
  {
    super(credentials, mapper, api);
  }

  public AddOrUpdateAgreement agreement()
  {
    return new AddOrUpdateAgreement(credentials, mapper, api, new Agreement());
  }

  public AddOrUpdateAgreement agreement( final Agreement agreement )
  {
    return new AddOrUpdateAgreement(credentials, mapper, api, agreement);
  }

  public AddOrUpdateAgreementAddition addition()
  {
    return new AddOrUpdateAgreementAddition(credentials, mapper, api, new Addition());
  }

  public AddOrUpdateAgreementAddition addition( final Addition addition )
  {
    return new AddOrUpdateAgreementAddition(credentials, mapper, api, addition);
  }

  public AddOrUpdateAgreementAdjustment adjustment()
  {
    return new AddOrUpdateAgreementAdjustment();
  }

  public AddOrUpdateAgreementSite site()
  {
    return new AddOrUpdateAgreementSite();
  }

  public AddOrUpdateAgreementWorkRole workRole()
  {
    return new AddOrUpdateAgreementWorkRole();
  }

  public AddOrUpdateAgreementWorkType workType()
  {
    return new AddOrUpdateAgreementWorkType();
  }
}
