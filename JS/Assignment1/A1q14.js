var sum = 0;
var min,max,avg=0;
var even_count=0,odd_count=0,count="";
var arr=[];
for (i =0; i<100; i++)
{
	arr.push(Math.round(Math.random() *100))

}
for (i =0; i<100; i++)
{
	sum+=arr[i];
    if(arr[i] % 2 == 1)
        odd_count++;
    else
        even_count++;

}
if(even_count>odd_count)
	count="even";
else if(even_count==odd_count)
	count="equal";
else
	count="odd";
avg=sum/100;
min=Math.min(...arr);
max=Math.max(...arr) ;
var s="maximum number:"+max+"<br>"+"minimum number:"+min+"<br>"+"highest count is:"+count+"<br>"+"sum of numbers: "+sum+"<br>"+"average of numbers is: "+avg;
document.write(s);
