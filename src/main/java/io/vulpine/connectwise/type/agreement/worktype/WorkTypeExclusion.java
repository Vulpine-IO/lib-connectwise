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

package io.vulpine.connectwise.type.agreement.worktype;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@SuppressWarnings( "unused" )
@JacksonXmlRootElement( localName = "GetAgreementWorkTypeExclusionResult" )
public class WorkTypeExclusion extends WorkTypeCommon
{
  @JacksonXmlProperty( localName = "AddAllWorkTypes" )
  protected boolean addAllWorkTypes;

  @JacksonXmlProperty( localName = "RemoveAllWorkTypes" )
  protected boolean removeAllWorkTypes;

  public boolean isAddAllWorkTypes()
  {
    return addAllWorkTypes;
  }

  public void setAddAllWorkTypes( boolean addAllWorkTypes )
  {
    this.addAllWorkTypes = addAllWorkTypes;
  }

  public boolean isRemoveAllWorkTypes()
  {
    return removeAllWorkTypes;
  }

  public void setRemoveAllWorkTypes( boolean removeAllWorkTypes )
  {
    this.removeAllWorkTypes = removeAllWorkTypes;
  }
}
