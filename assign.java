import java.util.Scanner;

class assign {
    
static boolean isPrime(int n ) {
    if(n == 1) return true;

    if (n <= 3) 
        return true; 
  
    if (n % 2 == 0 || n % 3 == 0) 
        return false; 
  
    for (int i = 5; i * i <= n; i = i + 6) {
        if (n % i == 0 || n % (i + 2) == 0)  return false; 
    }

    return true; 
}


public static void main(String[] args) {
    String [][]arr = new String[26][2];
    
    char start = 'A';

    for(int i=0;i<26;++i) {
            char val = (char)(start+i);
            arr[i][0] = Character.toString(val);
    }

    int arr_l = 0;

    for(int i=1;i<=10000 && arr_l<26;++i) {
        if(isPrime(i)) {
            arr[arr_l][1] = String.valueOf(i);
            arr_l++;
        }
    }    

    Scanner sc = new Scanner(System.in);

    String input = sc.nextLine();
    input = input.toUpperCase();

    for(int i=0;i<input.length();++i) {
        char char_at = input.charAt(i);
        int val = char_at - 'A';

        int arr_val = Integer.valueOf(arr[val][1]);
        System.out.print(Integer.toHexString(arr_val)+" ,");
    }
    System.out.println();
}

}