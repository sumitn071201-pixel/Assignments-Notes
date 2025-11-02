#include<iostream>
using namespace std;

class student
{
    string name;
    int rollNo;
    int marks;

    public:
    string getname(){
        return name;
    }
    void getData()
    {

        cin>>name>>rollNo>>marks;

    }
    void setData()
    {
        cout<<name<<endl;
        cout<<rollNo<<endl;
        cout<<marks<<endl;
    }

    
};
class uniform : public student
{
    string color;
    string uniType;
    public:
    
    uniform (string c, string u)
    {
        color=c;
        uniType=u;

    }

    string getData()
    {
        cout<<"the color of uniform is: "<<color<<endl;
        cout<<"the Type of uniform is: "<<uniType<<endl;
        cout<< "Name of the student is: "<<setData();



    }

};

int main()
{
    student s1;
    s1.getData();
    s1.setData();
    uniform u("white","yes");
    u.getData();

}