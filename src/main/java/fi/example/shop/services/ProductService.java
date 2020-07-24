package fi.example.shop.services;

import fi.example.shop.entities.Product;
import fi.example.shop.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductService {

    private ProductRepository productRepository;

    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product getProductById(Long id){
       return productRepository.getProducts().get(id.intValue() -1);
    }

    public List<Product> getAllProducts(){
        return productRepository.getProducts();
    }


    public void deleteProductById(Long id){
         productRepository.deleteById(id);
    }



}
