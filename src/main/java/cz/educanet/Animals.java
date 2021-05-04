package cz.educanet;


public class Animals {

    private int zvireId = 0;
    private String zvireJmeno;
    private String druhJmeno;


    public Animals(int zvireId, String zvireJmeno, String druhJmeno) {
        this.zvireId = zvireId;
        this.zvireJmeno = zvireJmeno;
        this.druhJmeno = druhJmeno;
    }
    public Animals(){

    }

    public int getZvireId() {
        return zvireId;
    }

    public void setZvireId(int zvireId) {
        this.zvireId = zvireId;
    }

    public String getZvireJmeno() {
        return zvireJmeno;
    }

    public void setZvireJmeno(String zvireJmeno) {
        this.zvireJmeno = zvireJmeno;
    }

    public String getDruhJmeno() {
        return druhJmeno;
    }

    public void setDruhJmeno(String druhJmeno) {
        this.druhJmeno = druhJmeno;
    }
}
