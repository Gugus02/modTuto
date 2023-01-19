package fr.gugus.tuto.proxy;

import java.io.File;

public class TutoServeur extends TutoCommon{
	
	@Override
	public void preInit(File configFile){
		
		super.preInit(configFile);
		System.out.print("pre init côté server");
		
	}
	
	@Override
	public void init(){
		
		super.init();
		
	}

}
