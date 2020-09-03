package Work;

import java.io.Serializable;

public class Calendar implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private String theTask;
    private String endDate;


    public Calendar(String name, String theTask, String endDate) {
        this.name = name;
        this.theTask = theTask;
        this.endDate = endDate;
    }


    public String getName() {
        return name;
    }

    public String getTheTask() {
        return theTask;
    }

    public String getEndDate() {
        return endDate;
    }



    @Override
    public String toString() {
        return "Calendar{" +
                "name='" + name + '\'' +
                ", theTask='" + theTask + '\'' +
                ", endDate=" + endDate +
                '}';
    }
}
