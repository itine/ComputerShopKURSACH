/*
package beans;


import java.sql.SQLException;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;


@Named(value = "productBean")
@SessionScoped
public class ProductBean {

    private ProductDAOLocal productDAO ;
    private int productId;
    private int productStorageId;
    private String productName;
    private String category;
    private String description;
    private String manufacturer;
    private int price;
    private Provider provider;
    private String providerName;
    private int countOfProduct;
    private int prId=0;
   
    private Product product;
    public ProductBean() { 
       
    }
    public String orderTheProduct() throws Exception{
        productDAO.orderTheProduct(productName, countOfProduct, providerName);
        return "/products.xhtml";
    }
    public List<Product> getAllProducts() throws Exception{
        return productDAO.getAllProducts();
    }
    public List<Provider> getAllProviders() {
        return productDAO.getProvidersNames();
    }
    public String toEditPage(int productId){
        prId=productId;
        return "/editProduct.xhtml";
    }
    public String edit() throws Exception{
        productDAO.updateProductInformation(prId, productName, category, description, manufacturer, price);
        return "/products.xhtml";
    }
    public String delete (int productId) throws Exception{
        productDAO.deleteFromCatalog(productId);
        return "/products.xhtml";
    }
    public String add() throws Exception{
        
        productDAO.addToCatalog(productStorageId, productName, category, description, manufacturer, price);
        return "/products.xhtml";
       
    }
    public String deleteProductsFromStorage() throws SQLException{
        boolean flag = productDAO.deleteProductsFromStorage();
        if (flag)
        {
            return "/controller.xhtml";
        }
        return "/error.xhtml";
    }
    
    public int getCountOfProduct() {
        return countOfProduct;
    }

    public void setCountOfProduct(int countOfProduct) {
        this.countOfProduct = countOfProduct;
    }
    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getProductStorageId() {
        return productStorageId;
    }

    public void setProductStorageId(int productStorageId) {
        this.productStorageId = productStorageId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
}*/
