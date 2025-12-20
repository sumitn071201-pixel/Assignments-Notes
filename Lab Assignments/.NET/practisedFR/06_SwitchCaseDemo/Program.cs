namespace _06_SwitchCaseDemo
{
    internal class Program
    {
        static void Main(string[] args)
        {

                String name = "Baburao";
                switch (name)
                {
                    case "Raju":
                        Console.WriteLine("i've completed my degree in ITUS(shyam adds to that:iski topi uske sar)");
                        break;
                    case "Baburao":
                        Console.WriteLine("Jay maharashtra");
                        break;
                    case "Shyam":
                        Console.WriteLine("Meri radha aisi nahi hai");
                        break;
                    default:
                        Console.WriteLine("Aye yede!!! tere baap ki shaadi hai kya re??");
                        break;
                }
            }
        }
    }

