#include<iostream>
using namespace std;

class StringOperation 
{
    public :
        string str1;

        StringOperation(string input)
        {
            this->str1 = input;
        }

        void ReverseString()
        {
            int start = 0;
            int end = str1.length()-1;
            char temp ;

            while(start < end)
            {
                temp = str1[start];
                str1[start] = str1[end];
                str1[end] = temp;
                start++;
                end--;
            }

            cout<<"the string after reversal is : "<<str1;
        }
};

int main()
{
    string str;

    cout<<"Enter the string"<<endl;

    cin>>str;

    StringOperation sobj(str);

    sobj.ReverseString();

    return 0;
}