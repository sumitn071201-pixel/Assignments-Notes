namespace ArrayDemo
{
    internal class Program
    {
        static void Main(string[] args)
        {
            #region 1dArray

            //            Console.WriteLine("Food items:");
            //            string[] food = { "Pani Puri", "Samosa", "Biryani", "Butter Chicken Masala", "Kentucky", "Prawns" };
            //            for (int i = 0; i < 6; i++)
            //            {
            //                Console.WriteLine(food[i]);
            //            } 
            #endregion


            #region 2dArray
            int[,] arr = { { 1, 4, 2 }, { 3, 6, 8 } };
            for (int i = 0; i < 2; i++)
            {
                for (int j = 0; j < 3; j++)
                {
                    Console.Write(arr[i, j] + " ");
                }
                Console.WriteLine();
            } 
            #endregion







        }
    }
}
