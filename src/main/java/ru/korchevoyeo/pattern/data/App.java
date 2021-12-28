package ru.korchevoyeo.pattern.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.korchevoyeo.pattern.data.dao.ClientDao;
import ru.korchevoyeo.pattern.data.dao.EmailDao;
import ru.korchevoyeo.pattern.data.dao.SmsDao;
import ru.korchevoyeo.pattern.data.jdo.Client;
import ru.korchevoyeo.pattern.data.jdo.Email;
import ru.korchevoyeo.pattern.data.jdo.Sms;

import java.util.List;

@SpringBootApplication
public class App implements CommandLineRunner {

    @Autowired
    private ClientDao clientDao;
    @Autowired
    private SmsDao smsDao;
    @Autowired
    private EmailDao emailDao;

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @Override
    public void run(String... args) {
        manipulateClients();
        System.out.println();
        manipulateSms();
        System.out.println();
        manipulateEmails();
    }

    private void manipulateClients() {
        List<Client> clients = clientDao.findAll();

        System.out.println("Clients in db: ");
        for (Client client : clients) {
            System.out.println(client);
        }

        Client newClient = new Client();
        newClient.setFullName("Testov Test");
        newClient.setPhone("+79999999999");
        newClient.setEmail("test@test.ru");
        clientDao.save(newClient);

        System.out.println("Clients in db after addition: ");
        clients = clientDao.findAll();
        for (Client client : clients) {
            System.out.println(client);
        }
    }

    private void manipulateSms() {
        List<Sms> smsList = smsDao.findAll();

        System.out.println("Sms in db: ");
        for (Sms sms : smsList) {
            System.out.println(sms);
        }

        Sms newSms = new Sms();
        newSms.setFullName("Smsov sms");
        newSms.setPhone("+79888888888");
        newSms.setContent("sms content");
        smsDao.save(newSms);

        System.out.println("Sms in db after addition: ");
        smsList = smsDao.findAll();
        for (Sms sms : smsList) {
            System.out.println(sms);
        }
    }

    private void manipulateEmails() {
        List<Email> emails = emailDao.findAll();

        System.out.println("Emails in db: ");
        for (Email email : emails) {
            System.out.println(email);
        }

        Email newEmail = new Email();
        newEmail.setFullName("Emailov email");
        newEmail.setEmail("email@test.ru");
        newEmail.setContent("email content");
        emailDao.save(newEmail);

        System.out.println("Emails in db after addition: ");
        emails = emailDao.findAll();
        for (Email email : emails) {
            System.out.println(email);
        }
    }
}
