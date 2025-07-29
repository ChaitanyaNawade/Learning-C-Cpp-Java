#include<iostream>
using namespace std;

class Demo
{
    public :
    int i,j,k;
    static int x;
    Demo()
    {
        i = 10;
        j = 20;
        k = 30;
        cout<<"Inside the default constructor the value of i,j,k is :"<<i<<"\t"<<j<<"\t"<<k<<"\t"<<"\n";
    }
    Demo(int a, int b,int c)
    {
        this->i = a;
        this->j = b;
        this->k = c;
        cout<<"Inside the parameterized constructor the value of i,j,k is :"<<i<<"\t"<<j<<"\t"<<k<<"\t"<<"\n";
    }

    static void Display()
    {
        cout<<"Inside the static method\n";
    }
};

int Demo::x = 51;

int main()
{
    Demo::Display();
    Demo dobj1;
    Demo dobj2(10,11,12);

    cout<<"the value of i in dobj1 is "<<dobj1.i<<"\n";
    cout<<"the value of j in dobj1 is "<<dobj2.j<<"\n";
    cout<<"the value of x is "<<dobj1.x<<"\n";
  
    dobj1.Display();
    return 0;
}