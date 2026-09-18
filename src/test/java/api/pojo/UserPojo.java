package api.pojo;

public class UserPojo {

    private String name;
    private String job;

    // Constructor
    public UserPojo(String name, String job) {
        this.name = name;
        this.job  = job;
    }

    // Getters
    public String getName() { return name; }
    public String getJob()  { return job;  }

    // Setters
    public void setName(String name) {
        this.name = name;
    }
    public void setJob(String job) {
        this.job = job;
    }
}