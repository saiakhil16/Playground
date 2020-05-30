#include<iostream>
#include<string.h>
using namespace std;
main() {
   char str[100];
   cin.get(str, 100);
   cout << "The number of letters in the name is ";
   int count = 0;
   for(int i = 0; str[i] != '\0'; i++){
      count++;
   }
   cout << count;
}
/* program for the same using strlen 
#include<iostream>
#include<cstring>
using namespace std;
main() {
   char str[100];
   cin.get(str, 100);
   cout << "The number of letters in the name is " << strlen(str) <<endl;
}
*/