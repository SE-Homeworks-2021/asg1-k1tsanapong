package lab.oodp.challenge3;

public class Lecturer {

    // instance variables
    private String name;
    private int staffId;
    private String[] papers;
    private boolean onLeave;

    public Lecturer(String name, int staffId, String[] papers, boolean onLeave) {
        this.name = name;
        this.staffId = staffId;
        this.papers = papers;
        this.onLeave = onLeave;
    }
   //TODO: complete getting/setter for these attributes
    
    public String getName() {
    	//TODO:complete this
        return "";
    }

    public void setName(String name) {
    	 //TODO:complete this
    }

    public int getStaffId() {
    	//TODO:complete this
        return 0;
    }

    public void setStaffId(int staffId) {
    	//TODO:complete this
    }

    public String[] getPapers() {
    	//TODO:complete this
        return null;
    }

    public void setPapers(String[] papers) {
    	//TODO:complete this
    }

    public boolean isOnLeave() {
    	//TODO:complete this
        return false;
    }

    public void setOnLeave(boolean onLeave) {
    	//TODO:complete this
    }

    public boolean teachesMorePapersThan(Lecturer other) {
    	//TODO:complete this
        return false;
    }

    @Override
    public String toString() {
        return "";
    }
}

