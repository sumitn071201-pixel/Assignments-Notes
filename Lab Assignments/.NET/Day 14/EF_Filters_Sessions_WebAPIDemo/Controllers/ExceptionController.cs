using Microsoft.AspNetCore.Mvc;

namespace EF_Filters_Sessions_WebAPIDemo.Controllers
{
    public class ExceptionController : Controller
    {
        public IActionResult Error()
        {
            return View();
        }
    }
}