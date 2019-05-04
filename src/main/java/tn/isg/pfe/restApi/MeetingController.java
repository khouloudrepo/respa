package tn.isg.pfe.restApi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tn.isg.pfe.dto.MeetingDto;
import tn.isg.pfe.services.ReunionService;

@RestController
public class MeetingController {

	@Autowired
	ReunionService reunionService;
	@CrossOrigin
	@PostMapping(value="/saveMeeting")
	public void saveNewMeeting(@RequestBody MeetingDto meeting){
		System.out.println(meeting.toString());
		reunionService.createMeeting(meeting);
	}
}
