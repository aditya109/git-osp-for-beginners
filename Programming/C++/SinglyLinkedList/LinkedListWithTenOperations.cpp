/*
Linked list in not a linear data structure.
Applications:
Image viewer, Web browser, Music Player, acts as a base to implement complex data structures like stack, queue, graph,heaps,etc

Linked List Questions:

1) Find Middle of the Linked List
2) Delete Middle of Linked List
3) Detect Loop and Remove Loop from Linked List
4) Reverse a Linked List(Simple and  advanced)
5) If a linked list is palindrome or not
6) Detect duplicates in sorted linked list
7) Delete whole linked list
8) Seggregate even and odd nodes in a linked list
9) Intersection point of two linked list
10) Merge Sort on linked list
*/

#include<bits/stdc++.h>
using namespace std;
#define int long long

class linked_list
{
public:
    int data;
    linked_list *next;
    linked_list()
    {
        this->next = NULL;
    }
    linked_list(int data)
    {
        this->data = data;
        this->next = NULL;
    }

    linked_list *add(int data, linked_list *head)
    {
        // when the head is null
        if (head == NULL)
        {
            linked_list *temp = new linked_list(data);
            head = temp;
        }
        else
        {
            linked_list *temp = head;
            while (temp->next != NULL)
            {
                temp = temp->next;
            }
            temp->next = new linked_list(data);
        }
        return head;  // here the values are passed by value so we need to tell every time that changes have been made
    }

    void print(linked_list *head)
    {
        linked_list *temp = head;
        while (temp != NULL)
        {
            cout << temp->data << " -> ";
            temp = temp->next;
        }
        cout << "\n";
    }

    int middle_element(linked_list *head)
    {
        linked_list *slow = head;
        linked_list *fast = head;

        while (fast != NULL and fast->next != NULL)
        {
            slow = slow->next;
            fast = fast->next->next;
        }
        return slow->data;
    }

    linked_list *delete_middle(linked_list *head)
    {
        linked_list *slow = head;
        linked_list *fast = head;
        linked_list *pre = slow;

        while (fast != NULL and fast->next != NULL)
        {
            pre = slow;
            slow = slow->next;
            fast = fast->next->next;
        }
        pre->next = slow->next;
        delete slow;
        return head;
    }

    linked_list *delete_linked_list(linked_list *head)
    {
        auto pre = head;
        head = head->next;
        while (head != NULL)
        {
            delete pre;
            pre = head;
            head = head->next;
        }
        delete pre;
        return head;
    }

    void print_reverse(linked_list *head)
    {
        if (head == NULL)
            return;
        print_reverse(head->next);
        cout << head->data << " -> ";
    }

