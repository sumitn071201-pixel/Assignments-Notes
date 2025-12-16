namespace BoxingAndUnboxingAndTypecasting
{
    internal class Program
    {
        static void Main(string[] args)
        {
            #region Boxing

            //int x = 100; // Value Type
            //string str = "Hello World"; // Reference Type
            //Object obj1 = new object(); // Reference Type
            //// Boxing: Converting Value Type to Reference Type
            //obj1 = x;
            //Console.WriteLine(obj1);
            //str = Convert.ToString(x);// Boxing
            //string str2 = x.ToString();// Boxing 

            #endregion


            #region Unboxing
            //// Unboxing: Converting Reference Type back to Value Type
            //int x = 100;
            //Object obj1 = new object();
            //obj1 = x;
            //string str = "Hello World";
            //str = Convert.ToString(x);
            //string str2 = x.ToString();
            //int y = Convert.ToInt32(obj1); // Unboxing
            //int p = Convert.ToInt32(str2); // Unboxing
            //Console.WriteLine("Y ={0}, P ={1}", y, p); 
            #endregion


            #region Type-casting
            //double d = 9.18;
            //int num1 = Convert.ToInt32(d); // Implicit Type-casting 
            //double d2 = num1; // Explicit Type-casting
            //Console.WriteLine("d = {0}, num1 = {1}, d2 ={2}", d, num1, d2);

            //object obj2 = new object();
            //string str4 = "Someting";
            //obj2 = str4; // Implicit Type-casting
            //string str5 = obj2.ToString(); // Explicit Type-casting

            #endregion



        }
    }
}
