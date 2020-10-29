## This code is contributed by sahilsingh2402
## Reversed Doubly Linked List

# Program to reverse a doubly linked list 

# A node of the doubly linked list 
class Node: 
	
	# Constructor to create a new node 
	def __init__(self, data): 
		self.data = data 
		self.next = None
		self.prev = None

class DoublyLinkedList: 
	# Constructor for empty Doubly Linked List 
	def __init__(self): 
		self.head = None

	# Function reverse a Doubly Linked List 
	def reverse(self): 
		temp = None
		current = self.head 
		
		# Swap next and prev for all nodes of 
		# doubly linked list 
		while current is not None: 
			temp = current.prev 
			current.prev = current.next
			current.next = temp 
			current = current.prev 

		# Before changing head, check for the cases like 
		# empty list and list with only one node 
		if temp is not None: 
			self.head = temp.prev 
		
	# Given a reference to the head of a list and an 
	# integer,inserts a new node on the front of list 
	def push(self, new_data): 

		# 1. Allocates node 
		# 2. Put the data in it 
		new_node = Node(new_data) 

		# 3. Make next of new node as head and 
		# previous as None (already None) 
		new_node.next = self.head 

		# 4. change prev of head node to new_node 
		if self.head is not None: 
			self.head.prev = new_node 

		# 5. move the head to point to the new node 
		self.head = new_node 


	def printList(self, node):
                e_list = []
		while(node is not None): 
			t = node.data
			e_list.append(t)
			node = node.next
		str_r = ""
		for j in e_list:
                        str_r = str_r + str(j) + " "
                print(str_r)
                        

# Driver program to test the above functions 
dll = DoublyLinkedList() 
##dll.push(2); 
##dll.push(4); 
##dll.push(8); 
##dll.push(10); 



# Reverse doubly linked list 
dll.reverse() 


#dll.printList(dll.head) 

# User Input
for i in range(int(input())):
    for j in range(int(input())):
        n = int(input())
        dll.push(n)

    #dll.printList(dll.head)
    result = dll.printList(dll.head)

    
