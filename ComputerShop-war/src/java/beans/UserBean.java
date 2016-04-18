/*
package beans;


import java.sql.SQLException;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;


@Named(value = "userBean")
@SessionScoped
public class UserBean {
 
    @EJB
    UserDAOLocal userDAO;
    
    private String role;
    private User user;
    private User username;

    public UserBean() {
    }

    public UserBean(User user) {
        user = new User();
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getUsername() {
        return username;
    }

    public void setUsername(User username) {
        this.username = username;
    }
    
    public int getUserID(String userName) throws Exception{
        return userDAOLocal.getUserIdByLogin(userName);
    }
    public String toNewUser() throws Exception {   
        return "/newUser.xhtml";
    }

    public List<User> getAllUsers() throws Exception {  
        return this.userDAOLocal.getAllUsers();
    }

    public String logout() {
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
        return "/login.xhtml?faces-redirect=true";
    }

    public String addNewUser() throws Exception {
       if ((this.userDAO.searchUserByLogin(user.getUsername()) == false) & (passIsEquals(user.getPassword(), pass2))==true) {
            this.userDAO.saveUser(user.getName(), user.getSurname(),user.getPatronymic(),  user.getUsername(), user.getPassword());
            return "/login.xhtml";
       } else {
           if (passIsEquals(user.getPassword(), pass2) == false){
            error = "Пароли не совпадают!";
       }
           else
          error = "Такое имя уже существует!";
           return "/error.xhtml";
        }
    }
}*/