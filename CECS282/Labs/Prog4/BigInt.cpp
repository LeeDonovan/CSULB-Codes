/*  Donovan Lee
    CECS 282 - 05
    Program 4 - BigInt
    April 9, 2019
*/
#include <iostream>
#include <vector>
#include <string>
#include <iomanip>
#include <time.h>
#include <algorithm>
#include <cstring>
using namespace std;

class BigInt
{
    private: 
        vector <char> storage;
    // private:
    //     void trim()
    //     {

    //     }
        // bool isNeg()
        // {
        //     if(this.x < 0)
        //     {
        //         return true;
        //     }
        //     return false;
        // }
    public:
         void showStorage()
         {
            for(int i =0; i <storage.size();i++)
            {
                cout<<storage[i];
            } 
         }
    public:
        BigInt()
        {
            char x = '0';
            storage.push_back(x);
            storage.push_back('0');

                     
            
        }
        BigInt(int x)
        {
            int carry = 0;
            char digit;
            if(x > 0)
            {
                
                while(x>0)
                {
                    digit = x%10 + 48;  
                    storage.push_back(digit);
                    x/=10;
                }
                storage.push_back('0');
                reverse(storage.begin(),storage.end());
            } 
            else
            {
                x = x*(-1);
                string str = to_string(x);
                reverse(str.begin(),str.end());
                int len = str.length();
                for(int i = 0; i<len;i++)
                {
                    int temp =((int)str[i] -48);
                    temp = 9 - temp;
                    temp = temp + carry;
                    if(i == 0 && temp == 9)
                    {
                        temp = temp + 1;
                        int mod = temp%10;
                        carry = 1;
                        digit = '0' + mod;
                        storage.push_back(digit);
                    }
                    else if(i == 0)
                    {
                        temp = temp + 1;
                        digit = '0' + temp;
                        storage.push_back(digit);
                    }
                    else if(temp >= 10)
                    {
                        int mod = temp%10;
                        carry = 1;
                        digit = '0' + mod;
                        storage.push_back(digit);
                    }
                    else
                    {
                        carry = 0;
                        digit = '0' + temp;
                        storage.push_back(digit);
                    }
                }
                storage.push_back('9');
                reverse(storage.begin(),storage.end());

            }
            
  
        }


