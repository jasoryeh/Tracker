package tc.oc.tracker.damage;

import com.google.common.base.Preconditions;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import org.bukkit.entity.Explosive;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;
import tc.oc.tracker.base.AbstractDamageInfo;

public class ExplosiveDamageInfo extends AbstractDamageInfo {

  protected Explosive explosive;

  public ExplosiveDamageInfo(@Nonnull Explosive explosive, @Nullable LivingEntity resolvedDamager) {
    super(resolvedDamager);
    this.explosive = Preconditions.checkNotNull(explosive);
  }

  public
  @Nonnull
  Explosive getExplosive() {
    return this.explosive;
  }

  @Override
  public
  @Nonnull
  String toString() {
    return "ExplosiveDamageInfo{explosive=" + this.explosive + ",damager=" + this.resolvedDamager
        + "}";
  }

  @Override
  public
  @Nonnull
  DamageCause getDamageCause() {
    return DamageCause.ENTITY_ATTACK;
  }
}
