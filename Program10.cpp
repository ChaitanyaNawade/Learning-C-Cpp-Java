#include<iostream>
using namespace std;
class Demo
{
    public :
    int i,j,k;

   virtual void Display()
    {
        cout<<"Demo Display\n";
    }
};

class Hello : public Demo
{
    public:
    int x,y;

    void Display()
    {
        cout<<"Hello Display\n";
    }
};
int main()
{
    Demo *dp = new Hello;
    dp ->Display();
    return 0;
}