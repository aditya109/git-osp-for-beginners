#include <stdio.h> 
#include <stdlib.h> 
#include <limits.h> 

#define CAPACITY 100 

int queue[CAPACITY]; 
unsigned int size  = 0; 
unsigned int rear  = CAPACITY - 1;    
unsigned int front = 0; 

int isFull() 
{ 
    return (size == CAPACITY); 
} 

int isEmpty() 
{ 
    return (size == 0); 
} 

int enqueue(int data) 
{ 
    if (isFull())  
    { 
                return 0; 
    } 
    rear = (rear + 1) % CAPACITY; 
    size++; 
    queue[rear] = data;
    return 1; 
} 

int dequeue() 
{ 
    int data = INT_MIN; 
    if (isEmpty()) 
    { 
        return INT_MIN; 
    } 
    data = queue[front]; 
    front = (front + 1) % CAPACITY; 
    size--; 
    return data; 
} 

int peek() 
{ 
    return (isEmpty()) 
            ? INT_MIN 
            : queue[front]; 
} 

int traverse() 
{ 
    return (isEmpty()) 
            ? INT_MIN 
            : queue[rear]; 
} 

int main() 
{ 
    int ch, data; 
    while (1) 
    { 
        /* Queue menu */ 
        printf("--------------------------------------\n"); 
        printf("  QUEUE ARRAY IMPLEMENTATION PROGRAM  \n"); 
        printf("--------------------------------------\n"); 
        printf("1. Enqueue\n"); 
        printf("2. Dequeue\n"); 
        printf("3. Size\n"); 
        printf("4. Traverse\n"); 
        printf("5. Peek\n"); 
        printf("0. Exit\n"); 
        printf("--------------------------------------\n"); 
        printf("Select an option: "); 
        scanf("%d", &ch); 
        switch (ch) 
        { 
            case 1: 
                printf("\nEnter data to enqueue: "); 
                scanf("%d", &data); 
                if (enqueue(data)) 
                    printf("Element added to queue."); 
                else 
                    printf("Queue is full."); 
                break; 

            case 2: 
                data = dequeue(); 
                if (data == INT_MIN) 
                    printf("Queue is empty."); 
                else 
                    printf("Data => %d", data); 
                break; 

            case 3:  
                if (isEmpty()) 
                    printf("Queue is empty."); 
                else  
                    printf("Queue size => %d", size); 
                break; 

            case 4:  
                if (isEmpty()) 
                    printf("Queue is empty."); 
                else  
                    printf("Traverse Value => %d", traverse()); 
                break; 

            case 5:  
                if (isEmpty()) 
                    printf("Queue is empty."); 
                else  
                    printf("Peek Value => %d", peek()); 
                break; 

            case 0: 
                printf("Exiting from app.\n"); 
                exit(0); 

            default:
                printf("Invalid choice, please input number between (0-5)."); 
                break; 
        } 
        printf("\n\n"); 
    } 
} 
