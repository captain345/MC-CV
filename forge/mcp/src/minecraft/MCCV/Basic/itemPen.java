package MCCV.Basic;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
//current code is just for practice ignore for now 
//this will contain the information on the tools we'll use i'd like to add a pen and paper or something similar
public class itemPen extends Item {
	
	
	public itemPen(int id){
		super(id);
		setMaxStackSize(64);
		setCreativeTab(CreativeTabs.tabMisc);
		setUnlocalizedName("itemPen");
	}
	//practice code below so please ignore	
	@Override
	public boolean itemInteractionForEntity(ItemStack itemstack, EntityPlayer player, EntityLivingBase target){
			if(!target.worldObj.isRemote){
				
			}
			
		return false;
			
		}

}


