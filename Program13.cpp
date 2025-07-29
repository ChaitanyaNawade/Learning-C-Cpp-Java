#include<iostream>
using namespace std;

class Demo
{
    public :
    int i,j;

    Demo()
    {
        this->i = 10;
        this ->j = 20;
    }

    virtual void Display() = 0;
};

class Derived :public Demo
{
    public :
    int x;

    Derived()
    {
        this ->x = 30;
    }

    void Display()
    {
        cout<<"Inside the Display of Demo\n";
        cout<<i <<"\t"<<j<<"\t"<<"\n";
    }
};
int main()
{
    Demo *d = NULL;

    Derived dobj;
    d = &dobj;
    
    d->Display();
    //cout<<"The value of x inside the derived is"<<d.x<<"\n";
    return 0;
}