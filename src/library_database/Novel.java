package Library_Database;

public class Novel extends Book {

    protected String genre;

    public String getGenre() {
        return genre;
    }

    public void setGenre(String newGen) {
        genre = newGen;
    }

    public Novel() {
        genre = "Default Text Book Genre";
    }

    @Override
    public boolean equals(Object temp) {
        if (temp != null && temp instanceof Novel) {
            Novel inM = (Novel) temp;
            return super.equals(temp) && inM.getGenre().equals(getGenre());
        } else if (temp != null && temp instanceof TextBook) {
            TextBook inM = (TextBook) temp;
            return super.equals(temp) && inM.getSubject().equals(getGenre());
        }
        return false;
    }
}
