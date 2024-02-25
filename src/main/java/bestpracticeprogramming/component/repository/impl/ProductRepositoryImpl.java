package bestpracticeprogramming.component.repository.impl;

import bestpracticeprogramming.component.model.entity.Product;
import bestpracticeprogramming.component.repository.ProductRepository;

import java.util.ArrayList;
import java.util.List;

public class ProductRepositoryImpl implements ProductRepository {

    List<Product> products = new ArrayList<>();

    @Override
    public void save(Product product) {
        products.add(product);
    }

    @Override
    public void saveAll(List<Product> products) {
        this.products.addAll(products);
    }

    @Override
    public void remove(Long id) {
        products.removeIf(product -> product.getId().equals(id));
    }

    @Override
    public List<Product> findAll() {
        return products;
    }

    @Override
    public Product findById(Long id) {
        for (Product product : products) {
            if (product.getId().equals(id)) {
                return product;
            }
        }

        return null;
    }
}
