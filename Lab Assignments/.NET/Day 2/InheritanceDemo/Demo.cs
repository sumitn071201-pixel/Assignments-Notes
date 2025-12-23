
namespace InheritanceDemo
{
    internal class BaseClass
    {
        private int _baseNumber;
        // Parameterless Constructor
        public BaseClass()
        {
        }
        public BaseClass(int num)
        {
            _baseNumber = num;
            Console.WriteLine("You passed num = {0}", _baseNumber);
        }
        public void Method1()
        {
            Console.WriteLine("MEthod1 from Base CLass");
        }
    }
    internal class DerivedClass : BaseClass
    {
        // Default Constructor is called here
        public DerivedClass()
        {
        }
        // Constructor Chaining / mapping to Base Class Constructor
        public DerivedClass(int no) : base(no)
        {
        }
        public void Method2()
        {
            Console.WriteLine("MEthod2 from Derived CLass");
        }
    }
}