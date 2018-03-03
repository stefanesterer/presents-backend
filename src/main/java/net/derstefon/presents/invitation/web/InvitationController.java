package net.derstefon.presents.invitation.web;


import net.derstefon.presents.invitation.domain.Invitation;
import net.derstefon.presents.invitation.service.InvitationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
public class InvitationController {


    @Autowired
    private InvitationService invitationService;

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(method = RequestMethod.POST, value = "/invitation", produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<String> createInvitation(@RequestBody CreateInvitationDTO createInvitationDTO) {
        Invitation invitation = invitationService.persist(createInvitationDTO);
        return new ResponseEntity<String>(invitation.getUuid(), HttpStatus.CREATED);
    }


    @RequestMapping(method = RequestMethod.GET, value = "/invitation", produces = APPLICATION_JSON_VALUE)
    public Invitation getInvitation(@RequestParam String uuid) {
        return invitationService.get(uuid);
    }


}
