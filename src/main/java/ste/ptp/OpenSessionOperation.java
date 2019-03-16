/* Copyright 2019 by Stefano Fornari
//
// This program is free software; you can redistribute it and/or modify
// it under the terms of the GNU General Public License as published by
// the Free Software Foundation; either version 2 of the License, or
// (at your option) any later version.
//
// This program is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU General Public License for more details.
//
// You should have received a copy of the GNU General Public License
// along with this program; if not, write to the Free Software
// Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
*/
package ste.ptp;

/**
 *
 * @author ste
 */
public class OpenSessionOperation extends Operation {

    public final int session;

    public OpenSessionOperation() {
        this(0);
    }


    public OpenSessionOperation(int session) {
        super(Command.OpenSession);
        this.session = session;
    }

    @Override
    public int[] getParams() {
        return new int[] { session };
    }
}
