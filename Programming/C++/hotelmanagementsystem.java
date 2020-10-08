#include<fstream>
#include<conio.h>
#include<string.h>
#include<iomanip>
#include<iostream>
#include<stdlib.h>
#include<windows.h>
using namespace std;
void menu();

void cursor(int x, int y)//for moving the cursor to desired location
{
   static HANDLE h = NULL;
   if(!h)
    h= GetStdHandle(STD_OUTPUT_HANDLE);
   COORD c= {x,y};
   SetConsoleCursorPosition(h,c);
}
void login()
{
    signin:
    system("cls");
    char username[10];
	system("cls");
	cursor(30,15);
	cout<<"User Name = ";
	cin>>username;
    string pass ="";
	char ch;
	cursor(30,16);
	cout <<"Password  = ";
	ch = _getch();
	while(ch != 13)
	{
		pass.push_back(ch);
		cout << '*';
		ch = _getch();
	}
	if((strcmp(username,"admin")==0) && pass == "admin")
	{
	    system("cls");
	    cursor(30,15);
		cout << "Access granted";
		getch();
		menu() ;
    }
    else
    {
        system("cls");
	    cursor(30,15);
        cout<<"Wrong Cardentials!!! Try Again....";
        getch();
        goto signin;
        getch();

    }
}

class Hotel
{
	int room_number;
	char name[30];
	char address[50];
    char phone[10];
	int nop, year, mon, day;
	public:
	    void add_cust();
	    void show_customer();
	    void modify_customer_record();
	    void report(int);

     int getRoomNumber()
     {
     	return room_number;
     }
     char* getName()
     {
     	return name;
     }
     char* getAddress()
     {
     	return address;
     }

     char* getPhone()
     {
     	return phone;
     }
};
     void Hotel:: report(int y)
     {
         cursor(7,y);
         cout<<room_number;
         cursor(16,y);
         cout<<day<<"/"<<mon<<"/"<<year;
         cursor(27,y);
         cout<<name;
         cursor(47,y);
         cout<<address;
         cursor(85,y);
         cout<<phone<<endl;
     }
	void Hotel::add_cust()
 	{
     	cout<<"\n  Room Number    : ";
        cout<<"\n  Name           : ";
        cout<<"\n  No. of Persons : ";
        cout<<"\n  Address        : ";
        cout<<"\n  Phone          : ";
        cout<<"\n  Enter the date of arrival ";
        cout<<"\n------------------------------";
        cout<<"\n  Year           : ";
        cout<<"\n  Month          : ";
        cout<<"\n  Day            : ";
        cout<<"\n\n\n-----------------------------------------------------------------";
        cout<<"\n  Room 1-25: Gen cost: Rs 850/day \t\t Room 26-50: Delux Cost Rs 1250/day \n  Room 51-75: Super Dlx Cost Rs 1450/day";
        cursor(19,1);
        cin>>room_number;
        cursor(19,2);
        cin.ignore();
        cin.getline(name,30);
        cursor(19,3);
        cin>>nop;
        cursor(19,4);
        cin.ignore();
        cin.getline(address,50);
        P:
            cursor(19,5);
            cin>>phone;
            if(strlen(phone)==10)
                {
                    cursor(19,8);
                    cin>>year;
                    cursor(19,9);
                    cin>>mon;
                    cursor(19,10);
                    cin>>day;
                }
                else
                {
                    cout<<"  Invalid Phone";
                    goto P;
                }
                cursor(2,21);
                cout<<"\t\tCustomer added Successfully...";
 	}

	void Hotel::show_customer()
	{
 		cout<<"\nRoom Number: "<<room_number;
   		cout<<"\nCustomer's Name: "<<name;
     	cout<<"\nCustomer's Address: "<<address;
     	cout<<"\nCustomer's Phone: "<<phone;
    }

	void Hotel::modify_customer_record()
    {
        cout<<"\nRoom number : "<<room_number;
        cout<<"\nModify Customer's Name : ";
        cin.ignore();
        cin.getline(name,30);
        cout<<"\nModify Customer's address: ";
        cin.ignore();
        cin.getline(address,50);
        cout<<"\nModify Customer's phone #: ";
        cin.ignore();
        cin.getline(phone,10);
     }

fstream fp;
Hotel h;

void Check_In()
{
	system("cls");
 	int option;
  	fp.open("hotel.dat",ios::out|ios::app);
   	do
    {
    	h.add_cust();
     	fp.write((char*)&h,sizeof(Hotel));
      	cout<<"\nPress 1 to add more customers.";
       	cout<<"\nPress 2 to return to main menu.\n";
        cout<<"\nOption: ";
        cin>>option;
     }while(option == 1);

     fp.close();
     if(option==2)
        menu();
}

