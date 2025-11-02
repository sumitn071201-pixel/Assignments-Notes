#include <iostream> //inlcuding the header file for input output
using namespace std;//adds std::

int main() {
    int rows;      // defined a variable to store the value of rows

    cout << "Enter the number of rows: "; //to show on the console whatever is inside the string ""
    cin >> rows;    //storing variable in the variable defined earlier

    for (int i = 0; i < rows; i++) // first loop iterates for each row 
    
    {
        // Print spaces for alignment of the values to look like a triangle
        for (int j = 0; j < rows - i - 1; j++) 
        {
            cout << " ";
        }

        int value = 1; // First value in each row is always 1
        //this loop is used to 
        for (int j = 0; j <= i; j++) 
        {
            cout << value << " ";
            value = value * (i - j) / (j + 1); // Calculate next value in the row
        }
        cout << endl;
    }

    return 0;
}