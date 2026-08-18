package dev.java10x.email.domain;

import dev.java10x.email.enums.EmailStatus;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "tb_emails")
public class EmailModel {

    private final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID emailId;
    private UUID userId;
    private String emailFrom;
    private String emailTo;
    private String emailSubject;

    @Column(columnDefinition = "BODY")
    private String body;

    private LocalDateTime sentDateEmail;
    private EmailStatus statusEmail;

    //getters and setters
    public UUID getEmailId() {
        return emailId;
    }

    public void setEmailId(UUID emailId) {
        this.emailId = emailId;
    }

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public String getEmailFrom() {
        return emailFrom;
    }

    public void setEmailFrom(String emailFrom) {
        this.emailFrom = emailFrom;
    }

    public String getEmailTo() {
        return emailTo;
    }

    public void setEmailTo(String emailTo) {
        this.emailTo = emailTo;
    }

    public String getEmailSubject() {
        return emailSubject;
    }

    public void setEmailSubject(String emailSubject) {
        this.emailSubject = emailSubject;
    }

    public LocalDateTime getSentDateEmail() {
        return sentDateEmail;
    }

    public void setSentDateEmail(LocalDateTime sentDateEmail) {
        this.sentDateEmail = sentDateEmail;
    }

    public EmailStatus getStatusEmail() {
        return statusEmail;
    }

    public void setStatusEmail(EmailStatus statusEmail) {
        this.statusEmail = statusEmail;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
