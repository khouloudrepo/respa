package tn.isg.pfe.services;

import org.springframework.stereotype.Service;

import tn.isg.pfe.dto.MeetingDto;

@Service
public interface ReunionService {
	public void createMeeting(MeetingDto meetingDto);
}
