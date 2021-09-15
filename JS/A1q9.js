function concatenate(a,b){
   let arr3 = new Array;
   for(i = 0,j=0,k=0;i<a.length&&j<b.length&&k<(a.length+b.length);i++,j++,k++){
       arr3[k]=a[i];
       arr3[++k]=b[i];
   }
   return arr3;

    }
    
    let arr1 = [0, 1, 2];
    let arr2 = ["a", "b", "c"];
    document.write(concatenate(arr1,arr2));
    console.log(concatenate(arr1,arr2));