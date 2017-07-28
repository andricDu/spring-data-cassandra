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
package org.springframework.data.cassandra.core.cql.generator;

import org.springframework.data.cassandra.core.cql.keyspace.AddColumnSpecification;

/**
 * CQL generator for generating an {@code ADD} clause of an {@code ALTER TABLE} statement.
 *
 * @author Matthew T. Adams
 * @author Mark Paluch
 * @see AddColumnSpecification
 * @see ColumnChangeCqlGenerator
 * @see org.springframework.data.cassandra.core.cql.keyspace.AlterTableSpecification
 */
public class AddColumnCqlGenerator extends ColumnChangeCqlGenerator<AddColumnSpecification> {

	public AddColumnCqlGenerator(AddColumnSpecification specification) {
		super(specification);
	}

	/* (non-Javadoc)
	 * @see org.springframework.data.cassandra.core.cql.generator.ColumnChangeCqlGenerator#toCql(java.lang.StringBuilder)
	 */
	@Override
	public StringBuilder toCql(StringBuilder cql) {
		return cql.append("ADD ").append(spec().getName()).append(' ')
				.append(spec().getType().asFunctionParameterString());
	}
}
