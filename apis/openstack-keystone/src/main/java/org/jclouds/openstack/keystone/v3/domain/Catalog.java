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
package org.jclouds.openstack.keystone.v3.domain;

import java.util.List;

import org.jclouds.json.SerializedNames;

import com.google.auto.value.AutoValue;
import com.google.common.collect.ImmutableList;

@AutoValue
public abstract class Catalog {

   public abstract String id();

   public abstract String name();

   public abstract String type();

   public abstract List<Endpoint> endpoints();

   @SerializedNames({"id", "name", "type", "endpoints"})
   public static Catalog create(String id,
                                String name,
                                String type,
                                List<Endpoint> endpoints
   ) {
      return new AutoValue_Catalog(id, name, type, endpoints == null ? ImmutableList.<Endpoint>of() : ImmutableList.copyOf(endpoints));
   }

   Catalog() {
   }
}