        BigInt(string s)
        {
            int temp;
            char digit;
            int carry = 0;
            if(s[0] != '-')
            {
                storage.push_back('0');
                for (int i = 0; i<s.length();i++)
                {
                    temp = s[i];
                    storage.push_back(temp);
                }
            }
            else
            {
                string str = s;
                str = str.substr(1,str.length());
                reverse(str.begin(),str.end());
                int len = str.length();
                for(int i = 0; i<len;i++)
                {
                    int temp =((int)str[i] -48);
                    temp = 9 - temp;
                    temp = temp + carry;
                    if(i == 0 && temp == 9)
                    {
                        temp = temp + 1;
                        int mod = temp%10;
                        carry = 1;
                        digit = '0' + mod;
                        storage.push_back(digit);
                    }
                    else if(i == 0)
                    {
                        temp = temp + 1;
                        digit = '0' + temp;
                        storage.push_back(digit);
                    }
                    else if(temp >= 10)
                    {
                        int mod = temp%10;
                        carry = 1;
                        digit = '0' + mod;
                        storage.push_back(digit);
                    }
                    else
                    {
                        carry = 0;
                        digit = '0' + temp;
                        storage.push_back(digit);
                    }
                       
                }
                storage.push_back('9');
                reverse(storage.begin(),storage.end());
            }

        }
        // BigInt operator ++()
        // {
        //     this+=1;
        //     return this;
        // }
        // BigInt operator--()
        // {
        //     this = this-1;
        // }
////////////////////add///////////////////////////////////////////////////
        BigInt operator+(BigInt x)
        {
            vector<char> second = x.storage;
            vector<char> first = storage;
            vector<char> total;
            char lol;
            int carry = 0;
            string fstore(first.begin(),first.end());
            string sstore(second.begin(),second.end());
            if(fstore[0] == sstore[0])
            {
                if(fstore.length() == sstore.length())
                {
                    reverse(fstore.begin(), fstore.end());
                    reverse(sstore.begin(), sstore.end());
                    for(int i = 0; i < fstore.length(); i++)
                    {
                        int temp =((int)fstore[i] -48);
                        int temp1 = ((int)sstore[i] -48);
                        int tempall = temp + temp1 + carry;
                        if(tempall >= 10)
                        {
                            int mod = tempall%10;
                            carry = 1;
                            lol = '0' + mod;
                            total.push_back(lol);
                        }
                        else
                        {
                            carry = 0;
                            lol = '0' + tempall;
                            total.push_back(lol);
                        }
                        
                    }
                    string xd(total.begin(),total.end());
                    reverse(xd.begin(),xd.end());
                    if(xd[0] == '0')
                    {
                        string hehe = xd.substr(1,xd.length());
                        return BigInt (hehe);
                    }
                    else
                    {
                        total.push_back('0');
                        string xd(total.begin(),total.end());
                        reverse(xd.begin(),xd.end());
                        string hehe = xd.substr(1,xd.length());
                        return BigInt (hehe);
                    }
                    
                }
                if(fstore.length() > sstore.length())
                {
                    reverse(fstore.begin(), fstore.end());
                    reverse(sstore.begin(), sstore.end());
                    for(int i = 0; i < fstore.length(); i++)
                    {
                        int temp =((int)fstore[i] -48);
                        int temp1 = ((int)sstore[i] -48);
                        if(temp1 < 0 )
                        {
                            temp1 = 0;
                        }
                        int tempall = (temp + temp1) + carry;
                        if(tempall >= 10)
                        {
                            int g = tempall%10;
                            carry = 1;
                            lol = '0' + g;
                            total.push_back(lol);
                        }
                        else
                        {
                            carry = 0;
                            lol = '0' + tempall;
                            total.push_back(lol);
                        }
                    } 
                    string xd(total.begin(),total.end());
                    reverse (xd.begin(),xd.end());
                    string hehe = xd.substr(1,xd.length());
                    return BigInt (hehe);
                }
                if(fstore.length() < sstore.length())
                {
                    reverse(fstore.begin(), fstore.end());
                    reverse(sstore.begin(), sstore.end());
                    for(int i = 0; i < sstore.length(); i++)
                    {
                        int temp =((int)fstore[i] -48);
                        int temp1 = ((int)sstore[i] -48);
                        if(temp < 0 )
                        {
                            temp = 0;
                        }
                        int tempall = (temp + temp1) + carry;
                        if(tempall >= 10)
                        {
                            int g = tempall%10;
                            carry = 1;
                            lol = '0' + g;
                            total.push_back(lol);
                        }
                        else
                        {
                            carry = 0;
                            lol = '0' + tempall;
                            total.push_back(lol);
                        }
                    } 
                    string xd(total.begin(),total.end());
                    reverse(xd.begin(),xd.end());
                    if(xd[0] == '0')
                    {
                        string hehe = xd.substr(1,xd.length());
                        return BigInt (hehe);
                    }
                    else
                    {
                        total.push_back('0');
                        string xd(total.begin(),total.end());
                        reverse(xd.begin(),xd.end());
                        string hehe = xd.substr(1,xd.length());
                        return BigInt (hehe);
                    }
                }
            }
            
        }
////////////////////////int +//////////////////////////////////////////////////////////////////
        BigInt operator+(int y)
        {
            BigInt x(y);
            vector<char> second = x.storage;
            vector<char> first = storage;
            vector<char> total;
            char lol;
            int carry = 0;
            string fstore(first.begin(),first.end());
            string sstore(second.begin(),second.end());
            if(fstore[0] == sstore[0])
            {
                if(fstore.length() == sstore.length())
                {
                    reverse(fstore.begin(), fstore.end());
                    reverse(sstore.begin(), sstore.end());
                    for(int i = 0; i < fstore.length(); i++)
                    {
                        int temp =((int)fstore[i] -48);
                        int temp1 = ((int)sstore[i] -48);
                        int tempall = temp + temp1 + carry;
                        if(tempall >= 10)
                        {
                            int mod = tempall%10;
                            carry = 1;
                            lol = '0' + mod;
                            total.push_back(lol);
                        }
                        else
                        {
                            carry = 0;
                            lol = '0' + tempall;
                            total.push_back(lol);
                        }
                        
                    }
                    string xd(total.begin(),total.end());
                    reverse(xd.begin(),xd.end());
                    if(xd[0] == '0')
                    {
                        string hehe = xd.substr(1,xd.length());
                        return BigInt (hehe);
                    }
                    else
                    {
                        total.push_back('0');
                        string xd(total.begin(),total.end());
                        reverse(xd.begin(),xd.end());
                        string hehe = xd.substr(1,xd.length());
                        return BigInt (hehe);
                    }
                    
                }
                if(fstore.length() > sstore.length())
                {
                    reverse(fstore.begin(), fstore.end());
                    reverse(sstore.begin(), sstore.end());
                    for(int i = 0; i < fstore.length(); i++)
                    {
                        int temp =((int)fstore[i] -48);
                        int temp1 = ((int)sstore[i] -48);
                        if(temp1 < 0 )
                        {
                            temp1 = 0;
                        }
                        int tempall = (temp + temp1) + carry;
                        if(tempall >= 10)
                        {
                            int g = tempall%10;
                            carry = 1;
                            lol = '0' + g;
                            total.push_back(lol);
                        }
                        else
                        {
                            carry = 0;
                            lol = '0' + tempall;
                            total.push_back(lol);
                        }
                    } 
                    string xd(total.begin(),total.end());
                    reverse (xd.begin(),xd.end());
                    string hehe = xd.substr(1,xd.length());
                    return BigInt (hehe);
                }
                if(fstore.length() < sstore.length())
                {
                    reverse(fstore.begin(), fstore.end());
                    reverse(sstore.begin(), sstore.end());
                    for(int i = 0; i < sstore.length(); i++)
                    {
                        int temp =((int)fstore[i] -48);
                        int temp1 = ((int)sstore[i] -48);
                        if(temp < 0 )
                        {
                            temp = 0;
                        }
                        int tempall = (temp + temp1) + carry;
                        if(tempall >= 10)
                        {
                            int g = tempall%10;
                            carry = 1;
                            lol = '0' + g;
                            total.push_back(lol);
                        }
                        else
                        {
                            carry = 0;
                            lol = '0' + tempall;
                            total.push_back(lol);
                        }
                    } 
                    string xd(total.begin(),total.end());
                    reverse(xd.begin(),xd.end());
                    if(xd[0] == '0')
                    {
                        string hehe = xd.substr(1,xd.length());
                        return BigInt (hehe);
                    }
                    else
                    {
                        total.push_back('0');
                        string xd(total.begin(),total.end());
                        reverse(xd.begin(),xd.end());
                        string hehe = xd.substr(1,xd.length());
                        return BigInt (hehe);
                    }
                }
            }

        }
////////////////sub -//////////////////////////////////////////////////////////
        BigInt operator-(BigInt x)
        {
            vector<char> second = x.storage;
            vector<char> first = storage;
            vector<char> turnt;
            vector<char> total;
            char digit;
            int carry = 0;
            string fstore(first.begin(),first.end());
            string sstore(second.begin(),second.end());
            string str = sstore;
            str = str.substr(1,str.length());
            reverse(str.begin(),str.end());
            int len = str.length();
            for(int i = 0; i<len;i++)
            {
                int temp =((int)str[i] -48);
                temp = 9 - temp;
                temp = temp + carry;
                if(i == 0 && temp == 9)
                {
                    temp = temp + 1;
                    int mod = temp%10;
                    carry = 1;
                    digit = '0' + mod;
                    turnt.push_back(digit);
                }
                else if(i == 0)
                {
                    temp = temp + 1;
                    digit = '0' + temp;
                    turnt.push_back(digit);
                }
                else if(temp >= 10)
                {
                    int mod = temp%10;
                    carry = 1;
                    digit = '0' + mod;
                    turnt.push_back(digit);
                }
                else
                {
                    carry = 0;
                    digit = '0' + temp;
                    turnt.push_back(digit);
                }
                    
            }
            turnt.push_back('9');
            reverse(turnt.begin(),turnt.end());
            cout<<"turnt: "<<turnt<<endl;


            // cout<< "fstore: "<<fstore<<"\nsstore: "<<sstore<<endl;
            // if(fstore.length() == sstore.length())
            // {
            //     for(int i = 0; i < fstore.length(); i++)
            //         {
            //             int temp =((int)fstore[i] -48);
            //             temp = temp - carry;
            //             cout<<"temp: "<<temp<<endl;
            //             int temp1 = ((int)sstore[i] -48);
            //             cout<<"temp1: "<<temp1<<endl;
            //             int tempall = temp - temp1;
            //             if(tempall <= 0 && i != fstore.length()-1)
            //             {
            //                 cout<<"if"<<endl;
            //                 carry = 10 + temp;
            //                 cout<<"carry: "<<carry<<endl;
            //                 tempall = carry - temp1;
            //                 //tempall = tempall - temp1;
            //                 cout<<"tempall: "<<tempall<<endl;
            //                 lol = '0' + tempall;
            //                 carry = 1;
            //                 total.push_back(lol);
            //             }
            //             else
            //             {
            //                 cout<<"else"<<endl;
            //                 carry = 0;
            //                 tempall = tempall + carry;
            //                 cout<<"tempall: "<<tempall<<endl;
            //                 lol = '0' + tempall;
            //                 total.push_back(lol);
            //             }
                        
                        
            //         }
            //         string xd(total.begin(),total.end());
            //         reverse(xd.begin(),xd.end());
            //         if(xd[0] == '0')
            //         {
            //             string hehe = xd.substr(1,xd.length());
            //             return BigInt (hehe);
            //         }
            //         else
            //         {
            //             total.push_back('0');
            //             string xd(total.begin(),total.end());
            //             reverse(xd.begin(),xd.end());
            //             string hehe = xd.substr(1,xd.length());
            //             return BigInt (hehe);
            //         }
            // }
            // if(fstore.length() > sstore.length())
            // {
            //     reverse(fstore.begin(),fstore.end());
            //     cout<<"fstore rev: "<<fstore<<endl;
            //     reverse(sstore.begin(),sstore.end());
            //     cout<<"sstore rev: "<<sstore<<endl;
            //     for(int i = 0; i < fstore.length(); i++)
            //         {
            //             cout<<"\nLoop "<<i<<endl;
            //             int temp =((int)fstore[i] -48);
            //             temp = temp - carry;
            //             cout<<"temp: "<<temp<<endl;
            //             int temp1 = ((int)sstore[i] -48);
            //             cout<<"temp1: "<<temp1<<endl;
            //             int tempall = temp - temp1;
            //             if(tempall < 0 && i != fstore.length())
            //             {
            //                 cout<<"if"<<endl;
            //                 carry = 10 + temp;
            //                 cout<<"carry: "<<carry<<endl;
            //                 tempall = carry - temp1;
            //                 //tempall = tempall - temp1;
            //                 cout<<"tempall: "<<tempall<<endl;
            //                 lol = '0' + tempall;
            //                 carry = 1;
            //                 total.push_back(lol);
            //             }
            //             else if(tempall == -48)
            //             {
            //                 tempall = 0;
            //             }
            //             else
            //             {
            //                 cout<<"else"<<endl;
            //                 carry = 0;
            //                 tempall = tempall + carry;
            //                 cout<<"tempall: "<<tempall<<endl;
            //                 lol = '0' + tempall;
            //                 total.push_back(lol);
            //             }
                        
                        
            //         }
            //         string xd(total.begin(),total.end());
            //         reverse(xd.begin(),xd.end());
            //         if(xd[0] == '0')
            //         {
            //             string hehe = xd.substr(1,xd.length());
            //             return BigInt (hehe);
            //         }
            //         else
            //         {
            //             total.push_back('0');
            //             string xd(total.begin(),total.end());
            //             reverse(xd.begin(),xd.end());
            //             string hehe = xd.substr(1,xd.length());
            //             return BigInt (hehe);
            //         }
            // }
        }
////////////////////////////////////////////cout///////////////////////////////////////////////////
        friend ostream & operator<<(ostream& o,const BigInt& x) 
        {
            int carry = 0;
            int len = x.storage.size();
            if (len-1 <= 3) 
            {
                if(x.storage.at(0) == '9')
                {
                    string nums(x.storage.begin(), x.storage.end());
                    reverse(nums.begin(),nums.end());
                    string tog;
                    char lol;
                    for(int k = 0; k <nums.length()-1;k++)
                    {
                        int temp =((int)nums[k]-48);
                        temp = 9 - temp;
                        temp = temp + carry;
                        if(k == 0 && temp == 9)
                        {
                            temp = temp + 1;
                            int mod = temp%10;
                            carry = 1;
                            lol = '0' + mod;
                            tog = tog + lol;
                        }
                        else if(temp >=10)
                        {
                            int mod = temp%10;
                            carry = 1;
                            lol = '0' + mod;
                            tog = tog + lol;
                        }
                        else
                        {
                            carry =0;
                            lol = '0' + temp;
                            tog = tog + lol; 
                        }
                    }
                    reverse(tog.begin(),tog.end());
                    o <<'-'<<tog;
                }
                else
                {   
                    string nums(x.storage.begin(), x.storage.end());
                    string tog;
                    char lol;
                    for(int k = 1; k <nums.length();k++)
                    {
                        int temp = ((int)nums[k]-48);
                        if (k==0)
                        {
                            temp = temp - 9;
                        }
                        lol = '0' + temp;
                        tog = tog + lol;
                    }
                    o <<tog;
                }
            
            }
            else if (len > 3) 
            {
                int counter = 0;
                if(x.storage.at(0) == '9')
                {
                    string nums(x.storage.begin(), x.storage.end());
                    cout<<"reg nums: "<<nums<<endl;
                    reverse(nums.begin(), nums.end());
                    cout<<"rev nums: "<<nums<<endl;
                    string tog;
                    char lol;
                    int counter = 0;
                    for (int o = 0; o < nums.length()-1;o++)
                    {
                        cout<<"\nLoop: "<<o<<endl;
                        counter++;
                        int temp = ((int)nums[o] - 48);
                        cout<<"char to int: "<<temp<<endl;
                        temp = 9 - temp;
                        cout<<"9 - int: "<<temp<<endl;
                        temp = temp + carry;
                        cout<<"temp + carry = "<<temp<<endl;
                        if(o == 0 && temp == 9)
                        {
                            cout<<"first loop"<<endl;
                            temp = temp + 1;
                            int mod = temp%10;
                            carry = 1;
                            lol = '0' + mod;
                            cout<<"adds into string: "<<lol<<endl;
                            tog = tog + lol;
                        }
                        else if (temp >= 10)
                        {
                            int mod = temp%10;
                            carry = 1;
                            lol = '0' + mod;
                            tog = tog + lol;
                        }
                        else if(o == 0)
                        {
                            temp = temp + 1;
                            lol = '0' + temp;
                            tog = tog + lol;
                        }
                        else
                        {
                            lol = '0' + temp;
                            tog = tog + lol;
                        }
                        if (counter % 3 == 0 && counter != 0 && counter != len-1) 
                        {
                            tog = tog + ',';
                        }
                        
                    }
                    reverse(tog.begin(),tog.end());
                    o<<'-'<<tog;
                }
                else
                {
                    string nums(x.storage.begin(), x.storage.end());
                    reverse(nums.begin(), nums.end());
                    string tog;
                    char lol;
                    int counter = 0;
                    for (int o = 0; o < nums.length()-1;o++)
                    {
                        counter++;
                        int temp = ((int)nums[o] - 48);
                        lol = '0' + temp;
                        tog = tog + lol;
                        if (counter % 3 == 0 && counter != 0 && counter != len-1) 
                        {
                            tog = tog + ',';
                        }
                        
                    }
                    reverse(tog.begin(),tog.end());
                    o<<tog;
                }

            }

        return o;
    }

    

        


};


int main()
{
    //BigInt b(-70);//9888
    BigInt x = BigInt(21) + BigInt(11);
    BigInt y = BigInt(40) - BigInt(20);
    //b.showStorage();
    cout << x<<endl;
    cout <<y<<endl;
    //cout<<b<<endl;

    

    return 0;

}
