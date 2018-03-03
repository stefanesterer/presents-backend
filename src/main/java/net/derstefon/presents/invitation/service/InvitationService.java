package net.derstefon.presents.invitation.service;

import net.derstefon.presents.invitation.domain.Invitation;
import net.derstefon.presents.invitation.web.CreateInvitationDTO;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class InvitationService {


    private Map<String, Invitation> fakeDatabase = new HashMap<>();


    public Invitation get(String uuid) {
        return fakeDatabase.get(uuid);
    }

    public Invitation persist(CreateInvitationDTO createInvitationDTO) {
        Invitation invitation = new Invitation(createInvitationDTO.getName(), createInvitationDTO.getEmail());
        fakeDatabase.put(invitation.getUuid(), invitation);
        return invitation;
    }
}
