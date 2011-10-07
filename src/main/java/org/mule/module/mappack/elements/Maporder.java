/*
 * $Id:$
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.mule.module.mappack.elements;

public class Maporder
{
    public String parentMap = null;
    public String childMap = null;


    public String getParentMap()
    {
        return parentMap;
    }

    public void setParentMap(String parentMap)
    {
        this.parentMap = parentMap;
    }

    public String getChildMap()
    {
        return childMap;
    }

    public void setChildMap(String childMap)
    {
        this.childMap = childMap;
    }

}
