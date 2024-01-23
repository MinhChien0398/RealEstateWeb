
package com.nhom44.services;

import com.nhom44.mail.MailProperties;
import java.util.Date;
import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.Message.RecipientType;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class MailService {
    private static MailService instance;

    private MailService() {
    }

    public static MailService getInstance() {
        if (instance == null) {
            instance = new MailService();
        }

        return instance;
    }

    private void sendMail(String to, String subject, String content) {
        Properties prop = new Properties();
        prop.setProperty("mail.smtp.host", MailProperties.getMailHost());
        prop.setProperty("mail.smtp.port", MailProperties.getMailPort());
        prop.setProperty("mail.smtp.auth", String.valueOf(MailProperties.getMailAuth()));
        prop.setProperty("mail.smtp.starttls.enable", String.valueOf(MailProperties.getMailStarttls()));
        prop.setProperty("mail.smtp.ssl.trust", MailProperties.sslTrust());
        prop.setProperty("mail.smtp.socketFactory.port", MailProperties.socketFactoryPort());
        prop.setProperty("mail.smtp.socketFactory.class", MailProperties.socketFactoryClass());
        Authenticator auth = new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(MailProperties.getMailUsername(), MailProperties.getMailPassword());
            }
        };
        Session session = Session.getInstance(prop, auth);
        Message msg = new MimeMessage(session);

        try {
            msg.setHeader("Content-Type", "text/plain; charset=UTF-8");
            msg.setFrom(new InternetAddress(MailProperties.getMailUsername()));
            msg.setRecipients(RecipientType.TO, InternetAddress.parse(to));
            msg.setSubject(subject);
            msg.setText(content);
            msg.setSentDate(new Date());
            Transport.send(msg);
            System.out.println("Sent");
        } catch (Exception var9) {
            var9.printStackTrace();
        }

    }

    public void sendMailToVerify(String to, String verifycode) {
        String verifyLink = "http://localhost:8080/verify?code=" + verifycode;
        String content = "Nhấp vào đường link sau để xác thực tài khoản: " + verifyLink;
        String subject = "Xác thực tài khoản";
        this.sendMail(to, subject, content);
    }

    public void sendMailToAGaig(String to, String verifycode) {
        String verifyLink =  "http://localhost:8080/verify?code=" + verifycode;
        String content = "Nhấp vào đường link sau để xác thực tài khoản: " + verifyLink;
        String subject = "Xác thực lại tài khoản";
        this.sendMail(to, subject, content);
    }

    public void sendMailToResetPassword(String to, String password) {
        String content = "Mật khẩu của bạn đã được đổi thành: " + password;
        String subject = "Cấp lại mật khẩu";
        this.sendMail(to, subject, content);
    }
}
