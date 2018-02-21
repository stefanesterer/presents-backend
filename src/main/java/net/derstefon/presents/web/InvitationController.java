package net.derstefon.presents.web;


import net.derstefon.presents.domain.Invitation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InvitationController {


    @RequestMapping("/invitation")
    public Invitation invitation() {
        return new Invitation();
    }

}
