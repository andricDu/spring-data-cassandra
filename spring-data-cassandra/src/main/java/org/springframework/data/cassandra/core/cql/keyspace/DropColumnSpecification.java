/*
 * Copyright 2013-2017 the original author or authors.
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
package org.springframework.data.cassandra.core.cql.keyspace;

import org.springframework.data.cassandra.core.cql.CqlIdentifier;

/**
 * A specification to drop a column.
 *
 * @author Matthew T. Adams
 */
public class DropColumnSpecification extends ColumnChangeSpecification {

	public static DropColumnSpecification dropColumn(String name) {
		return new DropColumnSpecification(CqlIdentifier.cqlId(name));
	}

	public static DropColumnSpecification dropColumn(CqlIdentifier name) {
		return new DropColumnSpecification(name);
	}

	public DropColumnSpecification(CqlIdentifier name) {
		super(name);
	}
}
