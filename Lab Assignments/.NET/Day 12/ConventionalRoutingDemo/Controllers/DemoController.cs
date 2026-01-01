using Microsoft.AspNetCore.Mvc;

namespace ConventionalRoutingDemo.Controllers
{
    public class DemoController : Controller
    {
        public IActionResult Index()
        {
            return View();
        }
    }
}
