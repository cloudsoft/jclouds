/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jclouds.openstack.keystone.v3.suppliers;

import javax.inject.Inject;

import org.jclouds.javax.annotation.Nullable;
import org.jclouds.location.suppliers.RegionIdToURISupplier;
import org.jclouds.openstack.keystone.v3.domain.Token;
import org.jclouds.openstack.keystone.v3.functions.EndpointToRegion;
import org.jclouds.openstack.keystone.v3.functions.EndpointToSupplierURI;

import com.google.common.base.Supplier;
import com.google.inject.assistedinject.Assisted;

public class RegionIdToURIFromTokenForTypeAndVersion extends LocationIdToURIFromTokenForTypeAndVersion implements
         RegionIdToURISupplier {

   @Inject
   public RegionIdToURIFromTokenForTypeAndVersion(Supplier<Token> tokenSupplier,
                                                  EndpointToSupplierURI endpointToSupplierURI, EndpointToRegion endpointToRegion,
                                                  @Assisted("apiType") String apiType, @Nullable @Assisted("apiVersion") String apiVersion) {
      super(tokenSupplier, endpointToSupplierURI, endpointToRegion, apiType, apiVersion);
   }

   @Override
   public String toString() {
      return "RegionIdToURIFromTokenForTypeAndVersion(" + apiType + ", " + apiVersion + ")";
   }
}
