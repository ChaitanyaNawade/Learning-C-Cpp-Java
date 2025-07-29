#include<iostream>
using namespace std;

class Demo
{
    public:

    int addition(int a,int b)
    {
        cout<<"Inside first function"<<"\n";
        return a+b;
    }
    int addition(int a,int b,char ch)
    {
        cout<<"inside the second function\n"<<endl;
        cout<<ch<<endl;
        return a+b;
    }

    int addition(float a,int b)
    {
        cout<<"Inside third function\n"<<endl;
        return a+b;
    }

    int addition(float a,float b)
    {
       cout<<"Inside fourth function\n"<<endl;
       return a+b;
    }
};

int main()
{
    Demo obj;
    cout<<obj.addition(10,11)<<"\n";
    cout<<obj.addition(10,11,'a')<<"\n";
    cout<<obj.addition(10.5f,10)<<"\n";
    cout<<obj.addition(100.4f,17.2f)<<"\n";
    return 0;
}