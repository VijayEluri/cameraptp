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
public class EosEventTest extends TestCase {
    
    public EosEventTest(String testName) {
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

    public void testCode() {
        EosEvent e = new EosEvent();

        e.setCode(0x10);
        assertEquals(0x10, e.getCode());
    }

    public void testParam1() {
        EosEvent e = new EosEvent();

        e.setParam(1, (int)0x11);
        assertEquals(0x11, e.getIntParam(1));
    }

    public void testParam2() {
        EosEvent e = new EosEvent();

        e.setParam(2, (int)0x12);
        assertEquals(0x12, e.getIntParam(2));
    }
}