    linked_list *reverse_linkedlist(linked_list *head)
    {
        linked_list *next = NULL, *prev = NULL;

        linked_list *curr = head;

        while (curr != NULL)
        {
            next = curr->next;
            curr->next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    bool is_palindrome(linked_list* &left, linked_list *right)
    {
        if (right == NULL)
            return true;
        bool first = is_palindrome(left, right->next);

        if (first == false)
            return false;

        bool second = (right->data == left->data);
        left = left->next;
        return second;
    }

    linked_list *remove_duplicates_sorted(linked_list *head)
    {
        linked_list *curr = head;
        while (curr->next != NULL)
        {
            if (curr->data == curr->next->data)
            {
                linked_list *temp = curr->next;
                curr->next = curr->next->next;
                delete temp;
            }
            else
                curr = curr->next;
        }
        return head;
    }

    linked_list *remove_duplicates_unsorted(linked_list *head)
    {
        set<int> vis;
        linked_list *curr = head, *pre = curr;
        while (curr != NULL)
        {
            if (vis.count(curr->data))
            {
                pre->next = curr->next;
                delete curr;
            }
            else
            {
                vis.insert(curr->data);
                pre = curr;
            }
            curr = pre->next;
        }
        return head;
    }

    bool detect_loop(linked_list *head)
    {
        linked_list *slow = head, *fast = head;
        while (fast and fast->next)
        {
            slow = slow->next;
            fast = fast->next->next;
            if (fast == slow)
                return true;
        }
        return false;
    }

    linked_list *remove_loop(linked_list *head)
    {
        linked_list *slow = head, *fast = head;
        while (fast and fast->next)
        {
            slow = slow->next;
            fast = fast->next->next;
            if (slow == fast)
                break;
        }

        if (slow == fast)
        {
            slow = head;
            while (slow->next != fast->next)
            {
                slow = slow->next;
                fast = fast->next;
            }
            fast->next = NULL;
        }
        return head;
    }

    int Intersection_point(linked_list* head1, linked_list *head2)
    {
        linked_list *curr1 = head1, *curr2 = head2;
        while (curr1 != curr2)
        {
            if (curr1 == NULL)
                curr1 = head2;
            else
                curr1 = curr1->next;

            if (curr2 == NULL)
                curr2 = head1;
            else
                curr2 = curr2->next;
        }
        return curr1->data;
    }

    linked_list *odd_even(linked_list *head)
    {
        linked_list *odd = head, *even = head->next, *temp = even;
        while (even != NULL and even->next != NULL)
        {
            odd->next = even->next;
            odd = odd->next;
            even->next = odd->next;
            even = even->next;
        }
        odd->next = temp;
        return head;
    }

    linked_list *merge(linked_list *h1, linked_list *h2)
    {
        if (h1 == NULL or h2 == NULL)
        {
            return (h1 == NULL) ? h2 : h1;
        }
        if (h1->data < h2->data)
        {
            h1->next = merge(h1->next, h2);
            return h1;
        }
        else
        {
            h2->next = merge(h1, h2->next);
            return h2;
        }
    }

    linked_list *mergesort(linked_list *head)
    {
        if (head == NULL or head->next == NULL)
            return head;
        linked_list *slow = head, *fast = head, *pre = slow;
        while (fast and fast->next)
        {
            pre = slow;
            slow = slow->next;
            fast = fast->next->next;
        }
        pre->next = NULL;
        linked_list *h1 = mergesort(head);
        linked_list *h2 = mergesort(slow);

        return merge(h1, h2);

    }
};


signed main()
{
    ios_base::sync_with_stdio(false); cin.tie(0); cout.tie(0);
    linked_list *head = NULL;

    head = head->add(1, head);
    head = head->add(2, head);
    head = head->add(2, head);
    head = head->add(1, head);
    head = head->add(2, head);
    head = head->add(3, head);


    /**************************************/
    // head->print(head);

    // cout << head->middle_element(head);

    // head = head->delete_middle(head);
    // head->print(head);
    /**************************************/

    // head = head->delete_linked_list(head);
    // if (head != NULL)
    // {
    //     head->print(head);
    // }
    // else
    // {
    //     cout << "List is empty" << "\n";
    // }
    /**************************************/

    // head->print_reverse(head);

    /**************************************/

    // head = head->reverse_linkedlist(head);
    // head->print(head);

    /**************************************/

    // cout << head->is_palindrome(head, head);

    /**************************************/

    // head = head->remove_duplicates_sorted(head);
    // head->print(head);

    /**************************************/

    // head = head->remove_duplicates_unsorted(head);
    // head->print(head);

    /**************************************/

    // linked_list *curr = head;
    // while (curr->next)
    //     curr = curr->next;
    // linked_list *temp = head;
    // while (temp->data != 2)
    // {
    //     temp = temp->next;
    // }
    // curr->next = temp;
    // cout << head->detect_loop(head);

    /**************************************/

    // head->remove_loop(head);

    // cout << head->detect_loop(head);

    /**************************************/

    linked_list *head1 = NULL, *head2 = NULL;

    // Linked list 1
    head1 = head1->add(1, head1);
    head1 = head1->add(2, head1);
    head1 = head1->add(3, head1);
    head1 = head1->add(4, head1);
    head1 = head1->add(5, head1);
    //Linked list 2
    head2 = head2->add(8, head2);
    head2 = head2->add(6, head2);

    // linked_list *curr = head2, *temp = head1;

    // while (curr->next)
    //     curr = curr->next;
    // while (temp->data != 4)
    //     temp = temp->next;
    // curr->next = temp;

    // cout << head1->Intersection_point(head1, head2) << "\n";
    /**************************************/

    // head1 = head1->odd_even(head1);
    // head1->print(head1);

    head = head->mergesort(head);
    head->print(head);
    /**************************************/
    return 0;
}





