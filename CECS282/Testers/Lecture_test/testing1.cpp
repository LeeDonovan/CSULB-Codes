#include <string>
#include <iostream>
#include <cstring>

using namespace std;

int main()
{
    int n[] = {1,2,3};
    int n1[10] = {1,2,3}; //n1 array: remaining spaces = 0, 1|2|3|0....
    char c[] = {'s', 't', 'e','v','e'};// index 0-4 s|t|e|v|e
    char c1[] = "Steve";//c1 S|t|e|v|e|null or 0 (null terminated character array/string/cstring)
    char name[10] = "Steve";// S|t|e|v|e|null||||
    int x = strlen(name);//strlen is a function
    cout << n<<endl;//prints out address
    cout << n[1]<<endl; // prints int 2
    cout << c1<<endl;//prints out Steve
    cout << c1[1]<<endl;// prints out t
    cout << name <<endl;
    cout << x<<endl; //5
    cout << c<<endl; //prints out elements as if a string and stops at the null(end)
    return 0;
}

// int strlen1(char ar[])
// {
//     int i = 0;//i can disappear and be replaced with
//     char *start = ar;
//     int len = 0;//can take out len
//     while(ar[i] != null)//could also use 0 or '\0' | loops through array, counts and when it hits null it stops
//     //ar[i++] could do while(ar[i++]);
//     //could also do while(*ar++);
//     //return arr-start;
//     {
//         i++;
//         len++;
//     }
//     //or it can return i-1;
//     return len;
// }

int strlen(char ar[])//c++ way
{
    char *start = ar;
    while(*ar++);
    return ar-start;
}
