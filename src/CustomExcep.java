
    class CustomExceps extends Exception
    {
        public CustomExceps(String str)
        {
            super(str);//Exception class Constructor Exception(String message)
        }
    }
    public class CustomExcep
    {
        public static void verify(int MobNum) throws CustomExceps
        {
            int length = String.valueOf(MobNum).length();
            if(length==6)
            {
                System.out.println("Valid ID");
            }
            else {
                throw new CustomExceps("Not Valid ID ");
            }
        }

        public static void main(String[] args)
        {
            try
            {
                verify(1234567);
            }
            catch(CustomExceps CE)
            {
                System.out.println("Invalid Person");
            }
            finally
            {
                System.out.println("Code Ends");
            }
        }
    }

