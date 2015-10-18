package com.statefarm.codingcomp;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.*;

import com.statefarm.codingcomp.model.Email;
import com.statefarm.codingcomp.model.User;
import com.statefarm.codingcomp.reader.Reader;

public class QueryServiceImpl implements QueryService {

    Reader reader;
    Set<User> users;
    Set<Email> emails;

    public QueryServiceImpl() {
        reader = new Reader();
        users = new HashSet<>();
        emails = new HashSet<>();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");

        try {
            for(int i=1; i<5; i++) {
                String[] data = reader.read(i, "users.txt");
                for(String s : data) {
                    String[] line = s.split(",");
                    users.add(new User(line[1], line[2]));
                }
            }
            for(int i=1; i<5; i++) {
                String[] data = reader.read(i, "mail.txt");
                for(String s : data) {
                    String[] line = s.split(",");
                    emails.add(new Email(line[0], line[1], sdf.parse(line[2], new ParsePosition(0))));
                }
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<User> usersByDomain( String domain ) throws Exception {
        return null;
    }

    @Override
    public List<Email> emailsInDateRange( Date start, Date end ) throws Exception {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Map<String, List<Email>> emailsByDay() throws Exception {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int emailsOnDay( Date date ) throws Exception {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public Map<User, List<Email>> emailsFromOurUsers() throws Exception {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Map<User, List<Email>> emailsToOurUsers() throws Exception {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Email> emailsToUserFromUser() throws Exception {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Set<String> emailAddressesByDegrees( String email, int degrees ) throws Exception {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int degreesBetween( String emailAddressOne, String emailAddressTwo ) throws Exception {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public String mostConnected() throws Exception {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String mostActiveSender() throws Exception {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String mostActiveReceiver() throws Exception {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String mostSingularSender() throws Exception {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String mostSelfEmails() throws Exception {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int mostPopularHour() throws Exception {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int mostPopularHour( String email ) throws Exception {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int leastPopularHour() throws Exception {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int leastPopularHour( String email ) throws Exception {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public String mostPopularDate() throws Exception {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String mostPopularDate( String email ) throws Exception {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String leastPopularDate() throws Exception {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String leastPopularDate( String email ) throws Exception {
        // TODO Auto-generated method stub
        return null;
    }

}
