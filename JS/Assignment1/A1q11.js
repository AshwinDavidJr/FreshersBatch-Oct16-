const a =[1,2,3,4,5,6,7,8,9,10];
k="Array before reversing: <br>"
for(i=0;i<a.length;i++)
{
    k+=a[i]+" ";
    //document.getElementById("first").innerHTML=k;
}
k+="<br> After reversing <br>"
for(i=a.length-1;i>=0;i--)
    k+=a[i]+" ";



document.write(k);
