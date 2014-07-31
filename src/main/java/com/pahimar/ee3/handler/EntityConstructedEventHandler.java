package com.pahimar.ee3.handler;

import com.pahimar.ee3.data.EERExtendedPlayer;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.EntityEvent.EntityConstructing;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class EntityConstructedEventHandler 
{
	@SubscribeEvent
	public void onEntityConstructing(EntityConstructing event)
	{
		if (event.entity instanceof EntityPlayer && EERExtendedPlayer.get((EntityPlayer) event.entity) == null)
		{
			EERExtendedPlayer.register((EntityPlayer) event.entity);
		}
		
	}

}