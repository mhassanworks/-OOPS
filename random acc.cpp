#include <iostream>
#include <fstream>

using namespace std;

struct Student {
    int rollNo;
    char name[50];
    float marks;
};

void writeToFile(const char* filename) {
    ofstream outFile(filename, ios::binary | ios::app); // Open file in binary append mode
    if (!outFile) {
        cerr << "Error opening file for writing!" << endl;
        return;
    }

    Student s;
    cout << "Enter Roll No: ";
    cin >> s.rollNo;
    cin.ignore(); // Ignore newline character left by cin
    cout << "Enter Name: ";
    cin.getline(s.name, 50);
    cout << "Enter Marks: ";
    cin >> s.marks;

    outFile.write(reinterpret_cast<char*>(&s), sizeof(Student));
    outFile.close();
    cout << "Data written successfully!\n";
}

void readFromFile(const char* filename, int recordNo) {
    ifstream inFile(filename, ios::binary);
    if (!inFile) {
       
