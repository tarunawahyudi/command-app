package bestpracticeprogramming.component.service.impl;

import bestpracticeprogramming.component.repository.ProductRepository;
import bestpracticeprogramming.component.repository.impl.ProductRepositoryImpl;
import bestpracticeprogramming.component.service.ProductService;
import bestpracticeprogramming.component.model.entity.Product;

import java.util.List;

public class ProductServiceImpl implements ProductService {

    ProductRepository productRepository = new ProductRepositoryImpl();

    @Override
    public void insert(Product product) {
        productRepository.save(product);
    }

    @Override
    public void batch(List<Product> products) {
        productRepository.saveAll(products);
    }

    @Override
    public void delete(Long id) {
        productRepository.remove(id);
    }

    @Override
    public List<Product> getAll() {
        return productRepository.findAll();
    }

    @Override
    public Product getById(Long id) {
        return productRepository.findById(id);
    }
}
