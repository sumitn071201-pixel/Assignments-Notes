namespace ConditionalStatements
{
    internal class Program
    {
        static void Main(string[] args)
        {
            //if statement example
            bool isRaining = true;
            if (isRaining)
            {
                Console.WriteLine("Take an umbrella");
            }
            else
            {
                Console.WriteLine("No need to take an umbrella");
            }

            //if...else if...else statement example
            int time = 22;
            if (time < 10)
            {
                Console.WriteLine("Good morning.");
            }
            else if (time < 20)
            {
                Console.WriteLine("Good day.");
            }
            else
            {
                Console.WriteLine("Good evening.");
            }
        }
    }
}
