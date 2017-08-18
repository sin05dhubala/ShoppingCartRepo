package com.niit.Dao;



import java.util.List;


import com.niit.model.Addproduct;
import com.niit.model.Category;




public interface ProductDao {

void saveProduct(Addproduct product);


List<Addproduct> getAllAddproducts();
Addproduct getAddproductById(int id);
void deleteProduct(Addproduct product);
void editProduct(Addproduct product);
List<Category> getAllCategories();

}
