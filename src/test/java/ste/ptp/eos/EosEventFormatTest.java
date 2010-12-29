/* Copyright 2010 by Stefano Fornari
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */

package ste.ptp.eos;

import junit.framework.TestCase;

/**
 *
 * @author ste
 */
public class EosEventFormatTest extends TestCase {

    private EosEvent e;
    
    public EosEventFormatTest(String testName) {
        super(testName);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testFormat() {
        EosEvent e = new EosEvent();
        
        e.setCode(EosEventConstants.EosEventPropValueChanged);
        e.setParam(1, EosEventConstants.EosPropAperture);
        e.setParam(2, 0x001D);

        String msg = EosEventFormat.format(e);

        assertTrue(msg.indexOf("EosEventPropValueChanged") >= 0);
        assertTrue(msg.indexOf("EosPropAperture") >= 0);
        assertTrue(msg.indexOf("29") >= 0);

        e.setCode(EosEventConstants.EosEventPropValueChanged);
        e.setParam(1, EosEventConstants.EosPropISOSpeed);
        e.setParam(2, 0x0068);

        msg = EosEventFormat.format(e);
        
        assertTrue(msg.indexOf("EosEventPropValueChanged") >= 0);
        assertTrue(msg.indexOf("EosPropISOSpeed") >= 0);
        assertTrue(msg.indexOf("104") >= 0);
    }

}
