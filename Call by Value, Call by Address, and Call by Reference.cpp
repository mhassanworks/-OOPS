#include <iostream>
using namespace std;

// Call by Value
void callByValue(int x) {
    x = 100;  // This change won't affect the original variable
}

// Call by Address
void callByAddress(int* x) {
    *x = 200;  // This change will affect the original variable
}

// Call by Reference
void callByReference(int& x) {
    x = 300;  // This change will affect the original variable
}

int main() {
    int num = 10;
    
    // Call by Value
    cout << "Before callByValue: " << num << endl;
    callByValue(num);
    cout << "After callByValue: " << num << endl;
    
    // Call by Address
    cout << "\nBefore callByAddress: " << num << endl;
    callByAddress(&num);  // Passing the address of num
    cout << "After callByAddress: " << num << endl;
    
    // Call by Reference
    cout << "\nBefore callByReference: " << num << endl;
    callByReference(num);  // Passing num by reference
    cout << "After callByReference: " << num << endl;

    return 0;
}
