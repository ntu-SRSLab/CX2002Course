#include <iostream>

class BubbleSort
{
private:
  int _size;
  int *_numArray;

public:
  BubbleSort(int nums[], int size) : _size(size) { _numArray = nums; }

  void sort()
  {
    int t;

    for (int i = _size - 2; i >= 0; i--)
    {
      for (int j = 0; j <= i; j++)
      {
        if (_numArray[j] > _numArray[j + 1])
        {
          t = _numArray[j];
          _numArray[j] = _numArray[j + 1];
          _numArray[j + 1] = t;
        }
      }
    }
  } //end function.

  ~BubbleSort() {} // destructor
};

int main()
{
  int a[100], n, i;

  std::cout << "\n\n Enter number of Integer elements to be sorted: ";
  std::cin >> n;

  for (i = 0; i <= n - 1; i++)
  {
    std::cout << "\n\n Enter integer value for element no." << i + 1 << " ";
    std::cin >> a[i];
  }

  // BubbleSort *b = new BubbleSort(a, n);
  // b->sort();

  BubbleSort b(a, n);
  b.sort();

  std::cout << "\n\n Finally sorted array is: ";
  for (i = 0; i <= n - 1; i++)
    std::cout << a[i] << " ";

  // delete b ;
} //end program.
