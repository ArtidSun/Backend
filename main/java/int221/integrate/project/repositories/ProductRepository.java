package int221.integrate.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import int221.integrate.project.models.Product;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
