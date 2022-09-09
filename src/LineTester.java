public class LineTester {
    
    public static void main(String[] args) throws Exception
    {
        //code
        Line l1 = new Line();
        Line l2 = new Line(3,4);
        Line l3 = new Line(0.5,3);
        boolean isOneTheLine = l2.onLine(0,2);
        System.out.println(isOneTheLine);
        System.out.println(l1.onLine(3, 4));
        l1.Intercect(l2);
        l2.Intercect(l3);
        System.out.println(l1);
        Line other = new Line();
        double slopeOfOther = other.getSlope();
        
    }
}
