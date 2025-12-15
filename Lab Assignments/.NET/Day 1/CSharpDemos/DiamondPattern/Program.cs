namespace DiamondPattern
{
    internal class Program
    {
        static void Main(string[] args)
        {

                int n = 5; // height of diamond needs odd number
                int mid = n / 2;

                for (int i = 0; i < n; i++)
                {
                    int row;
                    if (i <= mid)
                    {
                        row = i;
                    }
                    else
                    {
                        row = n - 1 - i;
                    }

                    // print spaces before first star
                    for (int s = 0; s < mid - row; s++)
                    {
                        Console.Write(" ");
                    }

                    // print first star
                    Console.Write("*");

                    // print spaces between stars
                    if (row > 0)
                    {
                        for (int s = 0; s < (row * 2 - 1); s++)
                        {
                            Console.Write(" ");
                        }
                        // print second star
                        Console.Write("*");
                    }

                    // move to next line
                    Console.WriteLine();
                }
            }
        }

    }


