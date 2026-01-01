namespace ViewBag_ViewData_TempDataDemo.Models
{
    public class IETDBViewModel
    {
        // Represents data needed by a specific view
        //	A ViewModel is not your database entity or domain model.
        // It’s a special class created to represent the data and UI state required by a particular view.
        //	Think of it as a data container tailored for the view, often combining multiple models or adding extra properties (like dropdown lists, validation messages, or computed fields)

          public List<Emp> allEmps { get; set; }

          public List<Customer> allCusts { get; set; }
    }
}
