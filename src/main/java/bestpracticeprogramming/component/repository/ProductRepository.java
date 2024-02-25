package bestpracticeprogramming.component.repository;

import bestpracticeprogramming.component.model.entity.Product;

import java.util.List;

public interface ProductRepository {
    void save(Product product);
    void saveAll(List<Product> products);
    void remove(Long id);
    List<Product> findAll();
    Product findById(Long id);
}
