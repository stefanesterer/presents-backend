package net.derstefon.presents.invitation.web;


import net.derstefon.presents.invitation.domain.Invitation;
import net.derstefon.presents.invitation.service.InvitationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
public class InvitationController {


    @Autowired
    private InvitationService invitationService;

    @RequestMapping(method = RequestMethod.POST, value = "/invitation", produces = APPLICATION_JSON_VALUE)
    public Invitation createInvitation(@RequestParam String email, @RequestParam String name)
    {
        return invitationService.persist(name, email);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/invitation", produces = APPLICATION_JSON_VALUE)
    public Invitation getInvitation(@RequestParam String uuid)
    {
        return invitationService.get(uuid);
    }



}
