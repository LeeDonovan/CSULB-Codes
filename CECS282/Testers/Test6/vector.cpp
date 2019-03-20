#include <vector>
#include <algorithm>
#include <iostream>
#include <bits/stdc++.h> 
#include <iterator>
using namespace std;
int main()
{
    vector<int>::reverse_iterator rit;
    vector<int>::iterator it;//smart pointer
    vector <int> v;//can put any type in it | v{}
    v.push_back(3);// v{3};
    v.push_back(7);//v{3,7}
    v.push_back(9);//v{3,7,9}
    v.push_back(2);//v{3,7,9,2}
    it = v.begin();
    rit = v.rbegin();
    while(it != v.end())
    {
        cout << *it;
        it++;
    }
    while(rit != v.end())
    {
        cout << *rit;
        rit++;
    }

}