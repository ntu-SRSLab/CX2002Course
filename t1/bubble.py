def bubble(a, n):
  for i in range(n-2, -1, -1):
    for j in range(i+1):
      if a[j] > a[j+1]:
        a[j], a[j+1] = a[j+1], a[j]

def main():
  a = []
  n = int(input("\n\nEnter number of integer elements to be sorted: "))

  for i in range(n):
    value = int(input(f"\n\nEnter integer value for element no. {i+1}: "))
    a.append(value)

  bubble(a, n)

  print("\n\nFinally sorted array is: ", end="")

  for i in range(n):
    print(a[i], end=" ")


if __name__ == "__main__":
  main()
