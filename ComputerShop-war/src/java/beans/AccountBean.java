/*
package beans;


import java.sql.SQLException;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;


@Named(value = "accountBean")
@SessionScoped
public class AccountBean {
    @EJB
    AccountDAOLocal accountDAO;
    
    private int money;
    private String userName;
    private String password;
    private Account account;
    
    public AccountBean() {
    }
    
    public AccountBean(Account account) {
        account = new Account();
    }

    //getters&setters
    public int getAccountID(String userName) throws Exception{
        return this.accountDAO.getAccountIdByLogin(userName);
    }
    public int showBalance(String userName) throws Exception{
        return this.accountDAO.showBalance(userName);
    }
    public List<Order> showHistory(String userName) throws Exception {  
        return this.orderDAO.showHistory(userName);
    }

    public String addFunds(int money, int accountID) throws Exception {  
        
        if (!this.orderDAO.showHistory(userName)){
            return "/error.xhtml";
        }
        else return "/currentAccount.xhtml";

    }
    
}*/
