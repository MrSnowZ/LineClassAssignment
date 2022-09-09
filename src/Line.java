public class Line {

    public double slope;
    public double intercept;
    
    
    public Line()
    {
        slope = 2;
        intercept = 10;
    }
    
    public Line(double m, double b)
    {
        slope = m;
        intercept = b;
    
    }
    
    
    public double getSlope()
    {
        return slope;
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
            double a = ((o.intercept - intercept) / (slope - o.slope));
            double b = (slope * a) + intercept;
            
            double d = (int)((a*100)+0.5)/100;
            double c = (int)((b*100)+0.5)/100;
            
            System.out.println("The intercection point is " + a + ","+ b);
            System.out.println("The rounded intercection point is " + d + ","+ c);
            return b;
        }
        
    }

}