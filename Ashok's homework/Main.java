#include <iostream>

using namespace std;

int main()
{
    int r,c;
    std::cin>>r;
    std::cin>>c;
    int a1[r][c],a2[r][c];
    for(int i=0;i<r;i++)
    {
        for(int j=0;j<c;j++)
        {
            std::cin>>a1[i][j];
        }
    }
    for(int i=0;i<r;i++)
    {
        for(int j=0;j<c;j++)
        {
            std::cin>>a2[i][j];
        }
    }
    
    for(int i=0;i<r;i++)
    {
        for(int j=0;j<c;j++)
        {
            int x=a1[i][j]+a2[i][j];
            std::cout<<x<<" ";
        }
        std::cout<<"\n";
    }

    return 0;
}