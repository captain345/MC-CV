package MCCV.Basic;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid="MCCV", name="Minecraft CV Modification", version="0.0.1")
@NetworkMod(clientSideRequired=true)
public class GenericMod {

        // The instance of your mod that Forge uses.
        @Instance(value = "MCCV")
        public static Generic instance;
        
        // Says where the client and server 'proxy' code is loaded.
        @SidedProxy(clientSide="MCCV.basic.ClientProxy", serverSide="MCCV.basic.CommonProxy")
        public static CommonProxy proxy;
        
        @EventHandler // used in 1.6.2
        public void preInit(FMLPreInitializationEvent event) {
                // Stub Method
        }
        
        @EventHandler // used in 1.6.2
        public void load(FMLInitializationEvent event) {
                proxy.registerRenderers();
        }
        
        @EventHandler // used in 1.6.2
        public void postInit(FMLPostInitializationEvent event) {
                // Stub Method
        }
}