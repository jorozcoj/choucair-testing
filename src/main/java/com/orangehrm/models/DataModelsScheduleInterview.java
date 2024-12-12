package com.orangehrm.models;

public class DataModelsScheduleInterview {
    private String interviewTitle;
    private String interviewer;
    private String date;
    private String notesInterview;

    public DataModelsScheduleInterview(String interviewTitle, String interviewer, String date, String notesInterview) {
        this.interviewTitle = interviewTitle;
        this.interviewer = interviewer;
        this.date = date;
        this.notesInterview = notesInterview;
    }

    public String getInterviewTitle() {
        return interviewTitle;
    }

    public String getInterviewer() {
        return interviewer;
    }

    public String getDate() {
        return date;
    }

    public String getNotesInterview() {
        return notesInterview;
    }
}
