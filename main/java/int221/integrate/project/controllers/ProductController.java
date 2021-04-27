package int221.integrate.project.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import int221.integrate.project.repositories.ProductRepository;

@Controller
public class ProductController {
	@Autowired
	private ProductRepository productRepository;

	@RequestMapping("/product")
	public String product(Model model) {
		model.addAttribute("products", productRepository.findAll());
		return "product";
	}
}
