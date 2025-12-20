//Declare delegate
//Define class and events
//Implement handler methods
//Subscribe handlers to events
//Trigger events and invoke handlers


namespace EventsAndDelegatesDemo
{
    public delegate void MyDelegateOfResult(int mrk);



    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Enter your Marks: ");

            Student student = new Student();


            student._Pass += new MyDelegateOfResult(student.student_Pass);
            student._Fail += new MyDelegateOfResult(student.student_Fail);

            student.Marks = Convert.ToInt32(Console.ReadLine());
            student.TriggerEvent(student.Marks);
            //MyHandler passHandler = new MyHandler(student.student_Pass);
            //MyHandler failHandler = new MyHandler(student.student_Fail);




            //student._Pass(2);// not allowed outside the type Class Student

        }
    }
    public class Student
    {

        #region 01 Approach
        //if (mrk > 40)
        //{
        //    student.student_Pass(mrk);
        //}
        //else
        //{
        //    student.student_Fail(mrk);
        //} 
        #endregion
        #region 02 Approach 
        //public int Marks
        //{
        //    set 
        //    {
        //        _Marks = value;
        //        if (_Marks > 40)
        //        {
        //            student_Pass(_Marks);
        //        }
        //        else
        //        {
        //            student_Fail(_Marks);
        //        }
        //    }
        //    get
        //    {
        //        return _Marks;
        //    }
        //} 
        #endregion
        // Event Syntax:
        // accessModifier 'event' DelegateName/EventHandlerName Event_Name
        public event MyDelegateOfResult _Pass;
        public event MyDelegateOfResult _Fail;

        private int _marks;


        public int Marks
        {
            set
            {
                _marks = value;

                //if (_marks > 40)
                //{
                //    _Pass(_marks);
                //}
                //else
                //{
                //    _Fail(_marks);
                //}


            }
            get
            {
                return _marks;
            }



        }
        public void TriggerEvent(int mrk)
        {


            if (mrk > 40)
            {
                _Pass(mrk);
            }
            else
            {
                _Fail(mrk);
            }
        }
        public void student_Pass(int marks)
        {
            Console.WriteLine($"Congrats!! you passed with {marks} marks");
        }


        public void student_Fail(int marks)
        {
            Console.WriteLine($"Congrats!! you failed with {marks} marks");
        }




    }
}
