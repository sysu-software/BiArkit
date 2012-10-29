/*
 * Copyright (c) 2012 Clark & Parsia, LLC. <http://www.clarkparsia.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * Provides core classes and interfaces for libSBOL.
 */
// an annotation to make sure the class file is created for this source file so ant won't compile this file every time
@javax.annotation.Generated(value={})
// an annotation to bind namespace prefixes
@XmlSchema(
        namespace = "http://sbol.org/v1#",
        xmlns = { @XmlNs(prefix = "rdf", namespaceURI = "http://www.w3.org/1999/02/22-rdf-syntax-ns#")})
package org.sbolstandard.core;

import javax.xml.bind.annotation.XmlNs;
import javax.xml.bind.annotation.XmlSchema;