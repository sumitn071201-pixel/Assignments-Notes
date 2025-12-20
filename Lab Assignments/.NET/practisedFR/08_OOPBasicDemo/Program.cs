using One;

namespace OOP_BasicsDemo
{
    internal class Program
    {
        static void Main(string[] args)
        {
            #region Fully Qualified Name
            //One.MyClass myClassInstance = new One.MyClass();
            MyClass obj = new MyClass();
            obj.GetMessage();
            #endregion

        }
    }
}
