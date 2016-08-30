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
package io.vulpine.connectwise.api.activity;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ActivityApi_Get_Test
{
  private ActivityApi_Get get;

  @Before
  public void setUp() throws Exception
  {
    get = new ActivityApi_Get(null, null, null);
  }

  @Test
  public void activity_does_not_return_null() throws Exception
  {
    Assert.assertNotNull(get.activity(666));
  }

  @Test
  public void activity_returns_new_instances_each_call() throws Exception
  {
    Assert.assertNotSame(get.activity(666), get.activity(666));
  }

}