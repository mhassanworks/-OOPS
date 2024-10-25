#include <iostream>
using namespace std;

class Rectangle {
private:
    // Primitive data members
    int length;
    int width;

public:
    // Default constructor
    Rectangle() : length(0), width(0) {}

    // Parameterized constructor
    Rectangle(int l, int w) : length(l), width(w) {}

    // Setter methods
    void setLength(int l) {
        length = l;
    }

    void setWidth(int w) {
        width = w;
    }

    // Getter methods
    int getLength() const {
        return length;
    }

    int getWidth() const {
        return width;
    }

    // Method to calculate area
    int area() const {
        return length * width;
    }

    // Method to display details
    void display() const {
        cout << "Length: " << length << ", Width: " << width << ", Area: " << area() << endl;
    }
};

int main() {
    // Create an object of Rectangle using default constructor
    Rectangle rect1;
    rect1.setLength(5);
    rect1.setWidth(3);
    rect1.display();

    // Create an object of Rectangle using parameterized constructor
    Rectangle rect2(7, 4);
    rect2.display();

    return 0;
}
