package MCCV.Basic;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
 
@Mod(modid="MC-CV", name="Minecraft CV Modification", version="0.0.1")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class mccvBase {
 
		private final static Item itemPen = new Item(5000);
        // The instance of your mod that Forge uses.
		@Instance("MC-CV")
        public static mccvBase instance;
       
        // Says where the client and server 'proxy' code is loaded.
        @SidedProxy(clientSide="MCCV.Basic.client.ClientProxy", serverSide="MCCV.Basic.CommonProxy")
        public static CommonProxy proxy;
       
        @EventHandler
        public void preInit(FMLPreInitializationEvent event) {
                // Stub Method
        }//end of preInit
       
        @EventHandler
        public void load(FMLInitializationEvent event) {
                proxy.registerRenderers();
                
                MinecraftForge.EVENT_BUS.register(new ChatEventHook());
                
        }//end of load 
       
        @EventHandler
        public void postInit(FMLPostInitializationEvent event) {
                // Stub Method
        }//end of postInit
       
}