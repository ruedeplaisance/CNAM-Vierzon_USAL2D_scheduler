package scheduler;

import java.awt.Color;
import java.util.Objects;

public class Application {
	private Color color;
	
	public Application(String color) {
		switch (color) {
		case "rouge":
			this.color = new Color(255,0,0);
			break;

		case "vert":
			this.color = new Color(0,255,0);
			break;

		case "bleu":
			this.color = new Color(0,0,255);
			break;

		case "jaune" :
			this.color = new Color(255,255,0);
			break;

		case "violet":
			this.color = new Color(255,0,255);
			break;

		case "cyan":
			this.color = new Color(0,255,255);
			break;

		case "blanc":
			this.color = new Color(255,255,255);
			break;

		default:
			this.color = new Color(0,0,0);
			break;
		}
	}
	
	public Color getColor() {
		return color;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Application other = (Application) obj;
		return Objects.equals(color, other.color);
	}
}
