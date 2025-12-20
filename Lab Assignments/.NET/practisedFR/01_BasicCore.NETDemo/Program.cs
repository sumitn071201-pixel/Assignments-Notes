namespace _01_BasicCore.NETDemo
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Wassup homie!!");

            MyClass myClass = new MyClass();
            myClass.SaySup();

        }
    }    

        public class MyClass
        {
            public void SaySup()
            {
                Console.WriteLine("supp boi, How you doin?");
            }
        } 
}
