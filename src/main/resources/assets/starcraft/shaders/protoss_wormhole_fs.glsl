#version 120

in vec3 color;

out vec3 out_Color;

void main(void) {
	out_Color = vec4(color, 1.0);
}