/*

2. Make a default constructor and an overloaded constructor.

3. Write a toString for your line class.

4. Write a main to test your line class. All functions should be tested.

5. Write a function to test if a point is on the line, this should take in a 'x' and a 'y' and return true or false.

6. Write all required setters and getters.

7. Write an intersection method to find where two lines intersect. This is a void method that prints to the screen. */

//import java.util.Scanner;
// Scanner keyboard = new Scanner(System.in);


public class Line
{
    // y=mx+b
    double slope; // m
    double yInt; // y intercept

    public Line() //setter
    {
    //
    slope = 2;
    yInt = 1;
    }
    public Line(double slope, double b)
    {
        this.slope = slope;
        yInt = b;
    } //getter

    public boolean onLine(double x, double y)
    {
        if ()
        return false;
    }

    public void intersect(Line other)
    {
        //
    }


}

