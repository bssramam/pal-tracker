package io.pivotal.pal.tracker;

import org.springframework.http.ResponseEntity;
public class TimeEntryController {
    private final TimeEntryRepository timeEntryRepository;

    public TimeEntryController(TimeEntryRepository timeEntryRepository) {
        this.timeEntryRepository = timeEntryRepository;
    }
    public ResponseEntity<TimeEntry> create(TimeEntry timeEntryToCreate) {
        return null;
    }

}
