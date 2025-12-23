namespace BVSAttributeDemo
{
    [AttributeUsage(AttributeTargets.Class)]
    public class BonaventureSystemsAttribute:Attribute
    {
        
        private string _CompanyName;

        public string CompanyName
        {
            get { return _CompanyName; }
            set { _CompanyName = value; }
        }

        private string _DeveloperName;

        public string DeveloperName
        {
            get { return _DeveloperName; }
            set { _DeveloperName = value; }
        }




    }
}
