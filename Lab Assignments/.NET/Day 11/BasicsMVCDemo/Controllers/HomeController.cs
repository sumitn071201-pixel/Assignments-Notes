using Microsoft.AspNetCore.Mvc;

namespace BasicsMVCDemo.Controllers
{
    // /Home/Index
    public class HomeController : Controller
    {
        // Action Method
        public IActionResult Index()
        {
            return View();
        }
    }
}
