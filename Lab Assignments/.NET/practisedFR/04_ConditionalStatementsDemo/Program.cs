namespace _04_ConditionalStatementsDemo
{
    internal class Program
    {
        static void Main(string[] args)
        {
        
                //if statement example
                bool isPplClapping = true;
                if (isPplClapping)
                {
                    Console.WriteLine("*claps claps* waah waah irshad etc");
                }
                else
                {
                    Console.WriteLine("Crack a joke");
                }

                //if...else if...else statement example
                int Goals = 5;
                if (Goals < 5)
                {
                    Console.WriteLine("lets go bhai. 5 is the target");
                }
                else if (Goals <10 )
                {
                    Console.WriteLine("Good job you made it but keep pushing yo limits");
                }
                else
                {
                    Console.WriteLine("Good morning sir, todays tasks are xyz");
                }
            }
        }
    }

