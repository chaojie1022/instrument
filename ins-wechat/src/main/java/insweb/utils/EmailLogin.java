package insweb.utils;
/**
 * Created by zyyang3 on 14-8-13.
 */

import com.sun.mail.smtp.SMTPTransport;

import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.URLName;
import java.util.Properties;

public class EmailLogin extends SMTPTransport {

    public EmailLogin(Session session, URLName urlname) {
        super(session, urlname);
    }
    public boolean login(){

        boolean login=false;
        try {
            login=  this.protocolConnect(url.getHost(), url.getPort(), url.getUsername(),url.getPassword());
        } catch (MessagingException e) {

            login=false;
        }
        return login;
    }
    
    /**
     * @param args
     */
    public static void main(String[] args) {


        URLName urlName=new URLName("smtp","mail.iflytek.com",25,"","kcloud@iflytek.com","research!2014");
        Session session= Session.getInstance(new Properties());
        EmailLogin login=new EmailLogin(session,urlName);
        System.out.println("登陆:"+login.login());
    }
}
