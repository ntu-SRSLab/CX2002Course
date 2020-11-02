#include <iostream>

// using namespace std;
void bubble(int a[],int n)
{
  int i, j, t;
  for(i = n-2; i >= 0; i--)
    {
      for(j = 0; j <= i; j++)
        {
          if(a[j] > a[j+1])
            {
              t = a[j];
              a[j] = a[j+1];
              a[j+1] = t;
            }
        }
    }
}//end function.

int main()
{
  int a[100], n, i;

  std::cout << "\n\n Enter number of Integer elements to be sorted: ";
  std::cin >> n;

  for(i = 0; i <= n-1; i++)
    {
      std::cout << "\n\n Enter integer value for element no." << i + 1 << " ";
      std::cin >> a[i];
    }

  bubble(a,n);

  std::cout << "\n\n Finally sorted array is: ";
  for(i = 0; i <= n-1; i++)
    std::cout << a[i] << " " ;
} //end program.
