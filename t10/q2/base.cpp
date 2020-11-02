#include <iostream>

using namespace std;

class BC {
public:
  void show(void) { cout << " \n I am in base class..";  }
};

class DC :public BC {
public:
  void show(void) { cout << " \n I am in derived class..";  }
};

int main() {
  BC* ptr1;
  DC dobj;
  ptr1 = &dobj;
  ptr1->show();
}
