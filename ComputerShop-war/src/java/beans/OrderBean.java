/*
package beans;


import java.sql.SQLException;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;


@Named(value = "orderBean")
@SessionScoped
public class OrderBean {

    OrderDAOLocal orderDAO;
    
    private String userName;
    private int userId;
    private String paymethod;
    private String country;
    private String city;
    private int phoneNumber;
    private int index;
    private int cost=200;
    private String adress;
    private String deliveryType;
    private Delivery delivery;
    Order order;
    public OrderBean() {
        delivery = new Delivery();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getPaymethod() {
        return paymethod;
    }

    public void setPaymethod(String paymethod) {
        this.paymethod = paymethod;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getDeliveryType() {
        return deliveryType;
    }

    public void setDeliveryType(String deliveryType) {
        this.deliveryType = deliveryType;
    }

    public Delivery getDelivery() {
        return delivery;
    }

    public void setDelivery(Delivery delivery) {
        this.delivery = delivery;
    }

    public String orderConfirm(int userId) throws Exception{
        this.userId = userId;
        this.orderDAO.processOrder(paymethod, userId);
        if (deliveryType.equals("fromSeller")) {
            return "/thanks.xhtml";
        } else {
            return "/orderIsPaid.xhtml";
        }
    }

    public String exit() {
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
        return "/products.xhtml";
    }

    public String orderWithDelivery() {
        this.orderDAO.setDelivery(userId, deliveryType, country, city, phoneNumber, index, cost, adress);
        return "/thanks.xhtml";
    }
     public List<Order> getOrdersInformation() {
     return this.orderDAO.showOrdersInformation();
     }
     public List<Order> getOrderInformationById(int userId) {
     return this.orderDAO.showOrderInformation(userId);
     }
    public String confirm(int orderID){
        boolean flag = this.orderDAO.confirmOrder(orderID);
        if (flag == true) return "/orderInfo.xhtml";
        else return "/error.xhtml";
    }
    public String payd(int orderID){
        
        boolean flag = this.orderDAO.payOrder(orderID);
        if (flag == true) return "/clientOrders.xhtml";
        else return "/error.xhtml";
    }
     public String delete(int orderID){
        boolean flag = this.orderDAO.cancelOrder(orderID);
        if (flag == true) return "/orderInfo.xhtml";
        else return "/error.xhtml";
    }
     public String feebBack(int orderID){
        boolean flag = this.orderDAO.feedBack(orderID);
        if (flag == true) return "/clientOrders.xhtml";
        else return "/error.xhtml";
    }
    
     public String sendOrder(int orderID){
        boolean flag = this.orderDAO.issueTheProducts(orderID);
        if (flag == true) return "/orderInfo.xhtml";
        else return "/error.xhtml";
    }
    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
    
}
*/