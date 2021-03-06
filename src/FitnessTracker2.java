/**
 * Created by Frank Hall on 6/25/2016.
 */
public class FitnessTracker2// Begin FitnessTracke2r class
{
    private String activity; // variable decleration to store in the activity
    private int minutes; // variable decleration to store in how long the activity took to complete
    private String date; // variable decleration to store int the date the activity took place

    public FitnessTracker2() // begins fitness tracker2 constructor(default)
    {
        this("running", 0, "January 1, 2015");
    }

    public FitnessTracker2(String activity, int minutes, String date) // overloaded constructor
    {
        this.activity = activity;
        this.minutes = minutes;
        this.date = date;
    }

    public String getActivity()// Gets for  activity, minutes, and date

    {
        return activity;
    }

    public int getMinutes()
    {
        return minutes;
    }

    public String getDate()
    {
        return date;
    }
}
