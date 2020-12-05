package controle;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import org.primefaces.PrimeFaces;

//import dao.UsuarioDAO;
import entidade.Usuario;

@ManagedBean(name = "LoginBean")
@RequestScoped



public class LoginBean {
     
    private String username;
     
    private String password;
 
    public String getUsername() {
        return username;
    }
 
    public void setUsername(String username) {
        this.username = username;
    }
 
    public String getPassword() {
        return password;
    }
 
    public void setPassword(String password) {
        this.password = password;
    }
   
    public String login() {
    	
        boolean loggedIn = false;
        
        if(username != null && username.equals("ADMIN") && password != null && password.equals("123")) {
        	
        	return "telaPrincipal.xhtml";
        } else {
            loggedIn = false;
            FacesContext context = FacesContext.getCurrentInstance();
            
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Alerta!", "Usuario/Senha invalidos"));
            
            return "";
        }
         
    }   
}