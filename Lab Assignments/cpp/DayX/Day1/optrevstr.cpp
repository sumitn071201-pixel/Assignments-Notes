//reverse string

#include <iostream>
#include <string>
#include <algorithm>
using namespace std;

int main() {
    string str;
    cout << "Enter a string: ";
    getline(cin, str);

    // Optimal: built-in reverse
    reverse(str.begin(), str.end());

    cout << "Reversed string: " << str << endl;
    return 0;
}
