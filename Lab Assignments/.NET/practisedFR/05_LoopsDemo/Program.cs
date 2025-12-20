namespace _05_LoopsDemo
{
    internal class Program
    {
        static void Main(string[] args)
        {
        
                //for loop example
                Console.WriteLine("for loop");
                for (int i = 5; i > 0; i--)
                {

                    Console.WriteLine(i);
                }
                //while loop example
                int n = 5;
                Console.WriteLine("while loop");
                while (n > 0)
                {
                    Console.WriteLine(n);
                    n--;
                }
                //do-while loop example
                int a = 5;
                Console.WriteLine("do while loop");
                do
                {
                    Console.WriteLine(a);
                    a--;
                } while (a > 0);
            }
        }
    }

