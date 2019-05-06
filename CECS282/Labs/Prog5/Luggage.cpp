/*  Donovan Lee
    CECS 282 - 05
    Program 5 - Luggage
    May 7, 2019
*/
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
            cout << "\nType: " << type;
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
        string getType()
        {
            return type;
        }
        void display()
        {
            luggage::display();
            //cout<<" width: "<<width<<" height: "<<height<<" length: "<<length;
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
            type = "sphere";
            radius = _radius;
        }
        int getRadius()
        {
            return radius;
        }
        void display()
        {
            luggage::display();
            //cout<<" radius: "<<radius;
            cout<<" volume: "<<volume()<<endl;
        }
        string getType()
        {
            return type;
        }
        int volume()
        {
            return (3.14 * radius * radius);
        }
};
///////////child cube//////////////////////////
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
            //cout<<" width: "<<width;
            cout<<" volume: "<<volume()<<endl;
        }
        string getType()
        {
            return type;
        }
        int volume()
        {
            return (width * width * width);
        }
            
};
//////////////////////child pyramid////////////////////////////////
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
        string getType()
        {
            return type;
        }
        void display()
        {
            luggage::display();
            //cout<<" base: "<<base<<" height: "<<height;
            cout<<" volume: "<<volume()<<endl;
        }
        int volume()
        {
            return (base*height);
        }
            
};
////////////child cylinder/////////////////
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
        string getType()
        {
            return type;
        }
        void display()
        {
            luggage::display();
            //cout<<" radius: "<<radius<<" length: "<<length;
            cout<<" volume: "<<volume()<<endl;
        }
        int volume()
        {
            return (3.14 * radius * radius * length);
        }
            
};
//////////////////child rectangle//////////////////////////
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
        string getType()
        {
            return type;
        }
        void display()
        {
            luggage::display();
            //cout<<" width: "<<width<<" height: "<<height<<" length: "<<length;
            cout<<" volume: "<<volume()<<endl;
        }
        int volume()
        {
            return (width * height * length);
        }
            
};
/////////////////chile Lshape//////////////////////
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
        string getType()
        {
            return type;
        }
        void display()
        {
            luggage::display();
            //cout<<" LeftSide: "<<lside<<" RightSide: "<<rside<<" TopSide: "<<tside<<" BottomSide: "<<dside;
            cout<<" volume: "<<volume()<<endl;
        }
        int volume()
        {
            return (lside * rside * dside * tside);
        }
            
};
/////////////////child cone///////////////////////////////
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
        string getType()
        {
            return type;
        }
        void display()
        {
            luggage::display();
            //cout<<" radius: "<<radius<<" height: "<<height;
            cout<<" volume: "<<volume()<<endl;
        }
        int volume()
        {
            return (3.14 * radius * radius * (height/3));
        }
            
};
////////////////show Number of luggage and Volume Total///////////////////
void showTotal(vector <luggage*> storage)
{
    vector<luggage*>::iterator it;
    int counter = 0;
    int allV = 0;
    cout<<"\n";
    for(it = storage.begin() ; it != storage.end() ; ++it)
    {
        counter++;
        //cout << counter<<". "<<(*it)->getType() << endl;
        allV = allV + (*it)->volume();
    }
    cout<<"\nTotal Luggages: "<<counter<<" Volume of all Luggages: "<<allV<<endl;
}
/////////////Show Luggage////////////////////////////////
void showLuggage(vector <luggage*> storage)
{
    vector<luggage*>::iterator it;
    int counter = 0;
    //int allV = 0;
    cout<<"\n";
    for(it = storage.begin() ; it != storage.end() ; ++it)
    {
        counter++;
        cout << counter<<". "<<(*it)->getType() << endl;
        //allV = allV + (*it)->volume();
    }
    //cout<<"\nTotal Luggages: "<<counter<<" Volume of all Luggages: "<<allV<<endl;
}
////////////////menu for creating luggages////////////////////////////
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
        cout<<"\n1) Add luggage to storage container\n";
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
                box *b1 = new box(w,h,l);
                luggage *pointer = b1;
                storage.push_back(pointer);
            } 
            else if(addmenu == 2)
            {
                int r;
                cout<<"Set Radius of sphere: ";
                cin >> r;
                sphere *s1 = new sphere(r);
                luggage *spointer = s1;
                storage.push_back(spointer);
            }
            else if(addmenu == 3)
            {
                int w;
                cout<<"Set Width of cube: ";
                cin>>w;
                cube *c1 = new cube(w);
                luggage *cpointer = c1;
                storage.push_back(cpointer);
            }
            else if(addmenu == 4)
            {
                int b, h;
                cout<<"Set Base of pyramid: ";
                cin>>b;
                cout<<"Set Height of pyramid: ";
                cin >> h;
                pyramid *p1 = new pyramid(b,h);
                luggage *pluggage = p1;
                storage.push_back(pluggage);
            }
            else if(addmenu == 5)
            {
                int r, l;
                cout<<"Set Radius for cylinder: ";
                cin>>r;
                cout<<"Set Length for cylinder: ";
                cin>>l;
                cylinder *cy1 = new cylinder(r,l);
                luggage *cypointer = cy1;
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
                rectangle *r1 = new rectangle(w,h,l);
                luggage *rpointer = r1;
                storage.push_back(rpointer);
            }
            else if(addmenu == 7)
            {
                int l,r,t,d;
                cout<<"Set LeftSide of L-Shape: ";
                cin >> l;
                cout<<"Set RightSide of L-Shape: ";
                cin >> r;
                cout<<"Set TopSide of L-Shape: ";
                cin >> t;
                cout << "Set DownSide of L-Shape: ";
                cin>>d;
                Lshape *l1 = new Lshape(l,r,t,d);
                luggage *lpointer = l1;
                storage.push_back(lpointer);
            }
            else if(addmenu == 8)
            {
                int r, h;
                cout<<"Set Radius of Cone: ";
                cin>>r;
                cout<<"Set Height of Cone: ";
                cin>>h;
                cone *co1 = new cone(r,h);
                luggage *copointer = co1;
                storage.push_back(copointer);
            }
        }

        else if(menuNum == 2)
        {
            showLuggage(storage);
            int StoreNum;
            cout<<"\nChoose a number to remove the stored luggage: ";
            cin >> StoreNum;
            storage.erase(storage.begin() + (StoreNum-1));
            showLuggage(storage);

        }

        else if(menuNum == 3)
        {
            int size = storage.size();
            //showStorage(storage);
            for(int i = 0; i < size;i++)
            {
                luggage *temp = storage[i];
                if (temp->getType() == "box")
                {
                    box* b2 = static_cast<box*>(temp);
                    box boxTemp(b2->getWidth(), b2->getHeight(), b2->getLength());
                    boxTemp.display();
                }
                else if (temp->getType() == "sphere")
                {
                    sphere* c2 = static_cast<sphere*>(temp);
                    sphere spheretemp(c2->getRadius());
                    spheretemp.display();
                }
                else if(temp->getType() == "cube")
                {
                    cube* cu2 = static_cast<cube*>(temp);
                    cube cubeTemp(cu2->getWidth());
                    cubeTemp.display();
                }
                else if(temp->getType() == "pyramid")
                {
                    pyramid* py2 = static_cast<pyramid*>(temp);
                    pyramid pyramidTemp(py2->getBase(), py2->getHeight());
                    pyramidTemp.display();
                }
                else if(temp->getType() == "cylinder")
                {
                    cylinder* cy2 = static_cast<cylinder*>(temp);
                    cylinder cylinTemp(cy2->getRadius(), cy2->getLength());
                    cylinTemp.display();
                }
                else if(temp->getType() == "rectangle")
                {
                    rectangle* rec2 = static_cast<rectangle*>(temp);
                    rectangle recTemp(rec2->getWidth(), rec2->getHeight(),rec2->getLength());
                    recTemp.display();
                }
                else if(temp->getType() == "Lshape")
                {
                    Lshape* Ls2 = static_cast<Lshape*>(temp);
                    Lshape Ltemp(Ls2->getLside(), Ls2->getRside(),Ls2->getTside(),Ls2->getDside());
                    Ltemp.display();
                }
                else if(temp->getType() == "cone")
                {
                    cone* co2 = static_cast<cone*>(temp);
                    cone coTemp(co2->getRadius(), co2->getheight());
                    coTemp.display();
                }

            }
            showTotal(storage);
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