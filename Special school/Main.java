// A quickly written program for reversing a string 
// using reverse() 
#include<iostream>
#include<string.h>
#include <bits/stdc++.h>
using namespace std; 
int main() 
{ 
    string str1;
    std::getline(std::cin,str1);
    // Reverse str[beign..end] 
    reverse(str1.begin(), str1.end()); 
    string str2;
    std::getline(std::cin,str2);
    if(str1==str2)
    cout <<"It is correct";
    else 
    cout <<"It is wrong";
    return 0; 
}