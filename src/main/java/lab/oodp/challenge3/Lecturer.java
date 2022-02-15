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



        return this.name;
    }

    public void setName(String name) {
    	 //TODO:complete this
        this.name = name;
    }

    public int getStaffId() {
    	//TODO:complete this
        return this.staffId;
    }

    public void setStaffId(int staffId) {
    	//TODO:complete this
        this.staffId = staffId;
    }

    public String[] getPapers() {
    	//TODO:complete this
        return this.papers;
    }

    public void setPapers(String[] papers) {
    	//TODO:complete this
        this.papers = papers;
    }

    public boolean isOnLeave() {
    	//TODO:complete this
        return this.onLeave;
    }

    public void setOnLeave(boolean onLeave) {
    	//TODO:complete this
        this.onLeave = onLeave;
    }

    public boolean teachesMorePapersThan(Lecturer other) {
    	//TODO:complete this

        return this.papers.length > other.papers.length;
    }

    @Override
    public String toString() {
        return "id:"+this.staffId+" "+this.name+" is teaching "+this.papers.length+" papers.";
    }
}

