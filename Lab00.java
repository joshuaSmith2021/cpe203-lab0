public class Lab00
{
    public static int charCount(String string, char character)
    {
        int count = 0;
        for (int i = 0; i < string.length(); i++)
        {
            if (string.charAt(i) == character)
            {
                count += 1;
            }
        }
        return count;
    }

    public static void main(String[] args)
    {
        int x = 5;
        String y = "hello";
        double z = 9.8;

        System.out.println(String.format("x: %d y: %s z: %.1f", x, y, z));

        int[] nums = {3, 6, -1, 2};
        for (int i = 0; i < nums.length; i++)
        {
            System.out.println(nums[i]);
        }

        int numFound = charCount(y, 'l');
        System.out.println(String.format("Found: %d", numFound));

        for (int i = 1; i < 11; i++)
        {
            System.out.print(String.format("%d ", i));
        }

        System.out.println();
    }
}
