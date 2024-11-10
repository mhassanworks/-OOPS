#include <iostream>
using namespace std;

class Product {
private:
    const int productID;          // Constant data member
    const string productName;     // Constant data member
    const double price;           // Constant data member

public:
    // Constructor to initialize constant data members
    Product(int id, string name, double cost) 
        : productID(id), productName(name), price(cost) {}

    // Getter methods
    int getProductID() const { return productID; }
    string getProductName() const { return productName; }
    double getPrice() const { return price; }

    // Display method
    void display() const {
        cout << "Product ID: " << productID << endl;
        cout << "Product Name: " << productName << endl;
        cout << "Price: $" << price << endl;
    }
};

int main() {
    // Creating objects of the Product class
    Product product1(101, "Laptop", 999.99);
    Product product2(102, "Smartphone", 499.49);

    // Display product details
    product1.display();
    cout << endl;
    product2.display();

    return 0;
}
