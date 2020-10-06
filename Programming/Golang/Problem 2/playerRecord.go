package main

import "fmt"

func main(){

	var player[11]string
	var run[11]int
	var max int=0
	var index int

	for i:=0;i<11;i++{
		fmt.Print(i+1,". Player Name:")
		fmt.Scan(&player[i])
		fmt.Print("  "+player[i]+" score:")
		fmt.Scan(&run[i])
	}
	for j:=0;j<11;j++{
		if run[j]>max{
			max=run[j]
			index=j
		}else{
			continue
		}
	}
	fmt.Println("Player with highest score is "+player[index]+" with",run[index],"run")
}