package com.example.mareu.data;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class DummyMeetingApiService implements MeetingApiService {

        private List<Meeting> meetings = DummyMeetingGenerator.generateMeetings();

        @Override
        public List<Meeting> getMeetings() {
            return meetings;
        }

        @Override
        public void deleteMeeting(Meeting meeting) {

            meetings.remove(meeting);
        }

        @Override
        public void createMeeting(Meeting meeting) {

            meetings.add(meeting);
        }



    }

