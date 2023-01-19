package fr.gugus.tuto.objet.item;

import fr.gugus.tuto.modTuto;
import fr.gugus.tuto.objet.block.TutoBlock;
import fr.gugus.tuto.objet.item.classe_Item.ItemTuto;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@EventBusSubscriber(value = Side.CLIENT, modid = modTuto.MODID)
public class TutoItems {
	
	public static final Item ITEM_TUTO = new ItemTuto();
	
	public static final Item BLOCK_BLOCKTUTO_ITEM = new ItemBlock(TutoBlock.BLOCK_TUTO).setRegistryName(TutoBlock.BLOCK_TUTO.getRegistryName());
	
	public static void setItemName(Item item, String name) {
		
		item.setRegistryName(modTuto.MODID, name).setUnlocalizedName(modTuto.MODID + "." + name);
		
	}
	
	@SideOnly(Side.CLIENT)
	@SubscribeEvent
	public static void registerItemModels(ModelRegistryEvent event) {
		
		registerModel(ITEM_TUTO, 0);
		registerModel(BLOCK_BLOCKTUTO_ITEM, 0);
		
	}
	
	@SideOnly(Side.CLIENT)
	public static void registerModel(Item item, int metadata) {
		
		if (metadata < 0) metadata = 0;
		String resourceName = item.getUnlocalizedName().substring(5).replace('.', ':');
		if (metadata > 0) resourceName += "_m" + String.valueOf(metadata);
		
		ModelLoader.setCustomModelResourceLocation(item, metadata, new ModelResourceLocation(resourceName, "inventory"));
		
	}
	
}
