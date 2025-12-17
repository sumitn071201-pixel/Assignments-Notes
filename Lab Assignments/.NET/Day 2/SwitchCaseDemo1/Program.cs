using System.Linq.Expressions;

namespace SwitchCaseDemo
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Enter your choice");
            string input = Console.ReadLine();
            int choice = Convert.ToInt32(input);

            switch (choice)
            {
                case 1:
                    Console.WriteLine("You selected option 1");
                    break;
                case 2:
                    Console.WriteLine("You selected option 2");
                    break;
                case 3:
                    Console.WriteLine("You selected option 3");
                    break;
                default:
                    Console.WriteLine("Invalid option selected");
                    break;
            }
        }
    }
}
