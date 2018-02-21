package net.derstefon.presents.invitation.service;

import net.derstefon.presents.invitation.domain.Invitation;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class InvitationService {


    private Map<String, Invitation> fakeDatabase = new HashMap<>();


    public Invitation get(String uuid) {
        return fakeDatabase.get(uuid);
    }

    public Invitation persist(String name, String email) {
        Invitation invitation = new Invitation(name, email);
        fakeDatabase.put(invitation.getUuid(), invitation);
        return invitation;
    }
}
