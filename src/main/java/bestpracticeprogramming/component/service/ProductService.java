package bestpracticeprogramming.component.service;

import bestpracticeprogramming.component.model.entity.Product;

import java.util.List;

public interface ProductService {
    void insert(Product product);
    void batch(List<Product> products);
    void delete(Long id);
    List<Product> getAll();
    Product getById(Long id);
}
