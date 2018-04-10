package Library_Database;

public class TextBook extends Book {

    protected String subject;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String newSub) {
        subject = newSub;
    }

    public TextBook() {
        subject = "Default Text Book Subject";
    }

    @Override
    public boolean equals(Object temp) {
        if (temp != null && temp instanceof TextBook) {
            TextBook inM = (TextBook) temp;
            return super.equals(temp) && inM.getSubject().equals(getSubject());
        } else if (temp != null && temp instanceof Novel) {
            Novel inM = (Novel) temp;
            return super.equals(temp) && inM.getGenre().equals(getSubject());
        }
        return false;
    }

}
