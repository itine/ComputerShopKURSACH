/*
package beans;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.faces.context.FacesContext;
import models.Basket;

/**
 *
 * @author Сергей
 *//*
@Named(value = "basketBean")

public class BasketBean{

    private final ClientDAO clientDAO = new ClientDAO();
    List<Basket> items;
    int numberOfItems;
    int total;

    public BasketBean() {
        items = new ArrayList<Basket>();
        numberOfItems = 0;
        total = 0;
    }

    public void addItem(Product product) throws Exception {

        boolean newItem = true;

        for (Basket basketItem : items) {

            if (basketItem.getProductId() == product.getProductId()) {
                newItem = false;
                basketItem.incrementQuantity();

            }
        }
        if (newItem) {
            Basket scItem = new Basket(product);
            items.add(scItem);
            clientDAO.deleteProductFromStorage(product.getProductStorageId());
        }
    }

    public void deleteItem(Product product) throws Exception {

        for (Basket basketItem : items) {

            if (basketItem.getProduct().getProductId() == product.getProductId()) {

                basketItem.decrementQuantity();
                clientDAO.addProductToStorage(product.getProductStorageId());
            }
        }
    }

    public List<Basket> getItems() {
        return items;
    }

    public int getNumberOfItems() {

        numberOfItems = 0;

        for (Basket scItem : items) {

            numberOfItems += scItem.getQuantity();
        }

        return numberOfItems;
    }

    public int getSubtotal() {

        int amount = 0;

        for (Basket scItem : items) {

            Product product = (Product) scItem.getProduct();
            amount += (scItem.getQuantity() * product.getPrice());
        }

        return amount;
    }

    public void calculateTotal(String surcharge) {

        int amount = 0;
        int s = Integer.parseInt(surcharge);

        amount = this.getSubtotal();
        amount += s;

        total = amount;
    }

    public int getTotal() {
        return total;
    }

    public String exit() {
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
        return "/login.xhtml?faces-redirect=true";
    }
}
*/