package ga.scmc.api;

import ga.scmc.enums.EnumTeamColors;
import net.minecraft.entity.EntityLiving;

public interface IEntityTeamColorable<T extends EntityLiving> {

    EnumTeamColors getTeamColor();

    T setTeamColor(EnumTeamColors team);

}
