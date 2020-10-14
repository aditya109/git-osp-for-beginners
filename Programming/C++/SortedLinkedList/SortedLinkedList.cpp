#include<bits/stdc++.h>
using namespace std;


class Node{
	public:
		int data;
		Node *next;
};


void sortedInsert(Node **head_ref, Node *new_node)
{
	Node *current;
	//Special case for the head end 
	
	if(*head_ref == NULL || (*head_ref)->data>= new_node->data)
	{
		new_node->next = *head_ref;
		*head_ref = new_node;
	}
	else
	{
		//Locate the node before the point of insertion
		
		current = *head_ref;
		while(current->next!=NULL && current->next->data<new_node->data)
		{
			current = current->next;
		}
		new_node->next = current->next;
		current->next = new_node;
	}
	
}

//create a new node 

Node *newNode(int new_data)
{
	Node *new_node = new Node();
	
	new_node->data = new_data;
	new_node->next = NULL;
	
	return new_node;
	
}


void printList(Node *head)
{
	Node *temp = head;
	while(temp!=NULL)
	{
		cout<<temp->data<<" ";
		temp= temp->next;
	}
}


int main()
{
	Node *head = NULL;
	Node *new_node = newNode(5);
	sortedInsert(&head, new_node);
	new_node = newNode(10);
	sortedInsert(&head, new_node);
	new_node = newNode(7);
	sortedInsert(&head, new_node);
	new_node = newNode(4);
	sortedInsert(&head, new_node);
	new_node = newNode(2);
	sortedInsert(&head, new_node);
	new_node = newNode(11);
	
	sortedInsert(&head, new_node);
	cout<<"Created Linked list\n";
	printList(head);
	
	
	return 0;
	
}
