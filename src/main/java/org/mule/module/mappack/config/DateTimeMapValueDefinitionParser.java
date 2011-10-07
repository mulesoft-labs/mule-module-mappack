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

public class DateTimeMapValueDefinitionParser extends MapValueDefinitionParser
{
    public DateTimeMapValueDefinitionParser(Class<?> clazz)
    {
        super("mapvalue", clazz);
        this.addAlias("date-format-in", "dateFormatIn");
        this.addAlias("date-format-out", "dateFormatOut");
    }
}
