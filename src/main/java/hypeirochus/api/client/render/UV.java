package hypeirochus.api.client.render;

import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.Vec3d;

public class UV {
	public float	u;
	public float	v;

	public UV(float u, float v) {
		this.u = u;
		this.v = v;
	}

	public UV(EnumFacing facing, Vec3d vec3d) {
		switch (facing.getAxis()) {
		case X:
			this.u = Math.round(vec3d.zCoord * 16);
			this.v = Math.round(vec3d.yCoord * 16);
			break;
		case Y:
			this.u = Math.round(vec3d.xCoord * 16);
			this.v = Math.round(vec3d.zCoord * 16);
			break;
		case Z:
			this.u = Math.round(vec3d.xCoord * 16);
			this.v = Math.round(vec3d.yCoord * 16);
			break;
		}
	}

	public float getU() {
		return u;
	}

	public float getV() {
		return v;
	}
}