/*  Donovan Lee
    CECS 282 - 05
    Program 4 - BigInt
    May 9, 2019
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
    private:
        // void trim()
        // {

        // }
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
            storage.push_back('0');

                     
            
        }
        BigInt(int x)
        {
            int carry = 0;
            char digit;
            if(x >= 0)
            {
                if(x == 0)
                {
                    storage.push_back('0');
                }
                
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
////////////////////add///////////////////////////////////////////////////
        BigInt operator+(BigInt x)
        {
            vector<char> first = storage;
            vector<char> second = x.storage;
            vector<char> result;
            int maxSize;
            reverse(first.begin(),first.end());
            reverse(second.begin(),second.end());
            if (first.size() < second.size())
            {
                int comb = second.size() - first.size();
                maxSize = second.size();
                for (int i=0; i < comb; i++)
                {
                    first.push_back('0');
                }
            }
            else 
            {
                maxSize = first.size();
                int comb = first.size() - second.size();
                for (int i=0; i < comb; i++)
                {
                    second.push_back('0');
                }
            }
            string fstore(first.begin(),first.end());
            string sstore(second.begin(),second.end());

            int carry = 0;
            for(int i = 0; i < maxSize; i++)
            {
                
                int AD = (int) fstore[i] - 48;
                int BD = (int) sstore[i] - 48;
                if(AD < 0)
                {
                    AD = 0;
                }
                if(BD < 0)
                {
                    BD = 0;
                }
                int total = AD + BD + carry;
                if(total >=10)
                {
                    carry = 1;
                    int mod = total%10;
                    char digit = '0' + mod;
                    result.push_back(digit);
                }
                else
                {
                    char digit = '0' + (total);
                    carry = 0;
                    result.push_back(digit);
                }
            }
            string endgame(result.begin(),result.end());
            if (endgame[endgame.length()-1] == '0')
            {
                endgame = endgame.substr(0,endgame.length()-1);
            }
            reverse(endgame.begin(),endgame.end());
            return BigInt(endgame);
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
            vector<char> first = storage;
            vector<char> second = x.storage;
            vector<char> result;
            int maxSize;
            reverse(first.begin(),first.end());
            reverse(second.begin(),second.end());
            if (first.size() < second.size())
            {
                maxSize = second.size();
                int comb = second.size() - first.size();
                for (int i=0; i < comb; i++)
                {
                    first.push_back('0');
                }
            }
            else 
            {
                maxSize = first.size();
                int comb = first.size() - second.size();
                for (int i=0; i < comb; i++)
                {
                    second.push_back('0');
                }
            }
            
            // for(int i = 0; i <maxSize;i++)
            // {
            //     if (first.at(i) < second.at(i))
            //     {
            //         vector<char> temp = first;
            //         first = second;
            //         second = temp;
            //         break;
            //     }
            // }
            reverse(first.begin(),first.end());
            reverse(second.begin(),second.end());
            string fstore(first.begin(),first.end());
            string sstore(second.begin(),second.end());
            reverse(fstore.begin(),fstore.end());
            reverse(sstore.begin(),sstore.end());
            int carry = 0;
            for (int i = 0; i < maxSize; i++)
            {
                int AD = (int) fstore[i] - 48;
                int BD = (int) sstore[i] - 48;
                if (carry == 1)
                {
                    BD = BD + 1;
                    carry = 0;
                }
                if (AD < BD)
                {
                    AD = AD + 10;
                    char digit = '0' + (AD- BD);
                    result.push_back(digit);
                    carry = 1;
                }
                else
                {
                    if(i == maxSize && AD - BD == 0)
                    {
                        break;
                    }
                    char digit = '0' + (AD- BD);
                    result.push_back(digit);
                }
                
            }
            string endgame(result.begin(),result.end());
            if (endgame[endgame.length()-1] == '0')
            {
                endgame = endgame.substr(0,endgame.length()-1);
            }
            reverse(endgame.begin(),endgame.end());
            return BigInt(endgame);

            
        }
        
    

//////////////increment & decrement/////////////////////////////////////////////////
    BigInt operator++(int) 
    { 
        BigInt temp1=*this;
        ++(*this);
        return temp1;
    }

    // post-decrement operator
    BigInt operator--(int x) 
    { 
        BigInt temp;
        temp.storage = this->storage;
        *this = *this - 1;
        return temp;
    }

    // pre-increment operator
    BigInt operator++() 
    {
        BigInt x(1);
        *this  = *this +  x;
        return *this;
    }

  
    // pre-decrement operator
    BigInt operator--() 
    {
        BigInt x(1);
        *this = *this -  x;
        return *this;
    }

    BigInt operator+=(int x)
    {
        *this = *this + x;
        return *this;
    }

    BigInt operator*=(BigInt x)
    {
        *this = *this * x;
        return *this;
    }
/////////////bool statements//////////////////////////////////
        bool operator>(BigInt x)
        {
            if(x.storage.at(0) != '9' && storage.at(0) != '9')
            {
                if(storage.size() > x.storage.size())
                {
                    return "true";
                }
                else if(storage.size() < x.storage.size())
                {
                    return "false";
                }
                else
                {
                    string first(storage.begin(), storage.end());
                    string second(x.storage.begin(), x.storage.end());
                    for(int i = 1; i < storage.size();i++)
                    {
                        int temp = 9 - ((int)first[i]-48);
                        int temp2 = 9 -((int)second[i]-48);
                        if(temp > temp2)
                        {
                            return "true";
                        }
                        if(temp < temp2)
                        {
                            return "false";
                        }
                    }
                    return "false";
                    
                }
            }
            else if(x.storage.at(0) == '9' && storage.at(0) != '9')
            {
                return true;
            }
            else if(x.storage.at(0) != '9' && storage.at(0) == '9')
            {
                return false;
            }
            else if(x.storage.at(0) == '9' && storage.at(0) == '9')
            {
                if(storage.size() > x.storage.size())
                {
                    return false;
                }
                else if(storage.size() < x.storage.size())
                {
                    return true;
                }
                else
                {
                    string first(storage.begin(), storage.end());
                    string second(x.storage.begin(), x.storage.end());
                    for(int i = 1; i < storage.size();i++)
                    {
                        int temp = 9 - ((int)first[i]-48);
                        int temp2 = 9 -((int)second[i]-48);
                        if(temp > temp2)
                        {
                            return "false";
                        }
                        if(temp < temp2)
                        {
                            return "true";
                        }
                    }
                    return "true";
                    
                }
            }
        }

        bool operator==(BigInt x)
        {
            if(storage == x.storage)
            {
                return true;
            }
            else
            {
                return false;
            }
            
        }

        bool operator<(BigInt x)
        {
            if(storage.at(0) != '9' && x.storage.at(0) !='9')
            {
                if(storage.size() > x.storage.size())
                {
                    return false;
                }
                else if(storage.size() < x.storage.size())
                {
                    return true;
                }
                else
                {
                    string first(storage.begin(), storage.end());
                    string second(x.storage.begin(), x.storage.end());
                    for(int i = 1; i < storage.size();i++)
                    {
                        int temp = ((int)first[i]-48);
                        int temp2 = ((int)second[i]-48);
                        if(temp > temp2)
                        {
                            return false;
                        }
                        else if(temp < temp2)
                        {
                            return true;
                        }
                        
                    }
                    return false;
                }
                
            }
             else if (storage.at(0) != '9' && x.storage.at(0) == '9')
            {
                return false;
            }
            else if (storage.at(0) == '9' && x.storage.at(0) != '9')
            {
                return true;
            }
            else
            {
                if(storage.size() > x.storage.size())
                {
                    return true;
                }
                else if (storage.size() < x.storage.size())
                {
                    return false;
                }
                else
                {
                    string first(storage.begin(), storage.end());
                    string second(x.storage.begin(), x.storage.end());
                    for(int i = 1; i < storage.size();i++)
                    {
                        int temp = 9 - ((int)first[i]-48);
                        int temp2 = 9 -((int)second[i]-48);
                        if(temp > temp2)
                        {
                            return false;
                        }
                        if(temp < temp2)
                        {
                            return true;
                        }
                    }
                    return false;
                }
                
                
            }
            
        }
///////////multi *////////////////////////        
    BigInt operator*(BigInt x)
    {
        vector<char> second = x.storage;
        vector<char> first = storage;
        vector<char> temp;
        string fstore(first.begin()+1,first.end());
        string sstore(second.begin()+1,second.end());
        reverse(fstore.begin(),fstore.end());
        reverse(sstore.begin(),sstore.end());
        int counter = 0;
        int carry = 0;
        char lol;
        BigInt total;
        for(int j = 0; j< sstore.length(); j++)
        {
            temp.clear();
            for(int k = 0; k < counter;k++)
            {
                temp.push_back('0');
            }
            for(int i = 0; i<fstore.length()+1;i++)
            {
                int change =((int)fstore[i] -48);
                int change1 = ((int)sstore[j] -48);
                if(change < 0)
                {
                    change = 0;
                }
                if(change1 < 0)
                {
                    change1 = 0;
                }
                int multi = (change * change1) + carry;
                if(multi >= 10)
                {
                    int mod = multi%10;
                    string chop = to_string(multi);
                    carry = ((int)chop[0] - 48);
                    lol = '0' + mod;
                    temp.push_back(lol);
                }
                else
                {
                    carry = 0;
                    lol = '0' + multi;
                    temp.push_back(lol);
                } 
            }
            string result(temp.begin(),temp.end());
            reverse(result.begin(),result.end()); 
            total = total + BigInt(result);
            
            counter++;
        }
        if(total.storage.at(0) == '0' && total.storage.at(1) == '0')
        {
            total.storage.erase(total.storage.begin());
        }
        return total;
    } 
    void trim()
    {
        if(this->storage.at(0)== '0' && this->storage.at(1) == '0')
        {
            //cout<<"trimming...."<<endl;
            this->storage.erase(this->storage.begin());
            //cout<<"showing storage: ";
            //this->showStorage();
        }

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
                        else if( k==0 && temp <10)
                        {
                            temp = temp + 1;
                            if(temp >=10)
                            {
                                int mod = temp%10;
                                carry = 1;
                                lol = '0' + mod;
                                tog = tog + lol;
                            }
                            else
                            {
                                lol = '0' + temp;
                                tog = tog + lol;
                            }
                            
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
                    reverse(nums.begin(), nums.end());
                    string tog;
                    char lol;
                    int counter = 0;
                    for (int o = 0; o < nums.length()-1;o++)
                    {
                        counter++;
                        int temp = ((int)nums[o] - 48);
                        temp = 9 - temp;
                        temp = temp + carry;
                        if(o == 0 && temp == 9)
                        {
                            temp = temp + 1;
                            int mod = temp%10;
                            carry = 1;
                            lol = '0' + mod;
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

BigInt fact(BigInt x)
{
    //cout<<"\nEntering factorial: "<<x<<endl;
    if(x == BigInt(1) || x == BigInt(0))
    {
        return BigInt(1);
    }
    else
    {
        //cout<<"\nsubtracting: "<<x-BigInt(1)<<endl;
        x.trim();
        return x*fact(x-BigInt(1));
    }
   
}

// factorial using integer
int fact(int a)
{
    
	if (a == 0 || a == 1)
    {
        return 1;
    }
    else
    {
        return a*fact(a-1);
    }
    
}


int main()
{
    // create and display BigInts
	BigInt a;
	cout << "\ntesting BigInt a:\t" << a << endl;
	a.showStorage();
	
	BigInt b(50);
	cout << "\ntesting BigInt b(50):\t" << b << endl;
    b.showStorage();
	
	BigInt c(-37);
	cout << "\ntesting BigInt c(-37):\t" << c << endl;
    c.showStorage();
    
	BigInt d("123456789012");
	cout << "\ntesting BigInt d(\"123456789012\"):\t" << d << endl;
    d.showStorage();
    
	BigInt e("-2345");
	cout << "\ntesting BigInt e(\"-2345\"):\t" << e <<endl;
    e.showStorage();

	// do the addition operator
	BigInt sum = BigInt(10) + BigInt(20);
	cout << "\ntesting sum = BigInt(10) + BigInt(20):\t"<< sum << endl;

	// do the subtraction operator
	BigInt diff = sum - BigInt(20);
	cout << "\ntesting diff = sum - BigInt(20):\t"<< diff << endl;

	// do the x++ operator
	cout << sum++;
	cout << "\ntesting sum++:\t"<< sum << endl;

	// do the ++x operator
	cout << ++sum;
	cout << "\ntesting ++sum:\t"<< sum << endl;

	// do the x-- operator
	cout << sum--;
	cout << "\ntesting sum--:\t"<< sum << endl;

	// do the --x operator
	cout << --sum;
	cout << "\ntesting --sum:\t"<< sum << endl;

	// do the < operator
	BigInt left(24);
	BigInt right(-37);
	cout << "\ntesting left < right:\t";
	cout << "The less of "<<left<<" and "<<right<<" is " << ((left < right)? left: right) << endl;

	// do the == operator
	cout << "\ntesting left == right:\t";
	cout << left << " and " << right << ((left==right)?" are ":" are not ")<< "equal\n";

	// do the > operator
	cout << "\ntesting left > right:\t";
	cout << "The greater of "<<left<<" and "<<right<<" is " << ((left > right)? left: right) <<endl;
	
    // test the int Factorial function
	cout << "\ntesting int factorial loop:";
	for(int i = 0; i < 30; i++)
		cout << "\nfact("<<i<<") = "<<fact(i);

    cout << "\n\nLargest positive integer: "<<INT_MAX << endl;
	long long huge = LLONG_MAX;
	cout << "\nLargest positive long long: "<<huge;

    getchar();

	// test the BigInt Factorial function
	cout << "\ntesting BigInt factorial loop:";
	for(BigInt I = 0; I < BigInt(100); I++)
		cout << "\n\nfact("<<I<<") = "<<fact(I);
	
	getchar();

    	cout<< "\nHow far from the Earth to Pluto?  ";
	// 4.6 billion miles * 5280 feet per mile * 12 inches per foot
	cout << BigInt("4600000000") * BigInt(5280) * BigInt(12) << " inches"<< endl;
	
	cout<< "\nWhat is the size of the observable universe?"<<endl;
	// 93 billion light years * 
	// 365 days per year * 
	// 24 hours per day * 
	// 3600 seconds per hour * 
	// 299,792,458 meters oer second *  
	// 1000 millimeters per meter
	BigInt AcrossTheUniverse(1);
	AcrossTheUniverse *= BigInt(93) * BigInt(100000000);	// 93 * 1 billion light years
	AcrossTheUniverse *= BigInt(365);		// 365 days per year
	AcrossTheUniverse *= BigInt("24");		// 24 hours per day
	AcrossTheUniverse *= BigInt(3600);		// 3600 seconds per hour
	AcrossTheUniverse *= BigInt(299792458);	// 299,792,459 meters per second
	AcrossTheUniverse *= BigInt(1000);		// 1000 millimeters per meter
	cout << AcrossTheUniverse<<" millimeters"<<endl;

	left = BigInt(-500000);
	right = BigInt("-499999");
	cout << endl;
    
	BigInt fact99 = fact(BigInt(99));
	BigInt fact98 = fact(BigInt(98));

	BigInt diff1 = fact99 - fact98;
	BigInt diff2 = fact98 - fact99;

	cout << "\n\nfact99 = "<<fact99;
	cout << "\n\nfact98 = "<<fact98;
	cout << "\n\nfact99 - fact98 = "<< fact99 - fact98;
	cout << "\n\nfact98 - fact99 = "<< fact98 - fact99;
	cout << "\n\n(fact99 - fact98) + (fact98 - fact99) = "<<(fact99 - fact98) + (fact98 - fact99);

	cout << endl<<endl;
	if (left < right) 
		cout << left << " is less than "<<right;
	else
		cout << left << " is not less than " << right;

	cout << endl<<endl;
	if (left > right) 
		cout << left << " is greater than "<<right;
	else
		cout << left << " is not greater than " << right;
        
	cout << endl<<endl;
	if (left == right) 
		cout << left << " is equal to  "<<right;
	else
		cout << left << " is not equal to " << right;
	cout << endl;

    getchar();


	

}
