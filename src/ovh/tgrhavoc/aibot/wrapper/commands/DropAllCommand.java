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
package ovh.tgrhavoc.aibot.wrapper.commands;

import ovh.tgrhavoc.aibot.world.entity.MainPlayerEntity;
import ovh.tgrhavoc.aibot.world.item.PlayerInventory;
import ovh.tgrhavoc.aibot.wrapper.MinecraftBotWrapper;

public class DropAllCommand extends AbstractCommand {

	public DropAllCommand(MinecraftBotWrapper bot) {
		super(bot, "dropall", "Drop all items in inventory");
	}

	@Override
	public void execute(String[] args) {
		MainPlayerEntity player = bot.getPlayer();
		PlayerInventory inventory = player.getInventory();
		for(int slot = 0; slot < 40; slot++) {
			if(inventory.getItemAt(slot) != null) {
				inventory.selectItemAt(slot, true);
				inventory.dropSelectedItem();
			}
		}
		inventory.close();
		controller.say("Dropped all items!");
	}
}
