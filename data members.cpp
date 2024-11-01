#include <iostream>
using namespace std;

class Integer {
private:
    int* ptr;  // Pointer as a data member

public:
    // Constructor
    Integer(int value) {
        ptr = new int;  // Allocate memory dynamically
        *ptr = value;
        cout << "Constructor called, allocated memory for ptr.\n";
    }

    // Copy Constructor
    Integer(const Integer& other) {
        ptr = new int;  // Allocate new memory
        *ptr = *(other.ptr);  // Copy the value
        cout << "Copy Constructor called, deep copied ptr.\n";
    }

    // Assignment Operator
    Integer& operator=(const Integer& other) {
        if (this != &other) {  // Check for self-assignment
            delete ptr;  // Free existing memory
            ptr = new int;  // Allocate new memory
            *ptr = *(other.ptr);  // Copy the value
        }
        cout << "Assignment Operator called.\n";
        return *this;
    }

    // Destructor
    ~Integer() {
        delete ptr;  // Free allocated memory
        cout << "Destructor called, freed memory for ptr.\n";
    }

    // Set the value
    void setValue(int value) {
        *ptr = value;
    }

    // Get the value
    int getValue() const {
        return *ptr;
    }
};

int main() {
    Integer num1(10);         // Create an object with value 10
    cout << "Value of num1: " << num1.getValue() << endl;

    Integer num2 = num1;      // Copy constructor is called
    cout << "Value of num2: " << num2.getValue() << endl;

    Integer num3(20);
    num3 = num1;              // Assignment operator is called
    cout << "Value of num3 after assignment: " << num3.getValue() << endl;

    return 0;
}
