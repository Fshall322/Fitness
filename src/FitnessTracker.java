/**
 * Created by Frank Hall on 6/25/2016.
 */
public class FitnessTracker // Begin FitnessTracker class
{
    private String activity; // variable decleration to store in the activity
    private int minutes; // variable decleration to store in how long the activity took to complete
    private String date; // variable decleration to store int the date the activity took place

    public FitnessTracker() // begin FitnessTracker constructor
    {
        activity = "running"; // asigning the activity variable to running
        minutes = 0; // asigning the minutes variable to 0
        date = "January 1, 2015"; // asigning the date variable to january 1 2015
    }

    public String getActivity() // Gets for  activity, minutes, and date
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
}// close class
