package int221.integrate.project.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ProductColor {
	@Id
	private long ProductColorId;
	private long ProductId;
	private long ColorId;

	public ProductColor(long productColorId, long productId, long colorId) {
		ProductColorId = productColorId;
		ProductId = productId;
		ColorId = colorId;
	}

	public long getProductColorId() {
		return ProductColorId;
	}

	public void setProductColorId(long productColorId) {
		ProductColorId = productColorId;
	}

	public long getProductId() {
		return ProductId;
	}

	public void setProductId(long productId) {
		ProductId = productId;
	}

	public long getColorId() {
		return ColorId;
	}

	public void setColorId(long colorId) {
		ColorId = colorId;
	}
}
