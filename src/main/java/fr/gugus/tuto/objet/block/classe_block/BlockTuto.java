package fr.gugus.tuto.objet.block.classe_block;

import fr.gugus.tuto.objet.block.TutoBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockTuto extends Block {

	public static final String Name = "block_tuto";
	
	public BlockTuto(Material material) {
		
		super(material);
		
		TutoBlock.setBlockName(this, Name);
		setResistance(5.0F);
		setHardness(3.0F);
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		
	}

}
