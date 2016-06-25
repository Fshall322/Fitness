/**
 * Created by Frank Hall on 6/25/2016.
 */
public class TestFitnessTracker
{
    public static void main(String[] args)
    {
        FitnessTracker tracker = new FitnessTracker();// creates a new fitnesstracker called tracker
        printInfo(tracker); // prints info into the tracker.
        // tracker.printInfo(); another way of printing info.. this is being called from fitnessTracker
    }

    public static void printInfo(FitnessTracker t) // printInfo method. prints out the activity, minutes, and date.
    {
        System.out.println("The Activity was: " +t.getActivity());
        System.out.println("you did that for: " +t.getMinutes()+ " minutes");
        System.out.println("you did that on: " +t.getDate()+ "\n");
    }
}
