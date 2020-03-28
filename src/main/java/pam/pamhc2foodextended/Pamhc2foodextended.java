package pam.pamhc2foodextended;

import javax.annotation.Nonnull;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import pam.pamhc2foodextended.init.ItemRegistry;

@Mod("pamhc2foodextended")
public class Pamhc2foodextended {
	public static final String MOD_ID = "pamhc2foodextended";
	public static final Logger LOGGER = LogManager.getLogger();
	public static final ItemGroup ITEM_GROUP = new ItemGroup("pamhc2foodextended") {
		public ItemStack createIcon() {
			return new ItemStack(ItemRegistry.ketchupitem);
		}

	};

	public Pamhc2foodextended() {
		DistExecutor.runForDist(() -> () -> new SideProxy.Client(), () -> () -> new SideProxy.Server());
	}

	@Nonnull
	public static ResourceLocation getId(String path) {
		return new ResourceLocation(MOD_ID, path);
	}

}
