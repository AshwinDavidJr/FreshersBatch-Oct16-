function pattern(a)
{
    document.write("**********")
    for(i = 0;i<a.length;i++)
    {
        document.write("*"+a[i]+"*<br>");
    }
    document.write("**********")
}


const string = new Array("hello","this","is","a","string");
pattern(string);