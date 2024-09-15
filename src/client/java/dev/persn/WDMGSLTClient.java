package dev.persn;

import net.fabricmc.api.ClientModInitializer;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class WDMGSLTClient implements ClientModInitializer {

	public static final Identifier SILKTOUCH_BREAK_ID = Identifier.of("wdmgslt:silktouch_glass_break");
    public static SoundEvent BLOCK_SILKTOUCH_BREAK = SoundEvent.of(SILKTOUCH_BREAK_ID);
	
	@Override
	public void onInitializeClient() {
		// This entrypoint is suitable for setting up client-specific logic, such as rendering.
		Registry.register(Registries.SOUND_EVENT, WDMGSLTClient.SILKTOUCH_BREAK_ID, BLOCK_SILKTOUCH_BREAK);

	}
}