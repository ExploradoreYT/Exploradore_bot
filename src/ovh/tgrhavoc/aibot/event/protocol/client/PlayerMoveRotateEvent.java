/*******************************************************************************
 *     Copyright (C) 2015 Jordan Dalton (jordan.8474@gmail.com)
 *
 *     This program is free software; you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation; either version 2 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License along
 *     with this program; if not, write to the Free Software Foundation, Inc.,
 *     51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 *******************************************************************************/
package ovh.tgrhavoc.aibot.event.protocol.client;

import ovh.tgrhavoc.aibot.world.entity.MainPlayerEntity;

public class PlayerMoveRotateEvent extends PlayerUpdateEvent {
	public PlayerMoveRotateEvent(MainPlayerEntity entity) {
		super(entity);
	}

	public PlayerMoveRotateEvent(MainPlayerEntity entity, double x, double y, double z, double yaw, double pitch) {
		super(entity, x, y, z, yaw, pitch, entity.isOnGround());
	}

	public PlayerMoveRotateEvent(MainPlayerEntity entity, double x, double y, double z, double yaw, double pitch, boolean onGround) {
		super(entity, x, y, z, yaw, pitch, onGround);
	}
}
