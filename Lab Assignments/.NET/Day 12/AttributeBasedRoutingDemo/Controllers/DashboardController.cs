using Microsoft.AspNetCore.Mvc;

namespace AttributeBasedRoutingDemo.Controllers
{
    [Route("[controller]")]// Token based routing
    public class DashboardController : Controller
    {
        [Route("[action]")]
        //URL:/Dashboard/GetNumber
        public int GetNumber()
        {
            return 100;
        }

        [Route("[action]/{id?}/{nm?}")]

        //URL: /Dashboard/GetString 
        //Or
        //URL :/Dashboard/GetString?Id=1111&nm=Hugh
        public string GetString(int id , string nm)
        {
            return $"Id : {id} , Name : {nm}";
        }
    }
}
