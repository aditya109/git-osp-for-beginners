##############################################################################
"""Python program to detect egdes : Canny Edge Detection
Code by Kavyapriya R"""
##############################################################################

import cv2
from matplotlib import pyplot as plt
import numpy as np


img = cv2.imread('data/sudoku.png', cv2.IMREAD_GRAYSCALE)
#img = cv2.cvtColor(img, cv2.COLOR_BGR2RGB)

canny = cv2.Canny(img, 100, 200)


titles = ['image', 'Canny']
images = [img, canny]

for i in range(2):
    plt.subplot(1, 2, i+1), plt.imshow(images[i], 'gray')
    plt.title(titles[i])
    plt.xticks([]),plt.yticks([])
    


plt.show()
