public class Line {
    double slope;
    double intercept;


    public Line()
    {
        slope = 1;
        intercept = 0;
    }
    public Line(double slope, double intercept)
    {
        this.slope = slope;
        this.intercept = intercept;
    }
    public void setSlope(double newSlope)
    {
        slope = newSlope;
    }
    public double getSlope()
    {
        return slope;
    }
    public void setIntercept(double newIntercept)
    {
        intercept = newIntercept;
    }
    public double getIntercept()
    {
        return intercept;
    }
    double x;
    double y;

    public void onLine()
    {
        x = 0;
        y = 0;
        
    }
    public void setx(double newx)
    {
        x = newx;
    }
    public double getx()
    {
        return x;
    }
    public void sety(double newy)
    {
        y = newy;
    }
    public double gety()
    {
        return y;
    }
    public boolean onLine(double x, double y)
    {
        double lineY = slope*x+intercept;
        
    }
}
