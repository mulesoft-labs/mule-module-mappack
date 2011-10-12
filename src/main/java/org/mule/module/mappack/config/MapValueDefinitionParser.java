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

import org.mule.config.spring.parsers.generic.ChildDefinitionParser;

public class MapValueDefinitionParser extends ChildDefinitionParser
{
    public MapValueDefinitionParser(String setterMethod, Class<?> clazz)
    {
        super(setterMethod, clazz);
        this.addAlias("map-name", "mapName");
        this.addAlias("map-key", "mapKey");
        this.addAlias("default-value", "defaultValue");
        this.addAlias("not-string", "notString");
    }
}
