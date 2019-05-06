#include <iostream>
#include <string>
#include <vector>
using namespace std;
/////////////////////parent/////////////////////////
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
            cout << "\n" << type<<endl;
        }
        virtual int volume() = 0;
        string getType()
        {
            return type;
        }
    
};
///////////////////////child box//////////////////////////////////////////
class box : public luggage
{
    protected:
            int width,height,length;
    public:
        box(int _width, int _height, int _length)
        {
            type = "box";
            width = _width;
            height = _height;
            length = _length;
        }
        int getWidth()
        {
            return width;
        }

        int getHeight()
        {
            return height;
        }

        int getLength()
        {
            return length;
        }

        int volume()
        {
            return (height * width * length);
        }

        void display()
        {
            //luggage::display();
            cout<<" width: "<<width<<" height: "<<height<<" length: "<<length;
            cout<<" volume: "<<volume()<<endl;
        }

};
/////////////////child sphere///////////////////////////////////////
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
        int getRadius()
        {
            return radius;
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

class cube : public luggage{
    protected:
            int width;
    public:
        cube(int _width)
        {
            type = "cube";
            width = _width;
        }
        int getWidth()
        {
            return width;
        }
        void display()
        {
            luggage::display();
            cout<<" width: "<<width;
            cout<<" volume: "<<volume()<<endl;
        }
        int volume()
        {
            return (width * width * width);
        }
            
};

class pyramid : public luggage{
    protected:
            int base, height;
    public:
        pyramid(int _base,  int _height)
        {
            type = "pyramid";
            base = _base;
            height = _height;
        }
        int getBase()
        {
            return base;
        }
        int getHeight()
        {
            return height;
        }
        void display()
        {
            luggage::display();
            cout<<" base: "<<base<<" height: "<<height;
            cout<<" volume: "<<volume()<<endl;
        }
        int volume()
        {
            return (base*height);
        }
            
};

class cylinder : public luggage{
    protected:
            int radius, length;
    public:
        cylinder(int _radius, int _length)
        {
            type = "cylinder";
            radius = _radius;
            length = _length;
        }
        int getRadius()
        {
            return radius;
        }
        int getLength()
        {
            return length;
        }
        void display()
        {
            luggage::display();
            cout<<" radius: "<<radius<<" length: "<<length;
            cout<<" volume: "<<volume()<<endl;
        }
        int volume()
        {
            return (3.14 * radius * radius * length);
        }
            
};

class rectangle : public luggage{
    protected:
            int width, height, length;
    public:
        rectangle(int _width, int _height, int _length)
        {
            type = "rectangle";
            width = _width;
            height = _height;
            length = _length;
        }
        int getWidth()
        {
            return width;
        }
        int getHeight()
        {
            return height;
        }
        int getLength()
        {
            return length;
        }
        void display()
        {
            luggage::display();
            cout<<" width: "<<width<<" height: "<<height<<" length: "<<length;
            cout<<" volume: "<<volume()<<endl;
        }
        int volume()
        {
            return (width * height * length);
        }
            
};

class Lshape : public luggage{
    protected:
            int lside, rside, tside, dside;
    public:
        Lshape(int _lside, int _rside, int _tside, int _dside)
        {
            type = "Lshape";
            lside = _lside;
            rside = _rside;
            tside = _tside;
            dside = _dside;
        }
        int getLside()
        {
            return lside;
        }
        int getRside()
        {
            return rside;
        }
        int getTside()
        {
            return tside;
        }
        int getDside()
        {
            return dside;
        }
        void display()
        {
            luggage::display();
            cout<<" LeftSide: "<<lside<<" RightSide: "<<rside<<" TopSide: "<<tside<<" BottomSide: "<<dside;
            cout<<" volume: "<<volume()<<endl;
        }
        int volume()
        {
            return (lside * rside * dside * tside);
        }
            
};

class cone : public luggage{
    protected:
            int radius, height;
    public:
        cone(int _radius, int _height)
        {
            type = "cone";
            radius = _radius;
            height = _height;
        }
        int getRadius()
        {
            return radius;
        }
        int getheight()
        {
            return height;
        }
        void display()
        {
            luggage::display();
            cout<<" radius: "<<radius<<" height: "<<height;
            cout<<" volume: "<<volume()<<endl;
        }
        int volume()
        {
            return (3.14 * radius * radius * (height/3));
        }
            
};


void menu()
{
    cout<<"1. Box\n";
    cout<<"2. Sphere\n";
    cout<<"3. Cube\n";
    cout<<"4. Pyramid\n";
    cout<<"5. Cylinder\n";
    cout<<"6. Rectangle\n";
    cout<<"7. Lshape\n";
    cout<<"8. Cone\n";

}


int getInt();
/////////////////main//////////////////////////////////
int main()
{
    vector <luggage*> storage;
    bool loop = true;
    int menuNum;
    while(loop)
    {
        cout<<"1) Add luggage to storage container\n";
        cout<<"2) Remove luggage from storage container\n";
        cout<<"3) Show all luggage\n";
        cout<<"4) Quit\n";
        menuNum = getInt();
        if(menuNum == 1)
        {
            menu();
            int addmenu;
            cin >> addmenu;
            if(addmenu == 1)
            {
                int w, h, l;
                cout<<"Set Width of box: ";
                cin >> w;
                cout<<"Set Height of box: ";
                cin>>h;
                cout<<"Set Length of box: ";
                cin>>l;
                box b1(w,h,l);
                luggage *pointer = &b1;
                storage.push_back(pointer);
            } 
            else if(addmenu == 2)
            {
                int r;
                cout<<"Set Radius of sphere: ";
                cin >> r;
                sphere s1(r);
                luggage *spointer = &s1;
                storage.push_back(spointer);
            }
            else if(addmenu == 3)
            {
                int w;
                cout<<"Set Width of cube: ";
                cin>>w;
                cube c1(w);
                luggage *cpointer = &c1;
                storage.push_back(cpointer);
            }
            else if(addmenu == 4)
            {
                int b, h;
                cout<<"Set Base of pyramid: ";
                cin>>b;
                cout<<"Set Height of pyramid: ";
                cin >> h;
                pyramid p1(b,h);
                luggage *pluggage = &p1;
                storage.push_back(pluggage);
            }
            else if(addmenu == 5)
            {
                int r, l;
                cout<<"Set Radius for cylinder: ";
                cin>>r;
                cout<<"Set Length for cylinder: ";
                cin>>l;
                cylinder cy1(r,l);
                luggage *cypointer = &cy1;
                storage.push_back(cypointer);
            }
            else if(addmenu == 6)
            {
                int w, h, l;
                cout<<"Set Width of rectangle: ";
                cin >> w;
                cout<<"Set Height of rectangle: ";
                cin>>h;
                cout<<"Set Length of rectangle: ";
                cin>>l;
                rectangle r1(w,h,l);
                luggage *rpointer = &r1;
                storage.push_back(rpointer);
            }
            else if(addmenu == 7)
            {
                
            }
        }
        else if(menuNum == 3)
        {
            int size = storage.size();
            for(int i = 0; i < size;i++)
            {
                luggage *temp = storage[i];
                if (temp->getType() == "box")
                {
                    box* b2 = static_cast<box*>(temp);
                    box boxTemp(b2->getWidth(), b2->getHeight(), b2->getLength());
                    boxTemp.display();
                }
                else if (temp->getType() == "triangle")
            }
        }




        else
        {
            cout << "Goodbye.." << endl;
            loop = false;
        }
    }


}
/////////////////////////////////user validation////////////////////////////////////////
int getInt()
{
  int integer = 0;
  bool valid = false;
  while (!valid)
  {
    if (cin >> integer)
    {
      if (integer >= 1 && integer <= 4)
        {
        valid = true;
        }
      else
      {
        cout<< "Invalid. Enter a new number from 1 to 4: ";
      }
      
    }
    else
    {
      cin.clear();
      string invalid;
      cin >> invalid;
      cout << "Invalid. Enter a number from 1 to 4: ";
    }
    
  }
  return integer;
}