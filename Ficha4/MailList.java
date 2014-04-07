import java.util.ArrayList;
import java.lang.StringBuilder;

public class MailList
{
    private ArrayList<Mail> maillist;

	public MailList() {
        this.maillist = new ArrayList<Mail>();
	}

    public int numberOfMails()
        { return this.maillist.size(); }

    public void newMail(Mail m)
        { maillist.add(m); }

    public ArrayList<Mail> mailsFromAddress(String address){

        ArrayList<Mail> mails = new ArrayList<Mail>();

        for(Mail m: this.maillist)
            if (m.getAddress() == address)
                mails.add(m);

        return mails;
    }





}

