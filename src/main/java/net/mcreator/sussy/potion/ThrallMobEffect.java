
package net.mcreator.sussy.potion;

public class ThrallMobEffect extends MobEffect {
	public ThrallMobEffect() {
		super(MobEffectCategory.HARMFUL, -13434880);
	}

	@Override
	public String getDescriptionId() {
		return "effect.sussy.thrall";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}