import java.util.GregorianCalendar;
import java.lang.StringBuilder;


public class Mail
{
    private String address;
    private GregorianCalendar sendDate;
    private GregorianCalendar receptionDate;
    private String subject;
    private String body;


	public Mail() {
        this.address = "";
        this.subject = "";
        this.body = "";
        this.sendDate = new GregorianCalendar();
        this.receptionDate = new GregorianCalendar();
	}

	public Mail(Mail mail) {
        this.address = mail.getAddress();
        this.subject = mail.getSubject();
        this.body = mail.getBody();
        this.sendDate = mail.getSendDate();
        this.receptionDate = mail.getReceptionDate();
	}

    public Mail clone(){
        Mail m = new Mail(this);
        return m;
    }

    public boolean equals(Object o){
        if (this == o)
            return true;
        if ((o == null) || (this.getClass() != o.getClass()))
            return false;

        Mail m = (Mail) o;
        if (this.address == m.getAddress() && this.subject == m.getSubject() && this.body == m.getBody())
            return true;

        return false;
    }

    public String toString()
    {
        StringBuilder s = new StringBuilder();

        s.append(this.address);
        s.append(" -> ");
        s.append(this.subject);

        return s.toString();
    }

    public String getAddress()
    	{ return this.address; }

    public void setAddress(String address)
    	{ this.address = address; }

    public String getSubject()
    	{ return this.subject; }

    public void setSubject(String subject)
    	{ this.subject = subject; }

    public String getBody()
    	{ return this.body; }

    public void setBody(String body)
    	{ this.body = body; }

    public GregorianCalendar getSendDate()
    	{ return (GregorianCalendar) this.sendDate.clone(); }

    public void setSendDate(GregorianCalendar sendDate)
    	{ this.sendDate = sendDate; }

    public GregorianCalendar getReceptionDate()
    	{ return (GregorianCalendar) this.receptionDate.clone(); }

    public void setReceptionDate(GregorianCalendar receptionDate)
    	{ this.receptionDate = receptionDate; }
}

