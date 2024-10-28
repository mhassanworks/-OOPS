#include <iostream>
#include <cstring>

class Student {
private:
    char* name;
    int* age;

public:
    // Constructor
    Student(const char* n, int a) {
        // Dynamically allocate memory for name and age
        name = new char[strlen(n) + 1];
        strcpy(name, n);
        
        age = new int;
        *age = a;
    }

    // Copy Constructor (Deep Copy)
    Student(const Student& other) {
        name = new char[strlen(other.name) + 1];
        strcpy(name, other.name);

        age = new int;
        *age = *(other.age);
    }

    // Destructor
    ~Student() {
        delete[] name;
        delete age;
    }

    // Display Function
    void display() const {
        std::cout << "Name: " << name << ", Age: " << *age << std::endl;
    }

    // Mutator function to set age
    void setAge(int a) {
        *age = a;
    }

    // Accessor function to get age
    int getAge() const {
        return *age;
    }
};

int main() {
    Student s1("Alice", 20);
    Student s2 = s1; // Calls the copy constructor

    std::cout << "Student 1: ";
    s1.display();

    std::cout << "Student 2 (after copying from Student 1): ";
    s2.display();

    // Modify age of s2
    s2.setAge(22);

    std::cout << "\nAfter modifying Student 2's age:\n";
    std::cout << "Student 1: ";
    s1.display();
    std::cout << "Student 2: ";
    s2.display();

    return 0;
}
