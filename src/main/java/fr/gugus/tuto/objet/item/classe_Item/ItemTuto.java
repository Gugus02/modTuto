package fr.gugus.tuto.objet.item.classe_Item;

import fr.gugus.tuto.objet.item.TutoItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemTuto extends Item {
	
	public static final String Name = "item_tuto";
	
	public ItemTuto(){
		
		super();
		
		TutoItems.setItemName(this, Name);
		setCreativeTab(CreativeTabs.MISC);
		
	}
	
}
