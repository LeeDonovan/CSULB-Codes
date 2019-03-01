#include <iostream>
#include <string>
using namespace std;


int main()
{
    string array[4];
    cout << " Please insert 4 names: " << endl;
    for(int i = 0;i < 4; i++)
    {
        cin >> array[i];
    }
    cout << "\nCombinations With 4 People" << endl;
    for(int j = 0;j < 4; j++)
    {
        cout << array[j] << ", ";
    }
    cout << endl;

    cout << "\nCombinations With 2 People" << endl;
    for(int k = 0;k<3;k++)
    {
        for (int d = 1;d <3;d++)
        {
            if(array[k] == array[d])
            {
                cout << array[k] << ", " << array[d+2]<<endl;
            }
            cout << array[k] << ", " << array[d]<<endl;
        }
    }
}