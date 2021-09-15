function fib(n){
    n1=0;
    n2=1;
    n3=0;
    if(n==1)
    return 1;
    else{
        while(n>0){
        n3=n1+n2;
        document.write(n3,", ");
        n1=n2;
        n2=n3;
        n--;
    }


    }
}

document.write(0,",",1,",");
fib(100);