namespace ReportDemo
{
    internal class Program
    {
        static void Main(string[] args)
        {
            #region Old code 
            //PDF pdf = new PDF();
            //pdf.GenerateReport();
            ////pdf.ParsePDF();
            ////pdf.SavePDF();// do not allow this to happen
            ////pdf.ValidatePDF();
            //DOCX docx = new DOCX();
            //docx.Parse();
            //docx.Save();
            ////docx.Validate();
            //docx.GenerateReport(); 
            #endregion

            while (true)
            {
                Console.WriteLine("Enter your choice: 1. PDF, 2. DOCX, 3. Excel, 4. XML, 5. JSON");
                int choice = Convert.ToInt32(Console.ReadLine());

                ReportFactory factory = new ReportFactory();
                Report report = factory.GetSomeReport(choice);
                report.GenerateReport();

                Console.WriteLine("Do you want to continue? 'y/n'");
                string ynChoice = Console.ReadLine();

                if (ynChoice == "n")
                {
                    break;
                }
            }
        }
    }
    public abstract class Report
    {
        protected abstract void Parse();
        protected abstract void Validate();
        protected abstract void Save();
        public virtual void GenerateReport()
        {
            // Some code to generate report
            Parse();
            Validate();
            Save();// do not allow this to happen
            Console.WriteLine("Report generated.");
        }
    }

    public abstract class SpecialReport : Report
    {
        protected abstract void ReValidate();
        public override void GenerateReport()
        {
            // Some code to generate report
            Parse();
            Validate();
            ReValidate();
            Save();// do not allow this to happen
            Console.WriteLine("Special Report generated.");
        }
    }
    public class ReportFactory
    {
        public Report GetSomeReport(int choice)
        {
            Report someReport = null;
            switch (choice)
            {
                case 1:
                    someReport = new PDF();
                    break;
                case 2:
                    someReport = new DOCX();
                    break;
                case 3:
                    someReport = new Excel();
                    break;
                case 4:
                    someReport = new XML();
                    break;
                case 5:
                    someReport = new JSON();
                    break;
                default:
                    someReport = null;
                    break;
            }
            return someReport;
        }
    }
    public class XML : SpecialReport
    {
        protected override void Parse()
        {
            // Some code to parse XML
            Console.WriteLine("XML Parsed.");
        }
        protected override void Validate()
        {
            // Some code to parse XML
            Console.WriteLine("XML Validated.");
        }
        protected override void Save()
        {
            // Some code to parse XML
            Console.WriteLine("XML Saved.");
        }
        protected override void ReValidate()
        {
            // Some code to parse PDF
            Console.WriteLine("XML Re-Validated.");
        }
    }

    public class JSON : SpecialReport
    {
        protected override void Parse()
        {
            // Some code to parse JSON
            Console.WriteLine("JSON Parsed.");
        }
        protected override void Validate()
        {
            // Some code to parse JSON
            Console.WriteLine("JSON Validated.");
        }
        protected override void Save()
        {
            // Some code to parse JSON
            Console.WriteLine("JSON Saved.");
        }
        protected override void ReValidate()
        {
            // Some code to parse JSON
            Console.WriteLine("JSON Re-Validated.");
        }

    }
    public class PDF : Report
    {
        protected override void Parse()
        {
            // Some code to parse PDF
            Console.WriteLine("PDF Parsed.");
        }
        protected override void Validate()
        {
            // Some code to parse PDF
            Console.WriteLine("PDF Validated.");
        }
        protected override void Save()
        {
            // Some code to parse PDF
            Console.WriteLine("PDF Saved.");
        }


    }
    public class DOCX : Report
    {
        protected override void Parse()
        {
            // Some code to parse DOCX
            Console.WriteLine("DOCX Parsed.");
        }
        protected override void Validate()
        {
            // Some code to parse DOCX
            Console.WriteLine("DOCX Validated.");
        }
        protected override void Save()
        {
            // Some code to parse DOCX
            Console.WriteLine("DOCX Saved.");
        }

    }

    public class Excel : Report
    {
        protected override void Parse()
        {
            // Some code to parse Excel
            Console.WriteLine("Excel parsed.");
        }
        protected override void Validate()
        {
            // Some code to parse Excel
            Console.WriteLine("Excel validated.");
        }
        protected override void Save()
        {
            // Some code to parse Excel
            Console.WriteLine("Excel Saved.");
        }

    }
}