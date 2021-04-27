package int221.integrate.project.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Color {
	@Id
	private long ColorId;
	private String ColorName;
	private String ColorCode;

	public Color(long colorId, String colorName, String colorCode) {
		super();
		ColorId = colorId;
		ColorName = colorName;
		ColorCode = colorCode;
	}

	public long getColorId() {
		return ColorId;
	}

	public void setColorId(long colorId) {
		ColorId = colorId;
	}

	public String getColorName() {
		return ColorName;
	}

	public void setColorName(String colorName) {
		ColorName = colorName;
	}

	public String getColorCode() {
		return ColorCode;
	}

	public void setColorCode(String colorCode) {
		ColorCode = colorCode;
	}
}
