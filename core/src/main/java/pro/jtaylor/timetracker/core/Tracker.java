package pro.jtaylor.timetracker.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pro.jtaylor.timetracker.core.dao.TimeEntry;

import java.util.List;

@Component
public class Tracker {
    @Autowired
    private List<TimeEntry> entries;
    
    /**
     * Add Method
     * * @param TimeEntry entry for entries
     */
    public void add(TimeEntry entry) {
        entries.add(entry);
    }

      /**
     * remove Method
     * @param TimeEntry entry for entries
     */
    public void remove(TimeEntry entry) {
        entries.remove(entry);
    }

      /**
     * size Method
     */
    public int size() {
        return entries.size();
    }
    
      /**
     * TimeEntry Method
     * @param index int for entries
     */
    public TimeEntry get(int index) {
        return entries.get(index);
    }
}

