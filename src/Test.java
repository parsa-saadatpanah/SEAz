class Test
{
    public static void main(String[] args)
    {
        testSum();
    }

    private static void testSum()
    {
        int a = 5;
        int b = 6;
        int expected = 11;
        BasicMath bm = new BasicMath();
        int result = bm.sum(a, b);
        if (result == expected)
        {
            System.out.println("Sum: OK");
        }
        else
        {
            System.out.println("Sum: Failed, expected = " + expected + ", result = " + result);
        }
    }
	
	private static void testMult()
    {
        int a = 5;
        int b = 6;
        int expected = 30;
        BasicMath bm = new BasicMath();
        int result = bm.multiply(a, b);
        if (result == expected)
        {
            System.out.println("Mult: OK");
        }
        else
        {
            System.out.println("Mult: Failed, expected = " + expected + ", result = " + result);
        }
    }
	private static void testDivide(){
		int a = 6;
        int b = 2;
        int expected = 3;
        BasicMath bm = new BasicMath();
        int result = bm.divide(a, b);
        if (result == expected)
        {
            System.out.println("Divide: OK");
        }
        else
        {
            System.out.println("Divide: Failed, expected = " + expected + ", result = " + result);
        }	
	}
	
	private static void testSub()
    {
        int a = 6;
        int b = 5;
        int expected = 1;
        BasicMath bm = new BasicMath();
        int result = bm.subtract(a, b);
        if (result == expected)
        {
            System.out.println("Subtract: OK");
        }
        else
        {
            System.out.println("Subtract: Failed, expected = " + expected + ", result = " + result);
        }
    }
}
