/*
 * Copyright (C) 2012 Pavel Stastny
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
/**
 * 
 */
package cz.incad.kramerius.statistics.impl;

import junit.framework.Assert;

import org.antlr.stringtemplate.StringTemplate;
import org.junit.Test;

/**
 * @author pavels
 *
 */
public class DurationReportOnlyPidsTest {

    @Test
    public void testTemplate() {
        StringTemplate statRecord = DatabaseStatisticsAccessLogImpl.stGroup.getInstanceOf("selectPidReport");
        statRecord.setAttribute("action", "PDF");
        statRecord.setAttribute("pids", new String[] {"uuid:1","uuid:2","uuid:3","uuid:4"});
        System.out.println(statRecord.toString());
        Assert.assertNotNull(statRecord.toString());

        statRecord = DatabaseStatisticsAccessLogImpl.stGroup.getInstanceOf("selectPidReport");
        statRecord.setAttribute("action", null);
        statRecord.setAttribute("pids", new String[] {"uuid:1","uuid:2","uuid:3","uuid:4"});
        System.out.println(statRecord.toString());
        Assert.assertNotNull(statRecord.toString());
        
    }
}
