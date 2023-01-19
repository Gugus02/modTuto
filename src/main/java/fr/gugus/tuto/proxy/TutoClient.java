package fr.gugus.tuto.proxy;

import java.io.File;

public class TutoClient extends TutoCommon{
	
	@Override
	public void preInit(File configFile){
		
		
		super.preInit(configFile);
		System.out.print("pre init côté client");
		
	}
	
	@Override
	public void init(){
		
		super.init();
		
	}
	
}
