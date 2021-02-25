package exam03retake01;

import java.util.ArrayList;
import java.util.List;

public class MailBox {

    private List<Mail> mails = new ArrayList<>();

    public MailBox(List<Mail> mails) {
        this.mails = mails;
    }

    public MailBox() {
    }

    public List<Mail> getMails() {
        return mails;
    }

    public void addMail(Mail mail){
        mails.add(mail);
    }

    public List<Mail> findByCriteria(String criteria){
        List<Mail> resultList = new ArrayList<>();
        for(Mail actual : mails){
            if(criteria.startsWith("from:")){
                String from = criteria.substring(5);
                if(actual.getFrom().getEmail().equals(from)){
                    resultList.add(actual);
                }
            }
            else if(criteria.startsWith("to:")){
                String to = criteria.substring(3);
                for(Contact c:actual.getTo()){
                    if(c.getName().equals(to)){
                        resultList.add(actual);
                    }
                }
            }
            else if(actual.getSubject().contains(criteria) | actual.getMessage().contains(criteria)){
                    resultList.add(actual);
            }
        }return resultList;
    }
}
