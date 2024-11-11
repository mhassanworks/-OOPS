#include <iostream>
using namespace std;

class MathOperations {
private:
    static int count; // Static member variable

public:
    // Static member function
    static int add(int a, int b) {
        count++; // Accessing static member variable
        return a + b;
    }

    // Static member function to get the count of operations
    static int getCount() {
        return count;
    }
};

// Definition of the static member variable
int MathOperations::count = 0;

int main() {
    // Calling static member function using class name
    cout << "Sum: " << MathOperations::add(10, 20) << endl;
    cout << "Sum: " << MathOperations::add(5, 15) << endl;

    // Getting the count of operations performed
    cout << "Total additions performed: " << MathOperations::getCount() << endl;

    return 0;
}
