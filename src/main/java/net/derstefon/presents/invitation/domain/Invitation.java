package net.derstefon.presents.invitation.domain;

import java.util.UUID;

public class Invitation {

    private String emailAddress;
    private String name;
    private String uuid;

    public Invitation(String name, String emailAddress) {
        this.emailAddress = emailAddress;
        this.name = name;
        this.uuid = UUID.randomUUID().toString();
    }


    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @Override
    public String toString() {
        return "Invitation{" +
                "emailAddress='" + emailAddress + '\'' +
                ", name='" + name + '\'' +
                ", uuid='" + uuid + '\'' +
                '}';
    }
}
