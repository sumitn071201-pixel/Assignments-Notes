#include<iostream>
#include<string>
using namespace std;

//--------------Class Hospital person------------
class HospitalPerson
{   
    private:
    string NameOfPerson;


    virtual void displayDetails() = 0 ;     // virtual function to display details
    virtual void getRole() = 0  ;           // virtual function to assign a patient with a disease to the doctor with its speacialization

};


//---------------class patient-------------
class Patient : HospitalPerson        //patient class is derived from 
{
    
    private:                          //Encapsulation of the patient attributes
    int patientId;                    //attribute 1
    string patientName;               //attribute 2
    int age;                          //attribute 3
    string illness;                   //attribute 4
    string assignedDoc;               //attribute 5




    public:                          //Making the constructor public to access and update the data using methods
    Patient construct(int id, string name, int a, string ill, string asdoc)
    
    //Initializing the variables to store data of the object/instance
    {   patientId=id;                       
        patientName=name;
        illness=ill;
        assignedDoc=asdoc;
    }

void setData(int, string, int, string, string)      //Method or function to set the data or the attributes
    {
        cin>>patientId>>patientName>>illness>>assignedDoc;
    }

void getData(int, string, int, string, string)      //Method or function to display the data or the attributes
    {
        cout<<"Patient Id: "<<patientId;
        cout<<"Patient Name: "<<patientName;
        cout<<"Patient illness: "<<illness;
        cout<<"Patient assigned Doctor: "<<assignedDoc;
        

    }
 void displayDetails() override {};
 void getRole() override {};

};

//----------class Doctor-------------
class Doctor
{
    private:
    int doctorId;
    string name; 
    string specialization;
    string listOfPatiets[30];



    public:                                     //Making the constructor public to access and update the data using methods
    Doctor construct(int did, string dname, int sp, string lpatients)
    
    {   doctorId=did;                       
        name=dname;
        specialization=sp;

    }

void enterData()
{

}


displayData()
{}


};


int main()
{
    
    Patient p1;
    p1.setData(101, "Sumit", 23, "Heart disease", "Dr. Strange" );

    
    
}