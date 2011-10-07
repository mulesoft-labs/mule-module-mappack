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

public class TransformMapValueDefinitionParser extends MapValueDefinitionParser
{
    public TransformMapValueDefinitionParser(String setterMethod, Class<?> clazz)
    {
        super(setterMethod, clazz);
        this.addAlias("transformer-name", "transformerName");
    }
}
