#include<iostream>     //header file for input output stream
#include<math.h> 
#include<cmath>      
using namespace std;

int main()
{
    int a[3][3];        //2 arrays of 3 elements each so that i could use one as a column and one as a row

    for(int i=0; i<=2;i++)
    {
        for(int j=0; j<=2;j++)
        {
            cout<<"Enter array elements: ";
            cin>>a[i][j];
        }   
    }

    for(int i=0; i<=2;i++)
    {
        cout<<endl;
        for(int j=0; j<=2;j++)
        {
            cout<<*(*(a+j)+i);
            
        }
    }

    cout<<endl<<(a[0][0]+a[0][2]);
    if (a[0][0]+a[0][2]==4)
    {
        cout<<endl<<"This a matrix bruh, it aint one hundered and forty seven these are seperate numbers since ";
    }
cout<<endl;

     for(int i=0; i<=2;i++)
    {
        cout<<endl;
        for(int j=0; j<=2;j++)
        {
            cout<<*(*(a+i)+j);
            
        }
    }


    return 0;
}

/*wap to transpose(pehle array ka horizontal array ana chahiye dusre array ka vertical and visa versa
)

1 2 3
4 5 6
7 8 9

1 4 7
2 5 8
3 6 9


for(int i=0; i<=2;i++)  
    {
        for(int j=0; j<=2;j++)
        {
            cout<<"Enter array elements: "<<;
            cin>>a[i][j];
        }   
    }


    for(int i=0; i<=2;i++)
    {
        cout<<endl;
        for(int j=0; j<=2;j++)
        {
            cout<<*(*(a+j)+i);
        }
    }
}
}
i=0 ani j=0 
matbal i0 row ke j0 column mein user se input liya okay? uske baad first for loop se bahar aya aur second mein iterate hona start hua

uske baad ke j1 fir j2 column mein user input store kiya right
then loop ended and this happend for each row and stored the values in each column of the respective row

uske bad pointer referrence leke har rowth k har column ko cout kiya and har columnth ka row cout kiya








*/