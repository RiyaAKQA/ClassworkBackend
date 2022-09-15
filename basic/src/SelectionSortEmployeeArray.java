class SelectionSortEmployeeArray {
    private Employee[] ar;
    private int index;
    public SelectionSortEmployeeArray(int maxSize)
    {
           ar = new Employee[maxSize];
           index = 0;
    }
    public void insert(int id, String name, int salary) {
           ar[index++] = new Employee(id, name, salary);
    }
    public void display()
    {
           for (int i = 0; i < index; i++)
                  ar[i].display();
           System.out.println("");
    }
    public void sortEmployeeByID(){
      int n=ar.length;
      for(int i=0;i<ar.length-1;i++){
        int min_index=i;
        for(int j=i+1;j<ar.length;j++){
          if(ar[j].getId()<ar[min_index].getId()){
          min_index=j;
        }
      }
      Employee temp=ar[i];
      ar[i]=ar[min_index];
      ar[min_index]=temp;
    }
    }
    public void sortEmployeeBYSALARY(){
      int n=ar.length;
      for(int i=0;i<ar.length-1;i++){
        int min_index=i;
        for(int j=i+1;j<ar.length;j++){
          if(ar[j].getSalary()<ar[min_index].getSalary()){
          min_index=j;
        }
      }
      Employee temp=ar[i];
      ar[i]=ar[min_index];
      ar[min_index]=temp;
    }
    }
    public void sortEmployeeBYNAME(){
      int n=ar.length;
      for(int i=0;i<ar.length-1;i++){
        int min_index=i;
        for(int j=i+1;j<ar.length;j++){
          if(ar[j].getName().compareTo(ar[min_index].getName())<0){
          min_index=j;
        }
      }
      Employee temp=ar[i];
      ar[i]=ar[min_index];
      ar[min_index]=temp;
    }
    }
  }
