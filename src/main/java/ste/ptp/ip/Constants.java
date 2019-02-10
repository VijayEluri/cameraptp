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
package ste.ptp.ip;

/**
 *
 */
public interface Constants {
    public final static int INIT_COMMAND_REQUEST = 0x00000001;
    public final static int INIT_COMMAND_ACK     = 0x00000002;
    public final static int INIT_EVENT_REQUEST   = 0x00000003;
    public final static int INIT_EVENT_ACK       = 0x00000004;
    public final static int INIT_COMMAND_FAIL    = 0x00000005;
    public final static int OPERATION_REQUEST    = 0x00000006;
}
