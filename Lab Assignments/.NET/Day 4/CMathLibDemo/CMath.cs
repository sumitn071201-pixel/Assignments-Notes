namespace CMathLibDemo
{
    public class CMath
    {
        //Public:available/ accessible within assembly and outside the assembly
        public void Add(int x, int y)
        {
            Console.WriteLine($"Add = {x + y} ");
        }

        // Private : accessible only with the same class/ module
        private void Sub(int x, int y)
        {
            Console.WriteLine($"Sub = {x - y} ");
        }

        // Protected -  Available with the assembly and outside the assembly: if : accessible with the hierarchy of inheritance/ derived classes: 
        protected void Multi(int x, int y)
        {
            Console.WriteLine($"Multi = {x * y} ");
        }

        //Internal: only available with the same assembly.
        internal void Div(int x, int y)
        {
            Console.WriteLine($"Div = {x/y} ");
        }

        //Protected - Internal: only available with the same assembly and within hierarchy

        protected internal void Square(int x)
        {
            Console.WriteLine($"Square = {x*x} ");
        }

    }

    public class AdvanceMath : CMath
    {
        public void AdvanceWrapperMethod()
        {
            base.Add(50, 5);
            //base.Sub(50, 5);//can't access as it is private
            base.Multi(5, 5);
            base.Div(50, 5);
            base.Square(5);
         }
    }
}
