package int221.integrate.project.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Brand {
	@Id
	private long BrandId;
	private String BrandName;

	public Brand(long brandId, String brandName) {
		super();
		BrandId = brandId;
		BrandName = brandName;
	}

	public long getBrandId() {
		return BrandId;
	}

	public void setBrandId(long brandId) {
		BrandId = brandId;
	}

	public String getBrandName() {
		return BrandName;
	}

	public void setBrandName(String brandName) {
		BrandName = brandName;
	}
}