void display_a_customer(int r_number)
{
    system("cls");
    cout<<"\n\n\tPlease Enter Customer's Room Number: ";
    cin>>r_number;
    char option;
    system("cls");
    cout<<"\nCustomer DETAILS\n";
    int check=0;
    fp.open("hotel.dat",ios::in);
    while(fp.read((char*)&h,sizeof(Hotel)))
        {
            if(h.getRoomNumber()==r_number)
            {
                h.show_customer();
                check=1;
            }
        }
    fp.close();
    if(check==0)
        {
            cout<<"\n\nCustomer does not exist";
            cout<<"\n 1.Try Again   2. Main Menu";
            cin>>option;
          	getch();
        }
}

void modify_customer()
{
          system("cls");
          int r_number;
          int found=0;
          cout<<"\n\n\tMODIFY CUSTOMER'S RECORD";
          cout<<"\n\n\tEnter The room number: ";
          cin>>r_number;
          fp.open("hotel.dat",ios::in|ios::out);
          while(fp.read((char*)&h,sizeof(Hotel)) && found==0)
          {
                    if(h.getRoomNumber()==r_number)
                    {
                               h.show_customer();
                               cout<<"\nEnter Customer's new information"<<endl;
                               h.modify_customer_record();
                               int pos=-1*sizeof(h);
                              fp.seekp(pos,ios::cur);
                              fp.write((char*)&h,sizeof(Hotel));
                              cout<<"\n\n\t Record Updated Successfully...";
                              found=1;
                    }
          }
          fp.close();
          if(found==0)
                    cout<<"\n\n Record Not Found ";
          getch();
}


void delete_customer()
{
          system("cls");
          char r_number;
          int flag=0;
          cout<<"\n\n\n\tDELETE CUSTOMER";
          cout<<"\n\nEnter The Room # of the Customer you wan to delete: ";
          cin>>r_number;
          fp.open("hotel.dat",ios::in|ios::out);
          fstream fp2;
          fp2.open("Temp.dat",ios::out);
          fp.seekg(0,ios::beg);
          while(fp.read((char*)&h,sizeof(Hotel)))
          {
                    if(h.getRoomNumber()==r_number)
                    {
                               fp2.write((char*)&h,sizeof(Hotel));
                    }
                    else
                              flag=1;
          }
          fp2.close();
          fp.close();
          remove("hotel.dat");
          rename("Temp.dat","hotel.dat");
          if(flag==1)
                    cout<<"\n\n\tRecord Deleted ...";
          else
                    cout<<"\n\nRecord not found";
          getch();
}


void disp_cust()
{
    system("cls");
    fp.open("hotel.dat",ios::in);
    if(!fp)
        {
            cout<<"ERROR!!! FILE COULD NOT BE OPEN ";
            getch();
            return;
    }
    cursor(30,2);
    cout<<"CUSTOMER LIST\n\n";
    cout<<"====================================================================================================\n";
    cout<<"  Room Number\tDate\t   Name\t\t\tAddress"<<"\t\t\t\t\tPhone"<<endl;
    cout<<"====================================================================================================\n";
    int y=7;
    while(fp.read((char*)&h,sizeof(Hotel)))
        {
            h.report(y);
            ++y;
    }
    fp.close();
    getch();
}
void menu()
{
    char ch;
    cursor(0,0);
    system("cls");
    cout<<"\n--------------------------------------------------------------------------------";
    cout<<"\n********************     Hotel Management System       *************************";
	cout<<"\n                    -----------------------------------                         ";
	cout<<"\n                St. Mary's English High School Jamshedpur                       ";
	cout<<"\n--------------------------------------------------------------------------------";
    cout<<"\n 1. Check In                                2. View Allocated Rooms           \n";
    cout<<"\n 3. Search Specific Customer Record         4. Modify Customer Record         \n";
	cout<<"\n 5. Delete Customer Record                  6. Check Out                      \n";
	cout<<"\n 7. EXIT                                                                   \n";
	cout<<"\n\n Enter your choice : ";
    cin>>ch;
    switch(ch)
    {
        case '1':
            Check_In();
            system("cls");
            break;
        case '2':
            disp_cust();
            system("cls");
            break;
        case '3':
            display_a_customer(r_number);
            break;
        case '4':
            modify_customer();
            system("cls");
           break;
        case '5':
            delete_customer();
            system("cls");
            break;
        case '6':
            exit(0);
            break;
        default:cout<<"\a";
          }
}

int main()
{
	login();
	return 0;
}
