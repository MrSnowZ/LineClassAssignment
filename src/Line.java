public class Line {

    public double slope;
    public double intercept;
    
    
    public Line()
    {
        slope = 3;
        intercept = 5;
    }
    
    public Line(double m, double b)
    {
        slope = m;
        intercept = b;
    
    }

    public void setSlope(double m)
    {
        slope = m;
    }

    public void setInt(double b)
    {
        intercept = b;
    }


    
    
    public double getSlope()
    {
        return slope;
    }

    public double getIntercept()
    {
       return intercept; 
    }
    
    public boolean onLine(double x, double y)
    {
        double yIntercept = slope*x+intercept;
        
        if (yIntercept == y)
        {
            return true;
        }
        else
        {
            return false;
        }
        
        
            
    }

    Double Intercect(Line o)
    {
        if (slope == o.slope)
        {
            System.out.println("No intercetion point");
            return intercept;
        }
        else
        {
            double a = ((o.getIntercept() - intercept) / (slope - o.getSlope()));
            double b = (slope * a) + intercept;
            
            double d = (int)((a*100)+0.5)/100;
            double c = (int)((b*100)+0.5)/100;
            
            System.out.println("The intercection point is " + a + ","+ b);
            return b;
        }
        
    }

    public String toString()
    {
        return slope + " how does this even work lol";
    }

}