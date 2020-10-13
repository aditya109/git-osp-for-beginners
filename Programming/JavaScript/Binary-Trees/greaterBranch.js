/********************************************************************************
***
** 
*	Data Structure: Binary Tree
*
*
*	Function: 
*       Determine which branch of a "Binary Tree" greater by sum of values
*   
*   Assumptions:
*   - Root Node Listed First
*   - Empty Leafs Listed as -1
*   - Values listed from Left to right by level in arraylist
*       ex. [1, 2, 3, 4, 5, 6] 
*           where 1 is root 
*           Row 1: 2 is first left; 3 is first right 
*           Row 2: 4 is a left leaf; 5 is a left leaf; 6 is a right leaf
**
***
*******************************************************************************/


// Test Dataset
var arr = [1,10,5,1,0,6];

function greaterBranch(arr){
    
    // Various Variables
    let i = 1;
    let level = 0;
    let numberOfNodes = 1;
    
    let right = 0;
    let left = 0;

    // Loop Through Array List
    while (i < arr.length) {

    	//Find Number of Nodes On Branch
        numberOfNodes = Math.pow(2, level);

        //Skip to Left Side
        let start = i;
        let end = start + numberOfNodes;

        //Count Left Side
        for(j = start; j < end; j++){
            if(arr[j] != -1) left += arr[i];  
        }

        //Skip to Right Side
        let startRight = i + numberOfNodes;
        let endRight = startRight + numberOfNodes;

        //Count Right Side
        for(k = startRight; k < endRight; k++){
            if(arr[k] != -1) right += arr[k];   
        }

        i = endRight;
        level++;
    }

    //Return Greater Branch
    if (right > left) return "Right";
    if (left > right) return "Left";
    return "";
}

//console.log("- " + greaterBranch(arr) + " has a greater sum of values");
