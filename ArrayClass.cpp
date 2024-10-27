#include <iostream>
using namespace std;

class ArrayClass {
private:
    int arr[5]; // Array data member with a fixed size of 5

public:
    // Constructor to initialize array elements
    ArrayClass() {
        for (int i = 0; i < 5; ++i) {
            arr[i] = 0; // Initialize all elements to 0
        }
    }

    // Function to set values of the array
    void setValues(int values[]) {
        for (int i = 0; i < 5; ++i) {
            arr[i] = values[i];
        }
    }

    // Function to display the array values
    void display() const {
        cout << "Array elements: ";
        for (int i = 0; i < 5; ++i) {
            cout << arr[i] << " ";
        }
        cout << endl;
    }
};

int main() {
    ArrayClass obj;

    // Initialize array to be set
    int values[5] = {1, 2, 3, 4, 5};
    obj.setValues(values);

    // Display the array
    obj.display();

    return 0;
}
