package fr.gugus.tuto;

import org.apache.logging.log4j.Logger;

import fr.gugus.tuto.objet.RegisteringHandler;
import fr.gugus.tuto.proxy.TutoCommon;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = modTuto.MODID, name = "Mod Tuto", version = "1.0", acceptedMinecraftVersions = "[1.12.2]")
public class modTuto {
	
	public static final String MODID = "modtuto";
	
	@SidedProxy(clientSide = "fr.gugus.tuto.proxy.TutoClient", serverSide = "fr.gugus.tuto.proxy.TutoServeur")
	public static TutoCommon proxy;
	
	@Instance(modTuto.MODID)
	public static modTuto instance;
	
	public static Logger logger;
	
	public modTuto(){
		
		MinecraftForge.EVENT_BUS.register(new RegisteringHandler());
		
	}
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		
		logger = event.getModLog();
		proxy.preInit(event.getSuggestedConfigurationFile());
		
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		
		proxy.init();
		
	}
	
}
