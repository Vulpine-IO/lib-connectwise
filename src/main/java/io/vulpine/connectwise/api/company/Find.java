package io.vulpine.connectwise.api.company;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import io.vulpine.connectwise.api.ApiDivision;
import io.vulpine.connectwise.api.ConnectwiseSubApiInterface;
import io.vulpine.connectwise.api.company.find.FindCompany;
import io.vulpine.connectwise.api.request.Credentials;

public class Find extends ApiDivision
{
  public Find ( final Credentials credentials, final XmlMapper mapper, final ConnectwiseSubApiInterface api )
  {
    super(credentials, mapper, api);
  }

  /**
   * Initialize Find Company Request
   *
   * @return a new Find Company request object.
   */
  public FindCompany findCompanies ()
  {
    return new FindCompany(credentials, mapper, api);
  }
}