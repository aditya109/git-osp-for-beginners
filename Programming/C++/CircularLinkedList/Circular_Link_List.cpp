/* Main function of the C program. */

#include <stdio.h>
#include <stdlib.h>
#define size 3

int f = -1, r = -1, queue[size], x;

void enque();
void deque();
void printque();

int main()
{
    int ch;
    do
    {
        printf("\nQueue Operations:\n");
        printf("1. Enqueue\n");
        printf("2. Dequeue\n");
        printf("3. Print queue\n");
        printf("4. EXIT\n");
        printf("Enter your choice:");
        scanf("%d", &ch);

        switch (ch)
        {
        case 1:
            enque();
            break;
        case 2:
            deque();
            break;
        case 4:
            printf("\nBye-Bye...");
            exit(0);
            break;
        case 3:
            printque();
            break;
        default:
            printf("\n!! Wrong Choice !!\n");
        }
    } while (ch != 4);
    return EXIT_SUCCESS;
}

void enque()
{
    if ((f == 0 && r == size - 1) || (r == f - 1))
    {
        printf("\n!!! QUEUE OVERFLOW !!!\n");
        return;
    }
    else if (f == -1)
    {
        f += 1;
        r += 1;
        printf("\nEnter a value:");
        scanf("%d", &queue[r]);
    }
    else if (f == 0 && r != size - 1)
    {
        r += 1;
        printf("\nEnter a value:");
        scanf("%d", &queue[r]);
    }
    else if (r == size - 1 && f != 0)
    {
        r = 0;
        printf("\nEnter a value:");
        scanf("%d", &queue[r]);
    }
    else if (r < f)
    {
        r += 1;
        printf("\nEnter a value:");
        scanf("%d", &queue[r]);
    }
}

void deque()
{
    if (f == -1)
    {
        printf("\n!!! QUEUE UNDERFLOW !!!\n");
        return;
    }
    else if (f == r)
    {
        x = queue[f];
        f = -1;
        r = -1;
        printf("\nThe deleted element is: %d", x);
        printf("\n");
    }
    else if (f == size - 1)
    {
        x = queue[f];
        f = 0;
        printf("\nThe deleted element is: %d", x);
        printf("\n");
    }
    else
    {
        x = queue[f];
        f += 1;
        printf("\nThe deleted element is: %d", x);
        printf("\n");
    }
}

void printque()
{
    if (f == -1)
    {
        printf("\n!!! QUEUE UNDERFLOW / EMPTY QUEUE !!!\n");
        return;
    }
    else
    {
        printf("\nQueue = ");
        if (f < r)
        {
            for (x = f; x <= r; x++)
                printf("%d ", queue[x]);
            printf("\n");
        }
        else if (f == r)
        {
            printf("%d ", queue[f]);
            printf("\n");
        }
        else
        {
            for (x = f; x < size; x++)
                printf("%d ", queue[x]);
            for (x = 0; x <= r; x++)
                printf("%d ", queue[x]);
            printf("\n");
        }
    }
}
