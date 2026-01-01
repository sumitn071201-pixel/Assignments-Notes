using Microsoft.AspNetCore.Mvc;

namespace ConventionalRoutingDemo.Controllers
{
    public class HomeController : Controller
    {
        public IActionResult Index()
        {
            return View();
        }

        // URL: /Home/UserCredentials?unm=Hugh Jackman&pwd=1234
        // We are passing parameters using Query String (?)

        public ActionResult<string> UserCredentials(string unm, string pwd)
        {
            return $"Username : {unm}, Password : {pwd} ";
        }
    }
}
