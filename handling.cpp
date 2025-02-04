#include <iostream>
#include <fstream>  // For file handling
#include <string>

using namespace std;

int main() {
    string filename = "data.txt"; // File name
    string line;

    // Writing to the file
    ofstream outFile(filename);
    if (outFile.is_open()) {
        outFile << "Hello, this is a test file.\n";
        outFile << "Sequential access example in C++.\n";
        outFile << "File handling is simple!\n";
        outFile.close();
        cout << "Data written successfully to " << filename << endl;
    } else {
        cout << "Error opening file for writing!" << endl;
        return 1;
    }

    // Reading from the file sequentially
    ifstream inFile(filename);
    if (inFile.is_open()) {
        cout << "\nReading data from file:\n";
        while (getline(inFile, line)) {
            cout << line << endl;
        }
        inFile.close();
    } else {
        cout << "Error opening file for reading!" << endl;
        return 1;
    }

    return 0;
}
