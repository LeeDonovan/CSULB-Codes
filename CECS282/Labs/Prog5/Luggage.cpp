#include <iostream>
#include <string>
using namespace std;

class luggage
{
    protected:
            string type;
    public:
        luggage()
        {
            type = "luggage";
        }
        void display()
        {
            cout << type<<endl;
            cout<< "volume: "<<volume()<<endl;
        }
        virtual int volume() = 0;
    
};

class box : public luggage
{
    protected:
            int width,height,length;
    public:
        box(int _width, int _height, int _length)
        {
            type = "square";
            width = _width;
            height = _height;
            length = _length;
        }

        void display()
        {
            luggage::display();
            cout<<" width: "<<width<<" height: "<<height<<" length: "<<length;
            cout<<" volume: "<<volume()<<endl;
        }

        int volume()
        {
            return (height * width * length);
        }
};

class sphere : public luggage
{
    protected:
            int radius;
    public:
        sphere(int _radius)
        {
            type = "circle";
            radius = _radius;
        }
        void display()
        {
            luggage::display();
            cout<<" radius: "<<radius;
            cout<<" volume: "<<volume()<<endl;
        }
        int volume()
        {
            return (3.14 * radius * radius);
        }
};

int main()
{
    bool loop = true;
    int menuNum;
    while(loop)
    {
        cout<<"1) Add luggage to storage container\n";
        cout<<"2) Remove luggage from storage container\n";
        cout<<"3) Show all luggage\n";
        menuNum = getInt();
        if(menuNum == 1)
        {
            
        }




        if (menuNum == 5)
        {
            cout << "Goodbye.." << endl;
            loop = false;
        }
    }


}

int getInt()
{
  int integer = 0;
  bool valid = false;
  while (!valid)
  {
    if (cin >> integer)
    {
      if (integer >= 1 && integer <= 3)
        {
        valid = true;
        }
      else
      {
        cout<< "Invalid. Enter a new number from 1 to 3: ";
      }
      
    }
    else
    {
      cin.clear();
      string invalid;
      cin >> invalid;
      cout << "Invalid. Enter a number from 1 to 3: ";
    }
    
  }
  return integer;
}