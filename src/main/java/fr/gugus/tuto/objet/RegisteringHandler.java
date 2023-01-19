package fr.gugus.tuto.objet;

import fr.gugus.tuto.objet.block.TutoBlock;
import fr.gugus.tuto.objet.item.TutoItems;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class RegisteringHandler {
	
	@SubscribeEvent
	public void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(TutoBlock.BLOCK_TUTO);
	}
	
	@SubscribeEvent
	public void registerItem(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(TutoItems.ITEM_TUTO, TutoItems.BLOCK_BLOCKTUTO_ITEM);
	}

}
