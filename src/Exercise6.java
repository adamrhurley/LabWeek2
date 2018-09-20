public class Exercise6 {
    public static void main(String[] args)
    {
        int i;

        for(i=1; i<=15; i++)
        {
            cube();
        }
    }

    private static double cube()
    {
        int i=1;
        String answer;
         answer = i + i*i*i+"\n";

         return Double.parseDouble(answer);
    }
}
