using CMathLibDemo;
namespace CMathClientDemo
{
    internal class Program
    {
        static void Main(string[] args)
        {
            CMath cMath= new CMath();
            cMath.Add(10,20);
            MyMath myMath= new MyMath();
            myMath.WrapperMethod();

            AdvanceMath advanceMath= new AdvanceMath(); 
            advanceMath.AdvanceWrapperMethod();

        }
    }

    public class MyMath:CMath
    {
        public void WrapperMethod()
        {
            base.Multi(2,2);
            base.Square(2);
        }

        public void Multi(int p , int q)
        {
            base.Multi(p, q);
        }
    }
}
