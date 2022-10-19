public class Generic {
    
    private int id;

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Id: " + this.id + "\n";
    }

}
