// Easy to understand for beginners

#include <iostream>
#include <stdlib.h>
using namespace std;

struct node {
    struct node *prev;
    int data;
    struct node *next;
} *head = NULL;

void addStart(int num)
{

    struct node *new_node= (struct node *)malloc (sizeof(struct node));



    new_node -> data=num;
    new_node -> next=NULL;
    new_node -> prev=NULL;

    if(head==NULL)
    {
        head = new_node;
        head -> next = head;
        head -> prev = head;
    }
    else
    {
        head -> prev -> next = new_node;
        new_node -> prev = head -> prev;
        new_node -> next = head;
        head -> prev = new_node;
        head = new_node;
    }
return;
}

void addEnd(int num)
{

    struct node *new_node= (struct node *)malloc (sizeof(struct node));


    new_node -> data=num;
    new_node -> next=NULL;
    new_node -> prev=NULL;

    if(head==NULL)
    {
        head = new_node;
        head -> next = head;
        head -> prev = head;
    }
    else
    {
        head -> prev -> next = new_node;
        new_node -> prev = head -> prev;
        new_node -> next = head;
        head -> prev = new_node;
    }
return;
}

void addMiddle()
{
    int num, pos,cnt=1;
    struct node *new_node= (struct node *)malloc (sizeof(struct node));
    cout<<"\nEnter position\n";
    cin >> pos;
    if(pos<1)
    {
        cout<<"\nInvalid position\n";
        return;
    }
    cout<<"\nEnter the number\n";
    cin>>num;

    new_node -> data=num;
    new_node -> next=NULL;
    new_node -> prev=NULL;

    if(head==NULL)
    {
        head = new_node;
        head -> next = head;
        head -> prev = head;
        return;
    }
    if(pos==1)
        {
            addStart(num);
            return;
        }
    if(head->next==head)
    {
       addEnd(num);
       return;
    }
    struct node *temp=head;
    while(temp->next!=head && cnt<pos)
    {
        temp=temp->next;
        cnt++;
    }
    if(temp->next==head)
    {
        addEnd(num);
        return;
    }
    else
    {
        temp -> prev -> next = new_node;
        new_node -> prev = temp -> prev;
        new_node -> next = temp;
        temp -> prev = new_node;
    }

return;
}

void delStart()
{
    if(head==NULL)
    {
        return;
    }
    if(head->next==head)
    {
        struct node *temp=head;
        head=NULL;
        free(temp);
        return;
    }


        struct node *temp=head;

        head=temp->next;
        head->prev=temp->prev;
        temp->prev->next=head;
        free(temp);

return;

}
void delEnd()
{
    if(head==NULL)
    {
        return;
    }
    if(head->next==head)
    {
        struct node *temp=head;
        head=NULL;
        free(temp);
        return;
    }


        struct node *temp=head -> prev;

        head->prev=temp->prev;
        temp->prev->next=head;
        free(temp);

return;

}

void delMiddle()
{
    int pos,cnt=0;
    struct node *temp=head;
    cout<<"Enter position\n";
    cin>>pos;

    if(temp==NULL || pos<1)
        return;

    if(pos==1)
        {
            delStart();
            return;
        }

    while(cnt<pos-1)
    {
        if(temp->next==head)
            {
                return;
            }
        temp=temp->next;
        cnt++;
    }
    temp->prev->next=temp->next;
    temp->next->prev=temp->prev;
    free(temp);

}
void show()
{
    struct node *temp= head;
    if(head == NULL)
    {
        cout<<"\nNo values\n";
        return;
    }
    while(temp -> next != head)
    {
        cout << temp -> data <<" ";
        temp = temp -> next;
    }
    cout << temp -> data<<endl;
    return;
}

int main()
{
    int num,ch=1;
    cout<<"Add values to linked list\n";
    while(ch>0&&ch<8)
    {
        cout<<"\nMenu:\n1. Addition at the start\n2. Addition in the middle\n3. Addition at the end\n";
        cout<<"4. Deletion from start\n5. Deletion from middle\n6. Deletion from end\n7. Show all values\n8. Exit\n";
        cin>>ch;
        switch(ch)
        {
            case 1: cout<<"\nEnter the number\n";
                    cin>>num;
                    addStart(num);
                    break;
            case 2: addMiddle();
                    break;
            case 3: cout<<"\nEnter the number\n";
                    cin>>num;
                    addEnd(num);
                    break;
            case 4: delStart();
                    break;
            case 5: delMiddle();
                    break;
            case 6: delEnd();
                    break;
            case 7: show();
                    break;
        }

    }
return 0;
}
