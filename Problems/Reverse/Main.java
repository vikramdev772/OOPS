// public package Reverse;

class Main {
    public static void main(String[] args) {
        System.out.println("\n\t Reverse Problem \n");
        char str[] = {'V','I','K','R','A','M'};
        System.out.println("\n\t Let string : "+new String(str));
        int l = str.length-1;
        int s=0;
        Main obj=new Main();
        obj.rev(str, s, l);
        System.out.println("\n\t Reversed String : "+new String(str));
    }
    public  void rev(char a[],int s,int l ) {
        char temp=a[s];
        a[s]=a[l];
        a[l]=temp;
        s++;
        l--;
        
        
    }
     
}

    //         	 Reverse Problem 


	//  Let string : VIKRAM

	//  Reversed String : MIKRAV


    