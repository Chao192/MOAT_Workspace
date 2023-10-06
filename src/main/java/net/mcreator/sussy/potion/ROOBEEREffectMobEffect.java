
package net.mcreator.sussy.potion;

public class ROOBEEREffectMobEffect extends MobEffect {
	public ROOBEEREffectMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -10079488);
	}

	@Override
	public String getDescriptionId() {
		return "effect.sussy.roobeer_effect";
	}

	@Override
	public boolean isInstantenous() {
		return true;
	}

	@Override
	public void applyInstantenousEffect(Entity source, Entity indirectSource, LivingEntity entity, int amplifier, double health) {
		ROOBEEREffectEffectStartedappliedProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}