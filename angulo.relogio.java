public class angle
{
   
    public static int cal_angle(int hour,int min)
    {
        int h_angle=(int)((hour*60+min)*0.5);
        int angle=(min*6)-h_angle;
        
if (angle<0) angle=-angle;
  return Math.min(360-angle,angle);
         
    }
    
    public static void main(String[] args)
        {
            System.out.println(cal_angle(0,15));
        }
}