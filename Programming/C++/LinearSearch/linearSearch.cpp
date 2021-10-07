#include <iostream>
#include <vector>
#include <algorithm>

int main()
{
    std::vector<int> numbers;
    char answer;
    do
    {
        int number;

        std::cout << "Type a number to be inserted in the list: ";
        std::cin >> number;
        numbers.push_back(number);
        std::cout << std::endl << "Would you like to add other number to the list? (Y/N) ";
        std::cin >> answer;
    }while(answer != 'N');

    std::cout << "This is the list of number that you've typed: " << std::endl;
    for(const auto& number: numbers){
        std::cout << number << "\t";
    }
    std::cout << std::endl;
    std::cout << "Please type the number that you want to search: ";
    int search;
    std::cin >> search;
    auto result = std::find(numbers.begin(), numbers.end(), search);
    
    std::cout << "The number " << search << " is ";
    if(result == numbers.end())
    {
         std::cout << "NOT ";
    }
    std::cout << "contained in the list" << std::endl;
}
