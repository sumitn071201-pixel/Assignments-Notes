using Microsoft.AspNetCore.Mvc;

namespace AttributeBasedRoutingDemo.Controllers
{
    //[Route("Demo")] 
    [Route("Admin")]
    public class DemoController : Controller
    {
        [Route("Demo")]
        //URL :/Demo/Demo
        public IActionResult Demo()
        {
            return View("~/Views/Demo/Data.cshtml");
        }

        [Route("Greet")]
        //URL :/Admin/Greet
        public string SayHi()
        {
            return "Hello !!";
        }
    }
}

