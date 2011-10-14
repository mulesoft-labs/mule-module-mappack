/*
 * $Id:$
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.mule.module.mappack.config;

import org.mule.config.spring.parsers.specific.MessageProcessorDefinitionParser;
import org.mule.module.mappack.NestedMapTransformer;

public class NestedMapDefinitionParser extends MessageProcessorDefinitionParser
{
    public NestedMapDefinitionParser()
    {
        super(NestedMapTransformer.class);
        addAlias("trim-to-length", "trimToLength");
        addAlias("add-space", "addSpace");
        addAlias("single-map", "singleMap");
        addAlias("to-list", "toList");
        addAlias("to-object-list", "toObjectList");
        addAlias("skip-top", "skipTop");
    }
}
