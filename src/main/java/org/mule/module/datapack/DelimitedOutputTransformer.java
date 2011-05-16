/*
 * $Id:$
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.mule.module.datapack;

import org.mule.api.MuleMessage;
import org.mule.api.expression.ExpressionManager;
import org.mule.api.lifecycle.InitialisationException;
import org.mule.api.transformer.TransformerException;
import org.mule.module.datapack.columns.Column;
import org.mule.module.datapack.i18n.FlatPackMessages;
import org.mule.transformer.AbstractMessageTransformer;
import org.mule.util.TemplateParser;

import java.util.List;

public class DelimitedOutputTransformer extends AbstractMessageTransformer
{
    private List<Column> columns;
    private String newlineChar = "\n";
    private String delimiterChar = ",";
    private Boolean trimToLength = false;

    protected TemplateParser.PatternInfo patternInfo = TemplateParser.createMuleStyleParser().getStyle();

    protected ExpressionManager expressionManager;

    @Override
    public void initialise() throws InitialisationException
    {
        super.initialise();

        expressionManager = muleContext.getExpressionManager();
    }

    @Override
    public Object transformMessage(MuleMessage message, String outputEncoding) throws TransformerException
    {
        if (columns == null || columns.size() == 0)
        {
            throw new TransformerException(FlatPackMessages.NoColumnsDefinedMessage());
        }

        StringBuilder output = new StringBuilder();

        for (int i = 0; i < columns.size(); i++)
        {
            Column column = columns.get(i);
            String value = column.evaluateColumn(message,  muleContext, expressionManager, patternInfo);

            if (column.getLength() != null && trimToLength)
            {
                int length = Integer.parseInt(column.getLength());
                output.append(value.substring(0, length));
            }
            else
            {
                output.append(value);
            }

            // Only put the delimiter on everything but the last column.
            if (i < columns.size() - 1)
            {
                output.append(delimiterChar);
            }
        }

        output.append(newlineChar);

        return output.toString();
    }


    public List<Column> getColumns()
    {
        return columns;
    }

    public void setColumns(List<Column> columns)
    {
        this.columns = columns;
    }

    public String getNewlineChar()
    {
        return newlineChar;
    }

    public void setNewlineChar(String newlineChar)
    {
        this.newlineChar = newlineChar;
    }

    public String getDelimiterChar()
    {
        return delimiterChar;
    }

    public void setDelimiterChar(String delimiterChar)
    {
        this.delimiterChar = delimiterChar;
    }

    public Boolean getTrimToLength()
    {
        return trimToLength;
    }

    public void setTrimToLength(Boolean trimToLength)
    {
        this.trimToLength = trimToLength;
    }
}