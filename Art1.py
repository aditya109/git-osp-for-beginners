import turtle
""" Draw a flower in Pyhton"""

def draw_square(square):
	for i in range(0,2):
		square.forward(100)
		square.right(30)
		square.forward(100)
		square.right(150)


def draw_flower():
	window = turtle.Screen()
	window.bgcolor("#D4E6F1")

	pen = turtle.Turtle()
	pen.shape("triangle")
	pen.color("#D98880")

	for i in range(0,36):
		draw_square(pen)
		pen.right(10)
        
	
draw_flower()
